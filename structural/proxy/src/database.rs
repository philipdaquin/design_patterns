use std::sync::{Arc, Mutex};

use rusqlite::{Connection, types::{FromSql, ToSql}, Result};

struct Database { 
    connection: Connection
}

impl Database { 
    fn new(connection: Connection) -> Self  {
        Self { 
            connection
        }
    }

    fn execute_query<T: FromSql>(&self, query: &str, params: &[&dyn ToSql]) -> Result<Vec<T>> { 
        let mut statement = self.connection.prepare(query)?;
        let mut rows = statement.query(params)?;
        let mut res = Vec::new();

        while let Some(row) = rows.next()? { 
            let val = row.get(0)?;
            res.push(val);
        }
        Ok(res)
    }

}

/// In general, Arc and Mutex are both used for 
/// multithreaded environment as opposed to using references 
/// 
/// This would be useful if you have multiple threads that will be interacting with the database at the same time
struct DatabaseProxy { 
    database: Arc<Mutex<Option<Database>>>
}

///
/// Database Proxy acts as an intermediary between a client and a real subject
/// 
/// Benefits:
/// 
/// - Decoupling: 
///     The proxy can decouple the client code from the real subject, by encapsulating the complexity 
///     of the underlying system and providn g a simpler interface to the client 
///     This alows the real subject to be replaced or upgraded without affecting the client code 
/// 
/// - Concurrency:
///     The proxy can be used to provide a safe way to share the connection to the real subject among 
///     multiple threads. 
/// 
/// - Caching: 
///     The proxy can cache the results of certain operations, so that future requests for the same data can be served faster
/// 
/// - Logging and Auditing
///     The proxy can log or audit all requests and responses, providing an easy way to track and diagnose issues or to keep 
///     an history of interactions
/// 
/// 
/// 
impl DatabaseProxy {
    /// Allow the user to choose to pick a database
    fn new() -> Self { 
        Self { 
            database: Arc::new(Mutex::new(None))
        }
    }
    fn connect(&mut self, connection: Option<Connection>) { 
        let mut database = self.database.lock().expect("Unable to access database");

        if let Some(conn) = connection { 
            *database = Some(Database::new(conn))
        } 
    }

    fn execute_query<T: FromSql>(&self, query: &str, params: &[&dyn ToSql]) -> Result<Vec<T>> {  
        let mut database = self.database.lock().unwrap();
        
        if let Some(db) = database.as_ref().as_deref() { 
            return Ok(db.execute_query(query, params)?)
        }
        
        println!("Failed to connect to any database");

        Ok(vec![])
        
    }
}
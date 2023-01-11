

pub struct RemoteServer { 
    ip: String
}

impl RemoteServer { 
    pub fn new(ip: String) -> Self { 
        Self { 
            ip
        }
    }
    pub fn serve(&self) { 
        println!("Server at {{self.ip}} is serving.")
    }
}

/// Remote Proxy struct acts as the proxy and represents the remove 
/// server locally. It can be used to connect to the remote server by providing its IP
/// address
pub struct RemoteProxy { 
    server: Option<RemoteServer>
}

impl RemoteProxy { 
    /// Set Default value to Null
    pub fn new() -> Self { 
        Self { 
            server: None
        }
    }
    pub fn connect(&mut self, ip: &str) { 
        println!("Connecting to server {ip}");
        self.server = Some(RemoteServer::new(ip.to_string()));
    }
    
    pub fn serve(&self) { 
        if let Some(server) = &self.server { 
            server.serve()
        }
        println!("Not connected to any server")
    }
}


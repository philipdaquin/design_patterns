use crate::server::RemoteProxy;

///
///     Proxy 
///     Is a structural design pattern that lets you provide a substitute
///     or placeholder for another object.  
///     
///     A proxy controls access to the original object, allowing you to perform something 
///     either before or after the request get through to the original object
/// 
///     It suggests that you create a new proxy class with the same interface as an original 
///     service object. Then you update your app so that it it then passes the proxy 
///     object to all of the orignal object's clients. 
/// 
///     Upon receiving a request from a client , the proxy creates a real service object and delegates all the work to it
/// 
///     Example:
///     The proxy disguises itself as a database object. It can handle lazy initialisation 
///     and result caching wihtout the cleint or the real database object even knownign 
///  

mod database;
mod server;
fn main() {
    
    let mut client = RemoteProxy::new();
    client.connect("182.123.123");
    client.serve();
    


    println!("Hello, world!");

}

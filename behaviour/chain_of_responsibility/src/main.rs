use crate::abstract_logger::{ErrorLogger, AbstractLogger, ConsoleLogger};


/**
 *    Chain of Responsibility 
 *      Is a behavioural design pattern that lets you pass requests 
 *      along a chain of handlers. Upon receiving a request, each handler decides 
 *      either to process the request or to pass it to the next handler in the chain 
 *      
 */

mod abstract_logger;
fn main() {
    let mut error_logger = ErrorLogger {level : 1, next_logger: None};
    let mut console_logger = ConsoleLogger { 
        level: 2, 
        next_logger: None
    };

    error_logger.log_message(1, "Something went wrong herere!");
    error_logger.set_next_logger(Box::new(console_logger));

    println!("Hello, world!");
}

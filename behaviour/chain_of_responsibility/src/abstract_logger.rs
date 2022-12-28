pub trait AbstractLogger { 
    fn set_next_logger(&mut self, next_logger: Box<dyn AbstractLogger>);
    fn log_message(&self, level: i32, message: &str);
    fn write(&self, message: &str);
}

pub struct ConsoleLogger { 
    pub level: i32, 
    // Values that implements that `AbstractLogger`
    pub next_logger: Option<Box<dyn AbstractLogger>>
}


impl AbstractLogger for ConsoleLogger {
    fn set_next_logger(&mut self, next_logger: Box<dyn AbstractLogger>) {
        self.next_logger = Some(next_logger)
    }

    fn log_message(&self, level: i32, message: &str) {
        if self.level <= level {
            self.write(message)
        }

        // using the `ref` allows you to work with the value directly 
        //  it avoids copying the value inside the `Some`
        if let Some(ref next_logger) = self.next_logger { 
            next_logger.log_message(level, message)
        }

    }
    /**
     * the `&str` type is often used as an argument type in Rust because it allows you to 
     * pass a string to a function or method without copying the entire string. This can be useful 
     * if the string is large or if you want to avoid the overwhead of copyign it 
     */
    fn write(&self, message: &str) {
        println!("Standard message -> {message}")
    }
}

pub struct ErrorLogger { 
    pub level: i32, 
    pub next_logger: Option<Box<dyn AbstractLogger>>
}

impl AbstractLogger for ErrorLogger {
    fn set_next_logger(&mut self, next_logger: Box<dyn AbstractLogger>) {
        self.next_logger = Some(next_logger)
    }

    fn log_message(&self, level: i32, message: &str) {
        if self.level <= level {
            self.write(message)
        };

        if let Some(ref next_logger) = self.next_logger { 
            next_logger.log_message(level, message)
        }

    }

    fn write(&self, message: &str) {
        println!("error message -> {message}")
    }
}

pub struct FileLogger { 
    level: i32, 
    next_logger: Option<Box<dyn AbstractLogger>>
}

impl AbstractLogger for FileLogger {
    fn set_next_logger(&mut self, next_logger: Box<dyn AbstractLogger>) {
        self.next_logger = Some(next_logger)
    }

    fn log_message(&self, level: i32, message: &str) {
        if self.level <= level {
            self.write(message)
        };

        if let Some(ref next_logger) = self.next_logger { 
            next_logger.log_message(level, message)
        }

    }

    fn write(&self, message: &str) {
        println!("final logger -> {message}")
    }
}
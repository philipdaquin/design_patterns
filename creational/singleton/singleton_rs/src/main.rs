use std::sync::Mutex;

static ARRAY: Mutex<Vec<i32>> = Mutex::new(Vec::new());

fn add(val: i32)  {
    ARRAY.lock().unwrap().push(val);
}

fn get() { 
    println!("{:?}", ARRAY.lock().unwrap());
}



fn main() {

    add(100);
    add(200);
    add(300);
    get();



    println!("Hello, world!");
}

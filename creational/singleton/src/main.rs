
use once_cell::sync::OnceCell;
use std::sync::Mutex;

static ArrayDriver: OnceCell<Mutex<Vec<i32>>> = OnceCell::new();

fn singleton(array: Vec<i32>) { 
    ArrayDriver.get_or_init(|| Mutex::new(array));
}

fn sample_call() { 
    ArrayDriver
        .get().unwrap()
        .lock().unwrap()
        .push(1);
}


fn main() {
    singleton(vec![1,2,4,5]);

    sample_call();
    sample_call();
    sample_call();
    sample_call();
    sample_call();
    sample_call();

    println!("{:?}", ArrayDriver.get().unwrap().lock().unwrap().iter().map(|f| f + f).collect::<Vec<i32>>());
}

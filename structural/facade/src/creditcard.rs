#[derive(Default)]
pub struct CreditCard { 
    balance: f64
}

impl CreditCard { 
    pub fn new() -> Self { 
        Self { 
            balance: 0.0
        }
    }
    pub fn make_payment(&mut self, amount: f64) { 
        self.balance -= amount
    }
}
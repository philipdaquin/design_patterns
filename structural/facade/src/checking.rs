
#[derive(Default)]
pub struct CheckingAccount { 
    balance: f64
}

impl CheckingAccount  {
    pub fn new() -> CheckingAccount { 
        Self { 
            balance: 0.0
        }
    }
    pub fn deposit(&mut self, amount: f64) { 
        self.balance += amount;
    }

    pub fn withdraw(&mut self, amount: f64) { 
        self.balance -= amount
    }
}


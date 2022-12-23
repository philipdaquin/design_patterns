#[derive(Default)]
pub struct SavingsAccount { 
    balance: f64
}

impl SavingsAccount { 
    pub fn new() -> Self { 
        Self { 
            balance: 0.0
        }
    }
    pub fn deposit(&mut self, amount: f64) {
        self.balance += amount
    }

    pub fn withdraw(&mut self, amount: f64) {
        self.balance -= amount
    }
}

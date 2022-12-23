use std::default;

use crate::checking::CheckingAccount;
use crate::creditcard::CreditCard;
use crate::savings::SavingsAccount;

/// * The Bank struct acts as a facade, providing a simplified interface 
///     to a set of related structs.
/// 
/// * Instead of interacting wht these structs directs, clients can use the Bank structs to perform 
///     various banking task
/// 
/// * This allows  clients to use a simpler and more cohesive interface to interact
///     with the underlying banking system, rather than having to deal with the comlexity of the
///     individual structs

#[derive(Default)]
pub struct Bank { 
    checking_account: CheckingAccount,
    savings_account: SavingsAccount,
    credit_card: CreditCard
}

impl Bank { 
    pub fn new() -> Bank { 
        Bank { 
            checking_account: CheckingAccount::new(),
            savings_account: SavingsAccount::new(),
            credit_card: CreditCard::new()
        }
    }

    pub fn deposit(&mut self, amount: f64) { 
        // deposit money into checking account 
        self.checking_account.deposit(amount)
    }

    pub fn withdraw(&mut self, amount: f64) { 
        // withdrwaw money from checking account 
        self.checking_account.withdraw(amount);
    }

    pub fn transfer(&mut self, amount: f64) { 
        // with money from checking account 
        self.checking_account.withdraw(amount);
        // deposit money into savings account
        self.savings_account.deposit(amount);
    }

    pub fn pay_credit_card(&mut self, amount: f64) { 
        // withdraw from checking accoun t
        self.checking_account.withdraw(amount);
        // make payment on credit card 
        self.credit_card.make_payment(amount);
    }
}
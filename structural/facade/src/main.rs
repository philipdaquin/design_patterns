use crate::bank::Bank;

/**
 * Facade Pattenrn
 * Is a structural design pattern that provides a simplified interface to a library,
 * A frame work or any other complex set of classes 
 * 
 * The facade is used to provide a simplified interface to a compex system:
 *  - Reducing the complexity of a systen
 *  - Improving usability: it provides a single, cohesive interface to a system,
 *    the facade pattern improves the usability of the system, as clients only need
 *    to learn and use a single interface rather than multiple unrelated interface 
 *  - Hide implementation details 
 *  - Reducing depedencies
 *  - Improving performance 
 */
mod bank;
mod checking;
mod savings;
mod creditcard;


fn main() {

    let mut bank = Bank::new();
    bank.deposit(19.09);
    bank.withdraw(50.99);
    bank.transfer(25.00);
    bank.pay_credit_card(10.11);


    println!("Hello, world!");
}

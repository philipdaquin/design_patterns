/**
 *     Strategy  
 *     - Is a behaviourial design patterns that lets you define a family of 
 *       algorithms, put each of them into a separate class, and make their objects 
 *       interchangeable 
 *     - It maintains a reference to one of the concrete strategies and communicates with this 
 *       object only via the strategy interface 
 * 
 *     Context
 *      - Must have a field for storing a reference to one of the strategies. The context 
 *        delegates the work to a linked strategy object instead of executing it on its own 
 *     
 *       
 */
mod strategies;
fn main() {
    println!("Hello, world!");
}

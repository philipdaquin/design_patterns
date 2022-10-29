
/**
 *    Common interface for all button 
 */
pub trait Button { 
    fn render(&self);
    fn on_click(&self);
}

/**
 *   Dialog has a factory method 'create_button'
 *   It creates different button depending on a factory implementation 
 */
pub trait Dialog { 
    /// The factory method. It must be overridden with a concrete implementation 
    fn create_button(&self) -> Box<dyn Button>;

    /**
     *  The creator's primary responsibility isnt creating products
     *  it contains some core business logic that relies in product objects returned 
     *  by the factory method
     * 
     */
    fn render(&self) { 
        // Call the factory method to create an instance of product 
        let button = self.create_button();
        // Do Something with product
        button.on_click();
        button.render();
    }

    fn refresh(&self)  {println!("Dialog -- refresh! ")}

}


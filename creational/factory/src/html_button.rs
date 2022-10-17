use crate::creator::{Button, Dialog};


pub struct HtmlButton;

/**
 * HTML Dialog will produce HTML Buttons
 */
impl Button for HtmlButton {
    fn render(&self) {
        println!("Click Me to Win!");
    }

    fn on_click(&self) {
        println!("<button>Hello World</button>");
        self.render();
    }
}

/**
 * Windows Dialog will produce windows button
 */

pub struct HtmlDialog;
impl Dialog for HtmlDialog {
    fn create_button(&self) -> Box<dyn Button> {
        return Box::new(HtmlButton)
    }
}
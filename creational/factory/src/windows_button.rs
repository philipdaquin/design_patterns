use crate::creator::{Button, Dialog};


struct WindowsButton;

impl Button for WindowsButton {
    fn render(&self) {
        self.on_click();
    }

    fn on_click(&self) {
        println!("You Clicked a Button!")
    }
}

pub struct WindowsDialog;

impl Dialog for WindowsDialog { 
    /// Creates a Windows Button
    fn create_button(&self) -> Box<dyn Button> {
        Box::new(WindowsButton)
    }
}
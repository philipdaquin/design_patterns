use crate::{creator::Dialog, windows_button::WindowsDialog, html_button::HtmlDialog};



pub fn configure() -> &'static dyn Dialog { 
    if cfg!(windows) { 
        &WindowsDialog
    } else { 
        &HtmlDialog
    }
}
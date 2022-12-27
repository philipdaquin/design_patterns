use crate::flyweight::TextEditor;

/**
 * Flyweight is a structural design pattern to reduce the memory 
 * usage and computational overhead of an application by sharing 
 * common data between object. 
 * 
 * It achives this by separating the intrinsic data that is 
 * unique to each object from extrinsic data that varies from object to object  
 */
mod flyweight;
mod flyweight_lite;
fn main() {

    let mut editor = TextEditor::new();
    let font_1 = editor.create_font("Arial".to_string(), "red".to_string());

    // create three textObject object using the font object
    editor.create_text_object("hell!".to_string(), "Arial".to_string());

    // Render all the textobjects objects
    editor.render();


    println!("Hello, world!");
}

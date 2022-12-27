use std::collections::HashMap;


#[derive(Clone, Debug)]
pub struct Font { 
    font_name: String,
    font_colour: String
}

impl Font { 
    pub fn new(font_name: String, font_colour: String) -> Self { 
        Self { 
            font_name, font_colour
        }
    }
}

#[derive(Clone, Debug)]

pub struct TextObject { 
    text: String, 
    font: Font
}

impl TextObject { 
    pub fn new(text: String, font: Font) -> Self { 
        Self { 
            text, font
        }
    }

    pub fn render(&self) { 
        println!("Rendering text {} with font {} and color {}", 
        self.text, self.font.font_name, self.font.font_colour);
    }
}

#[derive(Clone)]
pub struct TextEditor { 
    fonts: HashMap<String, Font>,
    text_objects: Vec<TextObject>
}

impl TextEditor { 

    pub fn new() -> Self { 
        Self  { 
            fonts: HashMap::new(),
            text_objects: Vec::new()
        }
    }
    /// A method to create a font object and store it in the map 
    pub fn create_font(&mut self, font_name: String, font_colour: String) -> &Font { 
        let mut font = Font::new(font_name.to_string(), font_colour);
        self.fonts.insert(font_name.to_string(), font);
        &self.fonts[&font_name]
    }
    /// A method to create a textoject using an existing font object 
    pub fn create_text_object(&mut self, text: String, font_name: String) -> TextObject { 
        let mut font = self.fonts.get(&font_name).expect("Failed to get font by name");

        let mut text_object = TextObject::new(text, font.clone());
        self.text_objects.push(text_object.clone());
        return text_object
    }

    pub fn render(&self) { 
        for text_object in self.text_objects.iter() {   
            text_object.render();
        }
    } 
}
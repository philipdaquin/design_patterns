use std::collections::HashMap;


#[derive(Clone, Debug)]
struct Font { 
    font_name: String,
    font_colour: String
}

impl Font { 
    fn new(font_name: String, font_colour: String) -> Self { 
        Self { 
            font_name, font_colour
        }
    }
}

#[derive(Clone, Debug)]

struct TextObject { 
    text: String, 
    font: Font
}

impl TextObject { 
    fn new(text: String, font: Font) -> Self { 
        Self { 
            text, font
        }
    }

    fn render(&self) { 
        println!("Rendering text {} with font {} and color {}", 
        self.text, self.font.font_name, self.font.font_colour);
    }
}

#[derive(Clone)]
struct TextEditor { 
    fonts: HashMap<String, Font>,
    text_objects: Vec<TextObject>
}

impl TextEditor { 
    fn create_font(&mut self, font_name: String, font_colour: String) -> Font { 
        let mut font = Box::new(Font::new(font_name.clone(), font_colour));
        self.fonts.insert(font_name, *font.clone());
        return *font
    }
    fn create_text_object(&mut self, text: String, font_name: String) -> TextObject { 
        let mut font = *self.fonts.get(&font_name).expect("Failed to get font by name");

        let mut text_object = TextObject::new(text, font);
        self.text_objects.push(text_object.clone());

        return text_object
    }
}
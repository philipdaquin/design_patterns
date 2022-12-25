
pub trait Shape { 
    fn draw(&self);
}

pub trait DrawingApi {
    fn draw_circle(&self, x: f64, y: f64, radius: f64);
}


/**
 * The CircleShape class has a reference to a DrawingAPI which it uses to draw itself
 * 
 * The CircleShape  class is decoupled from the details of how it is drawn, because it depends
 *  on the DrawingAPI interface, rather than on a specific implementation of the interface 
 * 
 * This allows the CircleShape to be drawn using different implementations of the DrawingApi interface
 * without changing the CircleShape class itself
 */
pub struct CircleShape { 
    x: f64,
    y: f64,
    radius: f64,
    drawing_api: Box<dyn DrawingApi>
}

impl CircleShape { 
    pub fn new(x: f64, y: f64, radius: f64, drawing_api: Box<dyn DrawingApi>) -> Self { 
        Self { 
            x,  y, radius, drawing_api 
        }
    }

    // low level i.e implementation of Drawing Api
    pub fn draw(&self) { 
        self.drawing_api.draw_circle(self.x, self.y, self.radius)
    }

    pub fn resize_by_percentage(&mut self, pct: f64) { 
        self.radius *= (1.0 + pct / 100.0)
    } 
}

impl Shape for CircleShape { 
    fn draw(&self) {
        self.draw()
    }
}


// Concrete Implementation
pub struct DrawingApi1;
impl DrawingApi for DrawingApi1 {
    fn draw_circle(&self, x: f64, y: f64, radius: f64) {
        println!("New circle is now x: {x}, y: {y}, radius: {radius}")
    }
}

// Concrete Implementation
pub struct DrawingApi2;
impl DrawingApi for DrawingApi2 {
    fn draw_circle(&self, x: f64, y: f64, radius: f64) {
        println!("New circle is now x: {x}, y: {y}, radius: {radius}")
    }
}


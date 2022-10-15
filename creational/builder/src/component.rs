#[derive(Debug, Clone)]
pub enum Transmission { 
    Automatic, 
    Manual,
    SemiAutomatic
}

impl Default for Transmission {
    fn default() -> Self {
        Self::Automatic
    }
}

#[derive(Debug, Clone)]
pub enum Engine {     
    SportEngine,
    MediumEngine,
    V8Engine
}

impl Default for Engine { 
    fn default() -> Self {
        Self::SportEngine
    }
}


#[derive(Default, Debug, Clone)]
pub struct GpsNavigator { 
    route: String
}

impl GpsNavigator { 
    pub fn new() -> Self {
        GpsNavigator::default()
    }
}

#[derive(Debug, Clone)]
pub enum CarType { 
    SportsCar,
    CityCar, 
    FourWD
}

impl Default for CarType { 
    fn default() -> Self {
        Self::SportsCar
    }
}
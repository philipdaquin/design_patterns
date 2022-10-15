use std::fmt::Debug;

use crate::component::{CarType, Engine, Transmission, GpsNavigator};



#[derive(Default, Clone)]
pub struct Manual { 
    car_type: CarType,
    seats: u16,
    engine: Engine,
    transmission: Transmission,
    gps: Option<GpsNavigator>, 
}


impl Manual { 
    pub fn new( 
        car_type: CarType,
        seats: u16,
        engine: Engine,
        transmission: Transmission,
        gps: Option<GpsNavigator>, 
    ) -> Self{ 
        Self { 
            car_type,
            seats,
            engine,
            transmission,
            gps
        }
    }
}

impl Debug for Manual { 
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        writeln!(f, "🚗 Type of car {:?}", self.car_type)?;
        writeln!(f, "💺 Number of seats: {:?}", self.seats)?;
        writeln!(f, "🔲 Type of engine: {:?}", self.engine)?;
        writeln!(f, "📥 Type of transmission {:?}", self.transmission)?;
        writeln!(f, "📱 Type of GPS {:?}", self.gps)?;
        Ok(())
    }
}
use crate::component::{CarType, Engine, Transmission, GpsNavigator};

#[derive(Default, Debug, Clone)]
pub struct Car { 
    car_type: CarType,
    seats: u16,
    engine: Engine,
    transmission: Transmission,
    gps: GpsNavigator, 
    fuel: f64
}

impl Car { 
    pub fn new(
        car_type: CarType,
        seats: u16,
        engine: Engine,
        transmission: Transmission,
        gps: GpsNavigator, 
        fuel: f64
    ) -> Self { 
        Self { 
            car_type,
            seats,
            engine,
            transmission,
            gps, 
            fuel
        }
    }
}


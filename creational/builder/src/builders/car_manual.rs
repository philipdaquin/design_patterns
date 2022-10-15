use std::fmt::Debug;

use crate::{component::{CarType, Engine, Transmission, GpsNavigator}, cars::{car::Car, manual::Manual}};

use super::Builder;

/// The manual describes every feature of the car, so the details in the manauls vary 
/// across the different models
/// That's why it make sense ot reuse an existing consturction procress for 
/// both real cars and their respective manuals 

#[derive(Default, Debug, Clone)]
pub struct CarManual { 
    car_type: Option<CarType>,
    seats: Option<u16>,
    engine: Option<Engine>,
    transmission: Option<Transmission>,
    gps: Option<GpsNavigator>, 
}

impl Builder for CarManual {
    type OutputType = Manual;

    fn reset() -> Self::OutputType {
        Manual::default()
    }

    fn set_car_type(&mut self, car_type: CarType) {
        self.car_type = Some(car_type)
    }

    fn set_seats(&mut self, num_of_seats: u16) {
        self.seats = Some(num_of_seats)
    }

    fn set_engine(&mut self, engine: Engine) {
        self.engine = Some(engine)
    }

    fn set_transmission(&mut self, transmission: Transmission) {
        self.transmission = Some(transmission)
    }

    fn set_gps(&mut self, gps_type: GpsNavigator) {
        self.gps = Some(gps_type)
    }

    fn build(self) -> Self::OutputType {
        Manual::new(
            self.car_type.unwrap(),
            self.seats.unwrap(), 
            self.engine.unwrap(),
            self.transmission.unwrap(), 
            self.gps, 
            
        )
    }



}
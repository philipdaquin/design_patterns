use std::fmt::Debug;

use super::Builder;

use crate::component::{CarType, Engine, Transmission, GpsNavigator};
use crate::cars::car::Car;


#[derive(Default)]
pub struct CarBuilder { 
    car_type: Option<CarType>,
    seats: Option<u16>,
    engine: Option<Engine>,
    transmission: Option<Transmission>,
    gps: Option<GpsNavigator>, 
}


const DEFAULT_FUEL_VALUE: f64 = 100.0;

/// The concrete builder classes follow the builder interface and 
/// provide specific implementations of the building steps. Your program
/// may have several variatiosn of builders, each implemented differently
impl Builder for CarBuilder {
    type OutputType = Car;

    /// A fresh builder instance should contain a blank product 
    /// object which it uses in further assemblyu
    fn reset() -> Self::OutputType {
        return Car::default()
    }
    /// Sets the Car type 
    fn set_car_type(&mut self, car_type: CarType) {
        self.car_type = Some(car_type);
    }
    /// Install seats where x is the number of seats
    fn set_seats(&mut self, num_of_seats: u16) {
        self.seats = Some(num_of_seats)
    }   
    /// Installs the engine required 
    fn set_engine(&mut self, engine: Engine) {
        self.engine = Some(engine)
    }
    /// Installs the transmission required
    fn set_transmission(&mut self, transmission: Transmission) {
        self.transmission = Some(transmission)
    }
    /// Installs GPS 
    fn set_gps(&mut self, gps_type: GpsNavigator) {
        self.gps = Some(gps_type)
    }
    /// Build the result object, Car
    fn build(self) -> Self::OutputType {
        Car::new(
            self.car_type.unwrap(),
            self.seats.unwrap(),
            self.engine.unwrap(),
            self.transmission.unwrap(),
            self.gps.unwrap(),
            DEFAULT_FUEL_VALUE        
        )
    }
}
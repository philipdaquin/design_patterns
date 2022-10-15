pub mod car_builder;
pub mod car_manual;
use std::fmt::Debug;

use super::component::{Engine, Transmission, GpsNavigator, CarType};

/// The builder interface specifies methods for creating the 
/// different parts of the product objects
pub trait Builder { 
    type OutputType;
    fn reset() -> Self::OutputType;
    fn set_car_type(&mut self, car_type: CarType);
    fn set_seats(&mut self, num_of_seats: u16);
    fn set_engine(&mut self, engine: Engine);
    fn set_transmission(&mut self, transmission: Transmission);
    fn set_gps(&mut self, gps_type: GpsNavigator);
    fn build(self) -> Self::OutputType;
}
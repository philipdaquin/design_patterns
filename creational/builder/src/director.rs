use std::fmt::Debug;

use crate::{builders::{Builder}, component::{CarType, Engine, Transmission, GpsNavigator}};

/// The director is only responsible for executing the building 
/// steps in a particular sequence. It's helpful when producing products
/// according to a specific order or configuration. 
/// 
/// Director class is optional, since the client can control 
/// builders directly 
pub struct Director;
impl Director { 
    pub fn construct_sport_car(builder: &mut impl Builder) { 
        builder.set_car_type(CarType::SportsCar);
        builder.set_seats(2);
        builder.set_engine(Engine::SportEngine);
        builder.set_transmission(Transmission::SemiAutomatic);
        builder.set_gps(GpsNavigator::new());
    }

    pub fn construct_city_car(builder: &mut impl Builder) { 
        builder.set_car_type(CarType::CityCar);
        builder.set_seats(4);
        builder.set_engine(Engine::MediumEngine);
        builder.set_transmission(Transmission::Automatic);
        builder.set_gps(GpsNavigator::new());
    }

    pub fn construct_suv(builder: &mut impl Builder) { 
        builder.set_car_type(CarType::FourWD);
        builder.set_seats(6);
        builder.set_engine(Engine::V8Engine);
        builder.set_transmission(Transmission::Manual);
        builder.set_gps(GpsNavigator::new());
    }

    
}
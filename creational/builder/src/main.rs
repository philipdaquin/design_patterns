use crate::{builders::{car_builder::CarBuilder, car_manual::CarManual}, builders::Builder, director::Director, cars::{car::Car, manual::Manual}};
pub mod builders;
pub mod component;
pub mod cars;
pub mod director;

fn main() {
    println!("Hello, world!");

    let mut builder = CarBuilder::default();
    Director::construct_city_car(&mut builder);

    let car: Car = builder.build();
    println!("{car:#?}");

    let mut car_manual = CarManual::default();
    Director::construct_city_car(&mut car_manual);
    let manual: Manual = car_manual.build();
    println!("{manual:#?}");

}

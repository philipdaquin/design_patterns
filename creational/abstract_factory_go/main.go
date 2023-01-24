package main


/*
	Abstract Factory Design Pattern 
	
	- is a creational design pattern that provides an interface for creating families of related 
	or dependent
	 objects without specifying their concreate classes

	- It allows a client to create objects that belong to a certain family, without 
	specifying the exacgt class of objects that will be created

*/


type Vehicle interface { 
	GetType() string
}

type Car struct {}
func (self *Car) GetType() string { 
	return string("car")
}

type MotorCycle struct {}
func (self *MotorCycle) GetType() string { 
	return string("motorcycle")
}

type VehicleFactor interface { 
	CreateVehicle() Vehicle
}

type CarFactory struct {}

func (self *CarFactory) CreateVehicle() Vehicle { 
	return &Car{}
}

type MotorCylceFactory struct {}
func (self *MotorCylceFactory) CreateVehicle() Vehicle { 
	return &MotorCycle{}
}

func CreateVehicle(vehicleType string) VehicleFactor { 
	if vehicleType == "car" {
		return &CarFactory{}
	}
	if vehicleType == "motorcyle" { 
		return &MotorCylceFactory{}
	}

	return nil
}


func main() { 
	carFactor := &CarFactory{}
	car := carFactor.CreateVehicle()
	car.GetType()

	motorFactor := &MotorCylceFactory{}
	motorcyel := motorFactor.CreateVehicle()
	motorcyel.GetType()

}






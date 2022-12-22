# pylint: disable=missing-module-docstring
# pylint: disable=missing-class-docstring
# pylint: disable=missing-function-docstring
# pylint: disable=trailing-whitespace

#   Factory
#   - Creates objects without specifying the exact class to create
#   - It provides an interface for creating objects in a super class, but
#       allows subclasses to alter the type of objects that will be created.
#
class Animal:
    def speak(self):
        raise NotImplementedError

class Dog(Animal):
    def speak(self):
        return "WOOF MUTHAFUCKA!"

class Cat(Animal):
    def speak(self):
        return "MEOW BITCH!"

#   This class allows the cient code to create objects of
#   the Animal class without knowing the concrete implementations of the
#   Animal class
#
#   The client code simple needs to specify the type of animal it wants and the factory 
#   will create an object of the appropriate type.
#   This makes it easy to add new types of aniamls wihtout having to modify the client code 
class AnimalFactory:
    def create_animal(self, animal_type):
        if animal_type == "Dog":
            return Dog()
        elif animal_type == "Cat":
            return Cat()
        else:
            raise ValueError("Invalid animalTYPE1")


def main():

    new_factory = AnimalFactory()
    dogspeaks = new_factory.create_animal("Dog")

    catsays = new_factory.create_animal("Cat")

    print(dogspeaks.speak())
    print(catsays.speak())

    print("Hello World!")

# This line is used to ensure that the main function is only called
# when the program is run directly and not when it is imported by another module 
if __name__ == "__main__":
    main()
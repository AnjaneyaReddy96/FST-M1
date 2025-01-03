class Car:
    'This class represents a car'

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")

car1 = Car("Kia", "carnival", "2018", "Manual", "White")
car2 = Car("Tata", "harrier", "2020", "Manual", "Red")
car3 = Car("hyundai", "creta", "20237", "Automatic", "Black")

car1.accelerate()
car1.stop()
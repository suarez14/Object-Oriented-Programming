from car import Car
from account import Account
if __name__ == "__main__":
    print("Hola Mundo")
    

    car = Car("GSP585", Account("Andres", "Documento"))
    print(vars(car))
    print(vars(car.driver))


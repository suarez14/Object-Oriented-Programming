from car import Car

class Uberx(Car):

    brand = str
    model = str

    def __init__(self, licese, driver, brand, model):
        super.__init__(license,driver)
        self.brand = brand
        self.model = model
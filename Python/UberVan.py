from car import Car

class Uberx(Car):

    typeCarAccepted = []
    seatsMaterial = []

    def __init__(self, licese, driver, typeCarAccepted, seatsMaterial):
        super.__init__(license,driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial 
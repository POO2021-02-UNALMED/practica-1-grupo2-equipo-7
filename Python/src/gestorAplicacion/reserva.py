class Reserva:

    reservas={}
    def __init__(self, cliente, numreserva,fechareserva, horareserva,cantidadpersonas):
        self.cliente = cliente
        self.numreserva=numreserva
        self.fechareserva=fechareserva
        self.horareserva=horareserva
        self.cantidadpersonas=cantidadpersonas
        Reserva.reservas[numreserva]=self
    

    #getters y setters   
    def setCliente(self, cliente):
        self.cliente = cliente
    
    def getCliente(self):
        return self.cliente

    def setNumreserva(self, numreserva):
        self.numreserva=numreserva
    
    def getNumreserva(self):
        return self.numreserva

    def setFechareserva(self, fechareserva):
        self.fechareserva=fechareserva
    
    def getFechareserva(self):
        return self.fechareserva

    def setHorareserva(self, horareserva):
        self.horareserva=horareserva
    
    def getHorareserva(self):
        return self.horareserva

    def setCantidadpersonas(self, cantidadpersonas):
        self.cantidadpersonas=cantidadpersonas
    
    def getCantidadpersonas(self):
        return self.cantidadpersonas


    
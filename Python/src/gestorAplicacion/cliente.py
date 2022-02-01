from persona import Persona

class Cliente(Persona):

    clientes = {}
    def __init__(self,cedula,nombre,telefono, direccion,reserva = None):
        super().__init__( cedula,nombre,telefono, direccion)
        self.reserva = reserva
        Cliente.clientes[cedula] = self

    


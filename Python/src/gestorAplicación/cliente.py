from gestorAplicación.Persona import Persona

class cliente(Persona):

    def __init__(self,reserva):
        super().__init__( cedula,nombre,telefono, direccion)
        self.reserva = reserva
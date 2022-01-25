from gestorAplicacion.persona import Persona

class cliente(Persona):

    def __init__(self,cedula,nombre,telefono, direccion,reserva):
        super().__init__( cedula,nombre,telefono, direccion)
        self.reserva = reserva


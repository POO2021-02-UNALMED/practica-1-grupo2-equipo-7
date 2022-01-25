from gestorAplicacion.persona import Persona

class empleado(Persona):

    def __init__(self,cedula,nombre,telefono, direccion, id, cargo, sueldo):
        super().__init__( cedula,nombre,telefono, direccion)
        self.id = id
        self.cargo = cargo
        self.sueldo = sueldo

#getters y setters
    def setId(self, id):
         self.id = id

    def getId(self):
         return self.id    
    
    def setCargo(self, cargos):
         self.cargo = cargos

    def getCargo(self):
        return self.cargo 

    def setSueldo(self,sueldos):
        self.sueldo = sueldos

    def getSueldo(self):
        self.sueldo     
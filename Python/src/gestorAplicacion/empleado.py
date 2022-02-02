from gestorAplicacion.persona import Persona

class Empleado(Persona):

    def __init__(self, cedula, nombre, telefono, direccion, cargo, sueldo):
        super().__init__(cedula, nombre, telefono, direccion)
        self._cargo=cargo
        self._sueldo=sueldo

 #getters y setters
    #def setId(self, id):
    #     self.id = id

    #def getId(self):
    #     return self.id    
    
    def setCargo(self, cargos):
         self._cargo = cargos

    def getCargo(self):
        return self._cargo 

    def setSueldo(self,sueldos):
        self._sueldo = sueldos

    def getSueldo(self):
        return self._sueldo     
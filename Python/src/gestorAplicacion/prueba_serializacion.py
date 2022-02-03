import pickle
from persona import Persona
class Empleado(Persona):

    empleados={}
    def __init__(self, cedula, nombre, telefono, direccion, cargo, sueldo):
        super().__init__(cedula, nombre, telefono, direccion)
        self._cargo=cargo
        self._sueldo=sueldo
        Empleado.empleados[cedula]=self

        

    

    
    def setCargo(self, cargos):
         self._cargo = cargos

    def getCargo(self):
        return self._cargo 

    def setSueldo(self,sueldos):
        self._sueldo = sueldos

    def getSueldo(self):
        return self._sueldo     

    @classmethod
    def lecturaSempleado(cls):
    
     fichero=open("losEmpleados", "rb")

     misEmpleados=pickle.load(fichero)

     fichero.close()

     for c in misEmpleados:

      print(c.estado())

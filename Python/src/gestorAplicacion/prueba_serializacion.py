import pickle
from persona import Persona
class Empleado(Persona):

    empleados={}
    def __init__(self, cedula, nombre, telefono, direccion, cargo, sueldo):
        super().__init__(cedula, nombre, telefono, direccion)
        self._cargo=cargo
        self._sueldo=sueldo
        Empleado.empleados[cedula]=self

    fichero_binario=open("losEmpleados","wb")

    pickle.dump(empleados, fichero_binario)

    fichero_binario.close()

    del(fichero_binario)
    
    def setCargo(self, cargos):
         self._cargo = cargos

    def getCargo(self):
        return self._cargo 

    def setSueldo(self,sueldos):
        self._sueldo = sueldos

    def getSueldo(self):
        return self._sueldo     

fichero=open("losEmpleados", "rb")

misEmpleados=pickle.load(fichero)

fichero.close()

for c in misEmpleados:

    print(c.estado())

#from ..gestorAplicacion import *
from ..gestorAplicacion.cliente import Cliente
from ..gestorAplicacion.mesa import Mesa

class baseDedatos():
    def base_de_datos():
        Cliente(1124, "Alberto Nuñez", 312313, "Barrio Nueva Guinea")
        Mesa(112, 1, 1)

print("Hola mundo desde Base de datos")
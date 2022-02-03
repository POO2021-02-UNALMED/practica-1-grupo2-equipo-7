import pickle
import mesa

class Mesa():

    mesas = {}
    #baseDedatos.base_de_datos()
    
    def __init__(self, id, numero, zona, disponibilidad = True, pedidoM = None):
        self._idUnico        = id
        self._numero         = numero
        self._zona           = zona
        self._disponibilidad = disponibilidad
        self.pedido         = pedidoM
        Mesa.mesas[numero] = self

    fichero_binario=open("lasmesas","wb")

    pickle.dump(mesas, fichero_binario)

    fichero_binario.close()

    del(fichero_binario)
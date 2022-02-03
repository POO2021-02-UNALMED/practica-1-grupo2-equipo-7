
import pickle
class materiaPrima:

    insumos={}
    def __init__(self, nombreInsumo,cantInsumo):
        self.nombreInsumo= nombreInsumo
        self.cantInsumo=cantInsumo
        materiaPrima.insumos[nombreInsumo] = self

    fichero_binario=open("LosInsumos","wb")

    pickle.dump(insumos, fichero_binario)

    fichero_binario.close()

    del(fichero_binario)

    #getters y setters   
    def setNombreInsumo(self, nombreInsumo):
        self.cliente = nombreInsumo
    
    def getNombreInsumo(self):
        return self.nombreInsumo

    def setCantInsumo(self, cantInsumo):
        self.cantInsumo=cantInsumo
    
    def getCantInsumo(self):
        return self.cantInsumo

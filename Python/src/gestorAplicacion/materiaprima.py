class materiaPrima:

    insumos=[]
    def __init__(self, nombreInsumo,cantInsumo):
        self.nombreInsumo= nombreInsumo
        self.cantInsumo=cantInsumo
    
    #getters y setters   
    def setNombreInsumo(self, nombreInsumo):
        self.cliente = nombreInsumo
    
    def getNombreInsumo(self):
        return self.nombreInsumo

    def setCantInsumo(self, cantInsumo):
        self.cantInsumo=cantInsumo
    
    def getCantInsumo(self):
        return self.cantInsumo

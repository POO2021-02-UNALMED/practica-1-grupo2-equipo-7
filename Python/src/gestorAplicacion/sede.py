class Sede:

    def __init__(self, numsede,open,disp,ubicacion, cantidademp):
        self.numsede = numsede
        self.open=open
        self.disp=disp
        self.ubicacion=ubicacion
        self.cantidademp=cantidademp

    #getters y setters   
    def setNumsede(self, numsedes):
        self.numsede = numsedes
    
    def getNumsede(self):
        return self.numsede

    def setOpen(self, open):
        self.open=open
    
    def isOpen(self):
        return self.open

    def setDisp(self, disponibles):
        self.disp=disponibles
    
    def isDisp(self):
        return self.disp   

    def setUbicacion(self, ubicaciones):
        self.ubicacion=ubicaciones
    
    def getUbicacion(self):
        return self.ubicacion

    def setCantidademp(self, cantidades):
        self.cantidademp=cantidades
    
    def getCantidademp(self):
        return self.cantidademp





	    


   


        
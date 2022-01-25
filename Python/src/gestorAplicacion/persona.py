class Persona:    
    
    def __init__(self, cedula,nombre,telefono, direccion):
        self.cedula = cedula
        self.nombre = nombre
        self.telefono = telefono
        self.direccion = direccion


    #getters y setters   
    def setCedula(self, cedulas):
        self.cedula = cedulas
    
    def getCedula(self):
        return self.cedula

    def setNombre(self, nombres):
        self.nombre=nombres
    
    def getNombre(self):
        return self.nombre    

    def setTelefono(self, telefonos):
        self.telefono=telefonos
    
    def getTelefono(self):
        return self.telefono  

    def setDireccion(self, direcciones):
        self.direccion=direcciones
    
    def getDireccion(self):
        return self.direccion      
       
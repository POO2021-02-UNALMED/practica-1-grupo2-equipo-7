import pickle

class Catalogo():
    
    idPlato=1
    cantPlatos=0
    listaPlatos={}
    
    def __init__(self, nombre, precio, insumos={}):
        self.nombre = nombre
        self.precio = precio
        Catalogo.listaPlatos[Catalogo.idPlato] = self
        Catalogo.idPlato += 1
        self.insumos = insumos

    fichero_binario=open("Elcatalogo","wb")

    pickle.dump(listaPlatos, fichero_binario)

    fichero_binario.close()

    del(fichero_binario)

fichero=open("Elcatalogo", "rb")

miCatalogo=pickle.load(fichero)

fichero.close()

for c in miCatalogo:

    print(c.estado())

    #getters y setters
    def setNombrePlato(self, nombres):
        self.nombre = nombres
    
    def getNombrePlato(self):
        return self.nombre

    def setPrecio(self, precios):
        self.precio=precios
    
    def getPrecio(self):
        return self.precio
    
    def descontarInsumos():
        if not Catalogo.listaPlatos:
          print("No hay platos para ver")
        else:
            print("")

    def verCatalogo():
        if not Catalogo.listaPlatos:
            print("No hay platos creados en el sistema.")
        else:
            print("""_____________________________________________
                Código:    Nombre:    Precio:""")
            for codigo, plato in Catalogo.listaPlatos.items():
                print(f'{codigo} - {plato.getNombrePlato()} // {plato.getPrecio()} ')
           


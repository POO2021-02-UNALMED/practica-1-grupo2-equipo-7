class Catalogo:
    
    idPlato=1
    cantPlatos=0
    listaPlatos=[]
    
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio
        Catalogo.listaPlatos.append(self)

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
           

    # public static void descontarInsumos(Catalogo plato1, Integer cant) {
    #    Scanner in=new Scanner(System.in);
    #    if(platos.isEmpty()){
    #        System.out.println("no hay platos para ver");
    #    }else{
    #                for (Map.Entry<String,Double> plato: plato1.insumosPlato.entrySet()){
    #                    for (Map.Entry<String,Double> insumo: insumos.entrySet()) {
    #                        if (plato.getKey().equals(insumo.getKey())){
    #                            double cantidad=insumo.getValue()-(plato.getValue())*cant;
    #                            insumo.setValue(cantidad);
    #                            System.out.println(" cantidad removida con exito");
    #                        }
    #                    }
    #                }
    #
    #
    #    }
    #}


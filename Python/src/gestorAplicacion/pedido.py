from inspect import ismethoddescriptor
from gestorAplicacion.catalogo import Catalogo
import pickle
class Pedido():

    pedidos={Catalogo : int}
    def __init__(self, cliente,mesa,idpedido,pedidos):
        self.cliente = cliente
        self.mesa=mesa
        self.idpedido=idpedido
        self.platos=pedidos
        Pedido.pedidos[idpedido]=self

    fichero_binario=open("losPedidos","wb")

    pickle.dump(pedidos, fichero_binario)

    fichero_binario.close()

    del(fichero_binario)
    

    #getters y setters   
    def setCliente(self, cliente):
        self.cliente = cliente
    
    def getCliente(self):
        return self.cliente

    def setMesa(self, mesa):
        self.mesa=mesa
    
    def getMesa(self):
        return self.mesa

    def setIdpedido(self, idpedido):
        self.idpedido=idpedido
    
    def getIdpedido(self):
        return self.idpedido

    def setPlatos(self, platos):
        self.platos=platos
    
    def getPlatos(self):
        return self.platos

    def recibo(self, val):
        print("Sub-total: " + val)
        print("Propina: "+ val*0.10)
        print("Total: "+ (val + (val*0.10)))
        self.getCliente().actualizar_puntos((float) (val*0.10))
        print("Has ganado: "+ (val*0.10) + " Puntos.")
        print("Llevas acumulados: "+ self.getCliente().getPuntos() + " Puntos.")
        input()
    




    #private int cantidadplatos; #variable para uso con array statico
    #public void Recibo(int val) {
    #    Scanner in = new Scanner(System.in);
    #    System.out.println("Sub-total: " + val);
    #    System.out.println("Propina: "+ val*0.1);
    #    System.out.println("Total: "+ (val + (val*0.1)));
    #    this.getCliente().actualizar_puntos((float) (val*0.1));
    #    System.out.println("Has ganado: "+ (val*0.1) + " Puntos.");
    #    System.out.println("Llevas acumulados: "+ this.getCliente().getPuntos() + " Puntos.");
    #    in.next();
    #}
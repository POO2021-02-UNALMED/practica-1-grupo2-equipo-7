class Pedido:

    pedidos=[]
    def __init__(self, cliente,mesa,idpedido,platos):
        self.cliente = cliente
        self.mesa=mesa
        self.idpedido=idpedido
        self.platos=platos
    

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
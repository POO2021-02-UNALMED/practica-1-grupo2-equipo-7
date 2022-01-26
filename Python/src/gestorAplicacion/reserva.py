class Reserva:

    reservas=[]
    def __init__(self, cliente, numreserva,fechareserva, horareserva,cantidadpersonas):
        self.cliente = cliente
        self.numreserva=numreserva
        self.fechareserva=fechareserva
        self.horareserva=horareserva
        self.cantidadpersonas=cantidadpersonas
    

    #getters y setters   
    def setCliente(self, cliente):
        self.cliente = cliente
    
    def getCliente(self):
        return self.cliente

    def setNumreserva(self, numreserva):
        self.numreserva=numreserva
    
    def getNumreserva(self):
        return self.numreserva

    def setFechareserva(self, fechareserva):
        self.fechareserva=fechareserva
    
    def getFechareserva(self):
        return self.fechareserva

    def setHorareserva(self, horareserva):
        self.horareserva=horareserva
    
    def getHorareserva(self):
        return self.horareserva

    def setCantidadpersonas(self, cantidadpersonas):
        self.cantidadpersonas=cantidadpersonas
    
    def getCantidadpersonas(self):
        return self.cantidadpersonas

	#public String toString() {
    #    return "numero de reserva: "+getNumreserva() + "\n" +
    #            "[ fecha de la reserva: "+ getFechareserva() + "\n" +
    #            "  cliente: "+ getCliente() + "\n" +
    #            " hora de la reserva: "+ getHorareserva() + "\n" +
    #            "  cantidad personsas: "+ getCantidadpersonas()+" ]";
    #}

	#public static void verReserva() {
	#for (Reserva reserva : reservas ) {
	#	System.out.println(reserva);
	#}
	
	#}
	#public static void crearReserva(int cliente, int numreserva,String fechareserva,String horareserva, int cantidadpersonas) {
	#      Reserva newR=new Reserva(cliente, numreserva,fechareserva,horareserva,cantidadpersonas);
	#      reservas.add(newR);
	#      
	#    }    
    
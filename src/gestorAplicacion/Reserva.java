package gestorAplicacion;

import java.util.LinkedList;

public class Reserva {
    private int numreserva;
    private String fechareserva;
    private Cliente cliente;
    private boolean aplicable;
	public static LinkedList<Reserva> reservas= new LinkedList<>();
     //si la reserva aun es vigente o por el contrario ya vencio

	public Reserva(int numreserva, String fechareserva, Cliente cliente, boolean aplicable) {
	    this.numreserva = numreserva;
	    this.fechareserva = fechareserva;
     	this.aplicable = aplicable;
    	this.cliente = cliente;
	}


    public Cliente getCliente() {
	return cliente;
}


    public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

	public static void crearReserva(int numreserva, String fechareserva,Cliente cliente, boolean aplicable) {
		Reserva newReserva=new Reserva(numreserva,fechareserva,cliente,aplicable);
		reservas.add(newReserva);
	}

    public int getNumreserva() {
	return numreserva;
}

    public void setNumreserva(int numreserva) {
	this.numreserva = numreserva;
}

    public String getFechareserva() {
	return fechareserva;
}

    public void setFechareserva(String fechareserva) {
	this.fechareserva = fechareserva;
}

    public boolean isAplicable() {
	return aplicable;
}

    public void setAplicable(boolean aplicable) {
	this.aplicable = aplicable;
}

	public static void verReserva(){
		for (Reserva reserva:reservas){
			System.out.println(reserva);
		}
	}

	@Override
	public String toString() {
		return "Nro de Reserva " + numreserva + "\n" +
				"[ Fecha de reserva: " + fechareserva + "\n" +
				"  Cliente: " + cliente + "\n" +
				"  Aplicable: " + aplicable +" ]";
	}

}
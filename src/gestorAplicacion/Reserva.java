package gestorAplicacion;

public class Reserva {
public static Object getcliente;
private int numreserva;
private String fechareserva;
private Cliente cliente;
private boolean aplicable;

//si la reserva aun es vigente o por el contrario ya vencio



public Reserva(int numreserva, String fechareserva, Cliente cliente, boolean aplicable) {
	super();
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


}
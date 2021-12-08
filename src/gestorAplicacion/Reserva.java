package gestorAplicacion;

public class Reserva {
private int numreserva;
private String fechareserva;
private Cliente ccCliente;
private boolean aplicable;
//si la reserva aun es vigente o por el contrario ya venció


public Reserva(int numreserva, String fechareserva,Cliente ccCliente, boolean aplicable) {
	super();
	this.numreserva = numreserva;
	this.fechareserva = fechareserva;
	this.ccCliente = ccCliente;
	this.aplicable = aplicable;
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

public Cliente getCcCliente() {
	return ccCliente;
}

public void setCcCliente(Cliente ccCliente) {
	this.ccCliente = ccCliente;
}



}


package gestorAplicacion;

public class Sede {
private int numsede;
private boolean open;
//para saber si la sede esta abierta en el momento
private boolean disp;
//disponibilidad de la sede (si hay mesas libres o no)
private String ubicacion;
private int Cantidademp;
//cantidad de empleados activos en la sede

public Sede(int numsede, boolean open, boolean disp, String ubicacion, int cantidademp) {
	super();
	this.numsede = numsede;
	this.open = open;
	this.disp = disp;
	this.ubicacion = ubicacion;
	Cantidademp = cantidademp;
}

public int getNumsede() {
	return numsede;
}

public void setNumsede(int numsede) {
	this.numsede = numsede;
}

public boolean isOpen() {
	return open;
}

public void setOpen(boolean open) {
	this.open = open;
}

public boolean isDisp() {
	return disp;
}

public void setDisp(boolean disp) {
	this.disp = disp;
}

public String getUbicacion() {
	return ubicacion;
}

public void setUbicacion(String ubicacion) {
	this.ubicacion = ubicacion;
}

public int getCantidademp() {
	return Cantidademp;
}

public void setCantidademp(int cantidademp) {
	Cantidademp = cantidademp;
}


}

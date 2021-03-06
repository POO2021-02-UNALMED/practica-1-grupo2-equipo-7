package gestorAplicacion;

import java.awt.*;
import java.io.Serializable;

public abstract class Persona implements Serializable {
	private int cedula; 
	private String nombre; 
	private int telefono;
	private String direccion;
	
	public Persona(int cedula, String nombre, int telefono, String direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion(){return this.direccion;}
	public void setDireccion(String direccion){this.direccion = direccion;}
}

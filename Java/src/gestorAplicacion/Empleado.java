package gestorAplicacion;

import java.util.LinkedList;

public class Empleado extends Persona{

	private int id;
	private String cargo;
	private int sueldo;
	public static LinkedList<Empleado> empleados= new LinkedList<>();
	
	public Empleado(int cedula, String nombre, int telefono, String direccion, int id, String cargo, int sueldo) {
		super(cedula, nombre, telefono, direccion);
		this.setId(id);
		this.setCargo(cargo);
		this.sueldo = sueldo;
	}

	public static void crearEmpleado(int cedula, String nombre, int telefono, String direccion, int id, String cargo, int sueldo) {
		Empleado newEmpleado=new Empleado(cedula,nombre,telefono,direccion,id,cargo,sueldo);
		empleados.add(newEmpleado);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSueldo(int sueldo){ this.sueldo = sueldo;}

	public int getSueldo(){return this.sueldo;}

	public static void verEmpleados(){
		for (Empleado empleado:empleados){
			System.out.println(empleado);
		}
	}

	@Override
	public String toString() {
		return "ID " + id + "\n" +
				"[ Cedula: "+ getCedula() + "\n" +
				"  Nombre: "+ getNombre() + "\n" +
				"  Telefono: "+ getTelefono() + "\n" +
				"  Direccion: "+ getDireccion() + "\n" +
				"  Cargo: " + cargo + "\n" +
				"  Sueldo: " + sueldo +" ]";
	}

}

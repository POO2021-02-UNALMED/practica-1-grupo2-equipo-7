package gestorAplicacion;

public class Empleado extends Persona{
	private int id;
	private String cargo;
	private int sueldo;
	
	public Empleado(int cedula, String nombre, int telefono, String direccion, int id, String cargo, int sueldo) {
		super(cedula, nombre, telefono, direccion);
		this.setId(id);
		this.setCargo(cargo);
		this.sueldo = sueldo;
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

}

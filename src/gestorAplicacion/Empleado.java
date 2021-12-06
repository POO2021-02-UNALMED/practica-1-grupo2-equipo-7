package gestorAplicacion;

public class Empleado extends Persona{
	private int id;
	private String cargo;
	
	public Empleado(int id, String cargo) {
		super();
		this.setId(id);
		this.setCargo(cargo);
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

}

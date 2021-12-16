package gestorAplicacion;

public class Cliente extends Persona {
    int puntos = 0;
    int estatus; //2 cliente VIP, 1 cliente frecuente, 0 cliente normal.
    Reserva reserva;

    public Cliente(int cedula, String nombre, int telefono, String direccion){
        super(cedula, nombre, telefono, direccion);
    }
    public void actualizar_puntos(int puntos){
        this.puntos += puntos;
    }
    public int getPuntos(){return this.puntos;}
    // Pendiente creacion de la clase reserva para crear métodos relacionados
	public static void crearCliente(int cedula, String nombre, int telefono, String Direccion, int puntos) {
		 //Cliente.crearCliente(1009825,"ricardo",31245678,"av colombia #63-10",1000);
	}

    public int getestatus() {
        return estatus;
    }

    public void setestatus(int status) {
        this.estatus = status;
    }
}

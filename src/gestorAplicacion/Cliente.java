package gestorAplicacion;

import java.util.LinkedList;

public class Cliente extends Persona {

    protected int puntos = 0;
    protected int estatus; //2 cliente VIP, 1 cliente frecuente, 0 cliente normal.

    Reserva reserva;
    public static LinkedList<Cliente> clientes= new LinkedList<>();

    public Cliente(int cedula, String nombre, int telefono, String direccion){
        super(cedula, nombre, telefono, direccion);
    }

    public Cliente(){
        super();
    }

    public void actualizar_puntos(int puntos){
        this.puntos += puntos;
    }

    public int getPuntos(){return this.puntos;}

    // Pendiente creacion de la clase reserva para crear métodos relacionados
	public static void crearCliente(int cedula, String nombre, int telefono, String direccion) {
        Cliente newCliente=new Cliente(cedula,nombre,telefono,direccion);
        clientes.add(newCliente);
	}

    public static void verCliente(){
        for (Cliente cliente:clientes){
            System.out.println(cliente);
        }
    }

    @Override
    public String toString() {
        return "Cedula: " + getCedula() + "\n" +
                "[ Nombre: " + getNombre() + "\n" +
                "  Telefono: " + getTelefono() + "\n" +
                "  Direccion: " + getDireccion() + "\n" +
                "  Punros acumulados: " + getPuntos() + " ]";
    }

    public int getestatus() {
        return estatus;
    }

    public void setestatus(int status) {
        this.estatus = status;

    }
}

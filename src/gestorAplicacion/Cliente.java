package gestorAplicacion;

import java.util.HashMap;
import java.util.LinkedList;

public class Cliente extends Persona {

    protected int puntos = 0;
    protected int estatus; //2 cliente VIP, 1 cliente frecuente, 0 cliente normal.

    Reserva reserva;
    public static HashMap<Integer,Cliente> clientes= new HashMap<>();

    public Cliente(int cedula, String nombre, int telefono, String direccion,Reserva reserva){
        super(cedula, nombre, telefono, direccion);
        this.reserva = reserva;
    }

    public Cliente(){
        super();
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public void actualizar_puntos(int puntos){
        this.puntos += puntos;
    }

    public int getPuntos(){return this.puntos;}

    // Pendiente creacion de la clase reserva para crear métodos relacionados
	public static void crearCliente(int cedula, String nombre, int telefono, String direccion, Reserva reserva) {
        Cliente newCliente=new Cliente(cedula,nombre,telefono,direccion, reserva);
        clientes.put(cedula , newCliente);
	}

    public static void verCliente(){
        for (Cliente cliente:clientes.values()){
            System.out.println(cliente);
        }
    }



    @Override
    public String toString() {
        return "Cedula: " + getCedula() + "\n" +
                "[ Nombre: " + getNombre() + "\n" +
                "  Telefono: " + getTelefono() + "\n" +
                "  Direccion: " + getDireccion() + "\n" +
                "  Reserva: " + getReserva() + "\n" +
                "  Punros acumulados: " + getPuntos() + " ]";
    }

    public int getestatus() {
        return estatus;
    }

    public void setestatus(int status) {
        this.estatus = status;

    }
}

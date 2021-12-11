package gestorAplicacion;

import java.util.LinkedList;

public class Cliente extends Persona {
    protected int puntos = 0;
    Reserva reserva;
    public static LinkedList<Cliente> clientes= new LinkedList<>();

    public Cliente(int cedula, String nombre, int telefono, String direccion){
        super(cedula, nombre, telefono, direccion);
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

    @Override
    public String toString() {
        return "Cedula: "+getCedula() + "\n" +
                "[ Nombre: "+ getNombre() + "\n" +
                "  Telefono: "+ getTelefono() + "\n" +
                "  Direccion: "+ getDireccion() + "\n" +
                "  Punros acumulados: "+ getPuntos()+" ]";
    }
}

package gestorAplicacion;

import java.util.HashMap;
import java.util.LinkedList;

public class Cliente extends Persona {
    protected int puntos = 0;
    Reserva reserva;
    public static HashMap<Integer,Cliente> clientes= new HashMap<>();

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
        clientes.put(cedula , newCliente);
	}

    public static void verCliente(){
        for (Cliente cliente:clientes.values()){
            System.out.println(cliente);
        }
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
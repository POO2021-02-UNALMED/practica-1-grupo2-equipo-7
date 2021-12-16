package gestorAplicacion;

import java.util.HashMap;

public class Cliente extends Persona {
    protected int puntos = 0;
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


	}

package gestorAplicacion;

import java.util.HashMap;

public class Cliente extends Persona {
    int puntos = 0;
    Reserva reserva;

 
    
    public Cliente(int cedula, String nombre, int telefono, String direccion){
        super(cedula, nombre, telefono, direccion);
    }
    public void actualizar_puntos(int puntos){
        this.puntos += puntos;
    }
    public int getPuntos(){return this.puntos;}
    // Pendiente creacion de la clase reserva para crear métodos relacionados


	}

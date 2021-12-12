package gestorAplicacion;

import java.util.LinkedList;

public class Mesa {

    private int idunico;
    private String zona;
    private int numero;
    private boolean disponibilidad;
    public static LinkedList<Mesa> mesas = new LinkedList<>();
    private Pedido pedido;

    public Mesa(int idunico, String zona, int numero) {
        this.idunico = idunico;
        this.zona = zona;
        this.numero = numero;
        mesas.add(this);
    }

    public int getIdunico() {
        return idunico;
    }

    public void setIdunico(int idunico) {
        this.idunico = idunico;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public static void getMesas() {
        for (Object str : mesas){
            System.out.println(str.toString());
        }
    }
    public void entorno_Mesa(){

    }

    @Override
    public String toString() {
        if (disponibilidad) {
            return "Mesa "+numero+" (Disponible)";
        } else {
            return "Mesa "+numero+" (Ocupada)";
        }
        }
}

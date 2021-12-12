package gestorAplicacion;

import java.util.LinkedList;

public class Mesa {

    private int idunico;
    private String zona;
    private int numero;
<<<<<<< HEAD
    private boolean disponibilidad;
    public static LinkedList<Mesa> mesas = new LinkedList<>();
    private Pedido pedido;
=======
    public static LinkedList<Mesa> mesas= new LinkedList<>(); //Array que contiene todas las mesas creadas
>>>>>>> crud

    public Mesa(int idunico, String zona, int numero) {
        this.idunico = idunico;
        this.zona = zona;
        this.numero = numero;
        mesas.add(this);
    }

    public Mesa() {
    }

    public static void crearMesa(int id, String zona, int numMesa) {
        Mesa newMesa=new Mesa(id,zona,numMesa);
        mesas.add(newMesa);
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

<<<<<<< HEAD
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
=======
    public static void verMesas(){
        for (Mesa mesa:mesas){
            System.out.println(mesa);
        }
    }

    @Override
    public String toString() {
        return "ID (" + idunico +")" + "\n" +
                "[ Mesa numero: " + numero + "\n" +
                "  Zona: " + zona  + " ]";
    }

>>>>>>> crud
}

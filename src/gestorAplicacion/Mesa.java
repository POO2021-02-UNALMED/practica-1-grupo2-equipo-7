package gestorAplicacion;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Mesa {

    private int idunico;
    private int numero;
    private short zona;
    private boolean disponibilidad = true;
    private Pedido pedido;
    private LinkedList<Catalogo> pedidoM = new LinkedList<>();
    public static HashMap<Integer,Mesa> mesas= new HashMap<>(); //HashMap que contiene todas las mesas creadas


    public Mesa(int idunico, short zona, int numero) {
        this.idunico = idunico;
        this.zona = zona;
        this.numero = numero;
        mesas.put(numero,this);
    }

    public Mesa() {

    }



    /*public static void crearMesa(int id, short zona, int numMesa) {
        Mesa newMesa=new Mesa(id,zona,numMesa);
        mesas.add(newMesa);
    }*/

    public int getIdunico() {
        return idunico;
    }

    public void setIdunico(int idunico) {
        this.idunico = idunico;
    }

    public String getZona() {
        switch (this.zona){
            case 1:
                return "VIP";
            case 2:
                return "Salón principal";
            case 3:
                return "Terraza";
            default:
                return "Código de zona inválido.";
        }
    }

    public void setZona(short zona) {
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

   /* public static void getMesas() {
        for (Object str : mesas){
            System.out.println(str.toString());
        }
    }*/
   public Catalogo entornoMesa() {
       Scanner in=new Scanner(System.in);
       int op = in.nextInt();
       try {
           if (this.pedido.getPlatos() == null) {
                Catalogo.verCatalogo();
                op = in.nextInt();
                pedidoM.add(Catalogo.platos.get(op));
                while(op != 0) {
                op = 0;

                }

           } else {
               for (Catalogo plato : this.pedido.getPlatos()) {
                   System.out.println(plato);
               }

           }
       } catch (NullPointerException e) {
       }
       return null;
   }

    public void tomadePedido(){}

    @Override
    public String toString() {
        if (disponibilidad) {
            return "Mesa "+this.numero+" (Disponible)";
        } else {
            return "Mesa "+this.numero+" (Ocupada)";
        }
        }

    public static void verMesas(){
        for (Mesa mesa:mesas.values()){
            System.out.println(mesa);
        }
    }



    /*@Override
    public String toString() {
        return "ID (" + this.idunico +")" + "\n" +
                "[ Mesa numero: " + this.numero + "\n" +
                "  Zona: " + this.zona  + " ]\n" +
                "Disponibilidad "+ this.disponibilidad;
    }*/


}

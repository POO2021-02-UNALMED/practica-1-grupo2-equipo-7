package gestorAplicacion;

import uiMain.Interfaz;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.*;

public class Mesa implements Serializable {

    private int idunico;
    private int numero;
    private short zona;
    private boolean disponibilidad = true;
    private Pedido pedido;
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

    public Pedido getPedido() {
        return pedido;
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
   public void entornoMesa(Cliente cliente) {
       Scanner in=new Scanner(System.in);
       int op, val = 0;
       Random idPedido = new Random();
        HashMap<Catalogo, Integer> pedidoM = new HashMap<>();
       Catalogo.verCatalogo();
       if(this.pedido == null){ pedido = new Pedido(cliente, this, idPedido.nextInt(1000), pedidoM);
       this.disponibilidad = false;} else {
           System.out.println("-----------------------------------");
           System.out.println("Pedido actual: ");
           System.out.println("Plato(c/u)        /Cant./Precio");
           System.out.println("");
           for (Map.Entry<Catalogo, Integer> plato: this.pedido.getPlatos().entrySet()) {
               Catalogo key=plato.getKey();
               Integer value=plato.getValue();
               System.out.println(key+ " / " +value+" / "+ (value* key.getPrecio())+"$");
               val += value* key.getPrecio();
           }
           System.out.println("-----------------------------------");
           }

       System.out.println("Elija uno por uno los items que desea agregar a su pedido, con 0 finaliza el pedido.\n" +
               "Escriba 0000 Para realizar la factura de la mesa actual. ");
       op = in.nextInt();
       if(op == 0000){
           this.pedido.Recibo(val);
           for (Map.Entry<Catalogo, Integer> plato: this.pedido.getPlatos().entrySet()) {
               Catalogo key=plato.getKey();
               Integer value=plato.getValue();
                Catalogo.descontarInsumos(key, value);}
           this.pedido = null;
           this.disponibilidad = true;
       }else {
           System.out.println("Elija la cantidad que desea del plato seleccionado: ");
           int cant = in.nextInt();
           pedidoM.put(Catalogo.platos.get(op), (Integer) cant);
           while (op != 0) {
               System.out.println("Elija uno por uno los items que desea agregar a su pedido, con 0 finaliza el pedido. ");
               op = in.nextInt();
               if (op != 0) {
                   System.out.println("Elija la cantidad que desea del plato seleccionado: ");
                   cant = in.nextInt();
                   pedidoM.put(Catalogo.platos.get(op), (Integer) cant);
                   val += Catalogo.platos.get(op).precio * cant;
               }
           }
       }

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

package gestorAplicacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Pedido {

    private HashMap<Catalogo, Integer> platos; //Hash que guarda el contenido de cada pedido con la cantidad de cada plato
    private Cliente cliente;
    private Mesa mesa;
    private int idpedido;
    public static LinkedList<Pedido> pedidos= new LinkedList<>();; //Array que contiene los pedidos

    //private int cantidadplatos; #variable para uso con array statico
    public void Recibo() {

    }




    public Pedido(Cliente cliente, Mesa mesa, int idpedido, HashMap<Catalogo, Integer> platos) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.idpedido = idpedido;
        this.platos =platos;
    }

    public HashMap<Catalogo, Integer> getPlatos() {
        if(platos.isEmpty()){
            return null;
        } else {
        return platos;}
    }

    public void setPlatos(HashMap<Catalogo, Integer> platos) {
        this.platos = platos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public static void crearPedido(Cliente cliente, Mesa mesa, int idpedido, HashMap<Catalogo, Integer> pedidosPlato) {
        Pedido newPedido=new Pedido(cliente,mesa,idpedido,pedidosPlato);
        pedidos.add(newPedido);
    }

    public static void verPedidos(){
        for (Pedido pedido:pedidos){
            System.out.println(pedido);
        }
    }


    @Override
    public String toString() {
        return "Pedido Numero (" + idpedido +")" +"\n" +
                "[ Cliente: " + cliente + "\n" +
                "  Mesa: " + mesa + "\n" +
                "  Pedidos: " + platos + " ]";

    }

}

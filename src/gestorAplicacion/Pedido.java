package gestorAplicacion;

import java.util.ArrayList;

public class Pedido {

    private Cliente cliente;
    private Mesa mesa;
    private int idpedido;
    ArrayList<Catalogo> platos = new ArrayList<Catalogo>(); //Array que contiene los platos del pedido

    //private int cantidadplatos; #variable para uso con array statico

//    public void Recibo {
//
//    }



    public Pedido(Cliente cliente, Mesa mesa, int idpedido, ArrayList<Catalogo> platos) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.idpedido = idpedido;
        this.platos = platos;
    }

    public ArrayList<Catalogo> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Catalogo> platos) {
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

}

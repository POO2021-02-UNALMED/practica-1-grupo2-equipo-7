package gestorAplicacion;

import java.awt.font.LineMetrics;
import java.io.Serializable;
import java.util.*;

import static gestorAplicacion.Cliente.clientes;
import static gestorAplicacion.materiaPrima.insumos;

public class Catalogo implements Serializable {

    private static Integer idPlato = 1;
    protected String nombrePlato;//atributos del nombre y precio del plato que ira en el catalogo
    protected int precio;
    public static TreeMap<Integer,Catalogo> platos=new TreeMap<>();//Treemap que sirve como catalogo donde se encuentran los platos que ofrece el restaurante,los identificamos con una llave numerica
    public HashMap<String,Double> insumosPlato;

    protected static int cantPlatos = 0;
    //constructor
    public Catalogo(String nombrePlato,int precio,HashMap<String,Double> insumo) {
        this.nombrePlato = nombrePlato;
        this.precio = precio;
        cantPlatos++;
        this.insumosPlato=insumo;
    }

    //getters y setters
    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }



    //metodo para crear o agregar un plato al catologo
    public static void crearCatalogo(String nombr,int prec,HashMap<String,Double> insumo) {
      Catalogo newC=new Catalogo(nombr,prec,insumo);
      platos.put(idPlato,newC);
      idPlato++;
    }

    public HashMap<String, Double> getInsu() {
        return insumosPlato;
    }

    public void setInsu(HashMap<String, Double> insu) {
        this.insumosPlato = insu;
    }

    //Este es el metodo que muestra el catalogo de platos y precios
    //para que el cajero pueda tomar el pedido
    public static void verCatalogo() {
        //primero se comprueba que si haya algo en el catalogo
        //si no hay nada, muestra una advertencia
        if(platos.isEmpty()){
            System.out.println("no hay platos para ver");
        }else{
            //pero si no esta vacio,recorre el treemap mostrando la llave y su valor
            System.out.println("-----------------------------");
            System.out.println("Catálogo: ");
            for (Map.Entry<Integer,Catalogo> plato: platos.entrySet()) {
                Integer key=plato.getKey();
                Catalogo value=plato.getValue();
                System.out.println(" "+key+ " " +value);
            }
            System.out.println("-----------------------------");
        }
    }

    public static void descontarInsumos(Catalogo plato1, Integer cant) {
        Scanner in=new Scanner(System.in);
        if(platos.isEmpty()){
            System.out.println("no hay platos para ver");
        }else{
                    for (Map.Entry<String,Double> plato: plato1.insumosPlato.entrySet()){
                        for (Map.Entry<String,Double> insumo: insumos.entrySet()) {
                            if (plato.getKey().equals(insumo.getKey())){
                                double cantidad=insumo.getValue()-plato.getValue();
                                insumo.setValue(cantidad);
                                System.out.println(" cantidad removida con exito");
                            }
                        }
                    }


        }
    }




    //metodo toString para visualizar los datos del treemap
    @Override
    public String toString() {
        return nombrePlato+"($"+precio+")";
    }

    /*public String insum() {
        return "[" +
                "Plato='" + nombrePlato + "\n" +
                ", Insumos= $" + insumos +
                ']';
    }*/

    /*for (Map.Entry<String,Double> ins: insumosPlato.entrySet()) {
                        String ky=ins.getKey();
                        Double valor=ins.getValue();
                        System.out.println(" "+ky+ " " +valor);
                    }
                    System.out.println("-----------------------------");*/

}


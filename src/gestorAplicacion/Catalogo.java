package gestorAplicacion;

import java.util.Map;
import java.util.TreeMap;

public class Catalogo {

    protected static int idPlato=1; //contador que sirva como llave unica para identificar un plato del catalogo
    protected String nombrePlato;//atributos del nombre y precio del plato que ira en el catalogo
    protected int precio;
    public static TreeMap<Integer,Catalogo> platos=new TreeMap<>();//Treemap que sirve como catalogo donde se encuentran los platos que ofrece el restaurante,los identificamos con una llave numerica

    //constructor
    public Catalogo(String nombrePlato,int precio) {
        this.nombrePlato = nombrePlato;
        this.precio = precio;
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
    public static void crearCatalogo(String nombr,int prec) {
      Catalogo newC=new Catalogo(nombr,prec);
      platos.put(idPlato,newC);
      idPlato++;
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
            for (Map.Entry<Integer,Catalogo> plato: platos.entrySet()) {
                Integer key=plato.getKey();
                Catalogo value=plato.getValue();
                System.out.println(" "+key+" "+value);
            }
        }
    }

    //metodo toString para visualizar los datos del treemap
    @Override
    public String toString() {
        return "[" +
                "Plato='" + nombrePlato + '\'' +
                ", Precio= $" + precio +
                ']';
    }
}

package gestorAplicacion;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class materiaPrima {

    //Proveedor proveedor;
    protected String nombreInsumo;//atributos
    protected double cantInsumo;
    public static TreeMap<String,Double> insumos=new TreeMap<>();//hash para almacenar el nombre y la cantidad del insumo


    //constructor
    public materiaPrima(String nombreInsumo, double cantInsumo) {
        this.nombreInsumo = nombreInsumo;
        this.cantInsumo = cantInsumo;
        insumos.put(nombreInsumo,cantInsumo);
    }

    public String getNombreInsumo() {
        return nombreInsumo;
    }

    public void setNombreInsumo(String nombreInsumo) {
        this.nombreInsumo = nombreInsumo;
    }

    public double getCantInsumo() {
        return cantInsumo;
    }

    public void setCantInsumo(int cantInsumo) {
        this.cantInsumo = cantInsumo;
    }

    public static TreeMap<String, Double> getInsumos() {
        return insumos;
    }

    public static void setInsumos(TreeMap<String, Double> insumos) {
        materiaPrima.insumos = insumos;
    }

    //metodo para crear un nuevo insumo
    public static void crearInsumo(String nombre,int cantidad) {
        materiaPrima newM = new materiaPrima(nombre, cantidad);
    }


    public static void verInsumos() {
        if(insumos.isEmpty()){
            System.out.println("no hay insumos para ver");
        }else{
            //pero si no esta vacio,recorre el treemap mostrando la llave y su valor
            System.out.println("-----------------------------");
            for (Map.Entry<String,Double> insumo: insumos.entrySet()) {
                String key=insumo.getKey();
                Double value=insumo.getValue();
                System.out.println(" "+key+ " " +value);
            }
            System.out.println("-----------------------------");
        }
    }

    @Override
    public String toString() {
        return "[" +
                "nombre del insumo='" + nombreInsumo + '\'' +
                ", peso=" + cantInsumo +"lb " + '\'' +
                ']';
    }
}

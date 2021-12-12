package gestorAplicacion;

import java.util.Hashtable;
import java.util.Scanner;

public class materiaPrima {

    //Proveedor proveedor;
    protected String nombreInsumo;//atributos
    protected int cantInsumo;
    public static Hashtable<String,Integer> insumos=new Hashtable<>();//hash para almacenar el nombre y la cantidad del insumo

    //constructor
    public materiaPrima(String nombreInsumo, int cantInsumo) {
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

    public int getCantInsumo() {
        return cantInsumo;
    }

    public void setCantInsumo(int cantInsumo) {
        this.cantInsumo = cantInsumo;
    }

    public static Hashtable<String, Integer> getInsumos() {
        return insumos;
    }

    public static void setInsumos(Hashtable<String, Integer> insumos) {
        materiaPrima.insumos = insumos;
    }

    //metodo para crear un nuevo insumo
    public static void crearInsumo(String nombre,int cantidad) {
        materiaPrima newM = new materiaPrima(nombre, cantidad);
    }


    public static void verInsumos() {
        for(Integer insumo:insumos.values()){
            System.out.println(insumo);
        }
    }

    @Override
    public String toString() {
        return "[" +
                "nombre del insumo='" + nombreInsumo + '\'' +
                ", peso=" + cantInsumo +"kg " + '\'' +
                ']';
    }
}

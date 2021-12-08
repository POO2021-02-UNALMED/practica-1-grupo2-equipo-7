package gestorAplicacion;

import java.util.Hashtable;
import java.util.Scanner;

public class materiaPrima {

    //Proveedor proveedor;
    protected String nombreInsumo;
    protected int cantInsumo;
    public static Hashtable<String,Integer> insumos=new Hashtable<>();

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

    public static void crearInsumo(String nombre,int cantidad) {
        materiaPrima newM=new materiaPrima(nombre,cantidad);
    }

    public static void menuInsumos() {
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Escoja una opcion:");
            System.out.println("1. ver insumos.");
            System.out.println("2. metodo 2.");
            System.out.println("3. metodo 3.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
                verInsumos();
            }else if (option.equals("2")) {
                System.out.println("none");
            }else if (option.equals("3")) {
                System.out.println("none");
            }else if(option.equals("0")){
                return;
            }
        }
    }


    public static void verInsumos() {
        if(insumos.isEmpty()){
            System.out.println("no hay insumos para ver");
        }else{
            for(Integer insumo:insumos.values()){
                System.out.println(insumo);
            }
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

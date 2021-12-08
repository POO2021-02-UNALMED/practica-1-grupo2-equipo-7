package gestorAplicacion;

import java.util.Hashtable;
import java.util.Scanner;

public class Catalogo {

    protected static int idPlato=1;
    protected String nombrePlato;
    protected int precio;
    public static Hashtable<Integer,Catalogo> platos=new Hashtable<>();

    public Catalogo(String nombrePlato,int precio) {
        this.nombrePlato = nombrePlato;
        this.precio = precio;
    }

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

    public static Hashtable<Integer, Catalogo> getPlatos() {
        return platos;
    }

    public static void setPlatos(Hashtable<Integer, Catalogo> platos) {
        Catalogo.platos = platos;
    }

    public static void crearCatalogo(String nombr,int prec) {
      Catalogo newC=new Catalogo(nombr,prec);
      platos.put(idPlato,newC);
      idPlato++;
    }

    public static void menuCatalogo() {
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Escoja una opcion:");
            System.out.println("1. ver catalogo.");
            System.out.println("2. metodo 2.");
            System.out.println("3. metodo 3.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
                verCatalogo();
            }else if (option.equals("2")) {
                System.out.println("none");
            }else if (option.equals("3")) {
                System.out.println("none");
            }else if(option.equals("0")){
                return;
            }
        }
    }


    public static void verCatalogo() {
        if(platos.isEmpty()){
            System.out.println("no hay pltos para ver");
        }else{
            for(Catalogo plato:platos.values()){
                System.out.println(plato);
            }
        }
    }

    @Override
    public String toString() {
        return "[" +
                "Plato='" + nombrePlato + '\'' +
                ", Precio= $" + precio +
                ']';
    }
}

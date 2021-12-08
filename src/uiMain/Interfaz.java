package uiMain;

import baseDatos.BaseDeDatos;
import gestorAplicacion.Catalogo;
import gestorAplicacion.materiaPrima;

import java.util.Scanner;

public class Interfaz {


	public static void main(String[] args) {
	    BaseDeDatos base=new BaseDeDatos();
	    base.baseDeDatos();
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Bienvenido al sistema POOpina");
            System.out.println("Escoja una opcion:");
            System.out.println("1. metodo 1.");
            System.out.println("2. metodo 2.");
            System.out.println("3. metodo 3.");
            System.out.println("4. Catalogo");
            System.out.println("5. Insumos");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
                System.out.println("metodo 1");
            }else if (option.equals("2")) {
            	System.out.println("metodo 2");
            }else if (option.equals("3")) {
            	System.out.println("metodo 3");
            }else if(option.equals("4")){
                Catalogo.menuCatalogo();
            }else if(option.equals("5")){
                materiaPrima.menuInsumos();
            }else if(option.equals("0")){
                break;
            }
        }
	}
}

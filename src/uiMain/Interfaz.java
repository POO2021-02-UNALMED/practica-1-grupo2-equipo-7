package uiMain;

import baseDatos.BaseDeDatos;
import gestorAplicacion.*;
import java.util.Scanner;

public class Interfaz {


	public static void main(String[] args) {
	    BaseDeDatos base=new BaseDeDatos();
	    base.baseDeDatos();
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
        Cliente cliente = null;
        Reserva reserva = null;
		String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Bienvenido al sistema POOpina");
            System.out.println("Escoja una opcion:");
            System.out.println("1. resevas.");
            System.out.println("2. Consulta de puntaje.");
            System.out.println("3. metodo 3.");
            System.out.println("4. Catalogo");
            System.out.println("5. Insumos");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            
            if (option.equals("1")) {
            	 System.out.println("Bienvenido al sistema de reservas");
            	Scanner numcc=new Scanner(System.in);
            	System.out.println("Ingrese un numero de cedula");
            	if ((boolean) (cliente.getCedula() == reserva.getCliente().getCedula())) {
            		System.out.println("usted ya cuenta con una reserva");
            	}
            		else {
            			System.out.println("usted acaba de crear una reserva con la cedula"+Persona.getcedula);
            		}
            	
            
               
            }else if (option.equals("clientes frecuentes")) {
            	System.out.println("en esta base de datos se almacena la información de todos nuestros clientes frecuentes");
            	
            	System.out.println(cliente.getcrearCliente);
            	//falta hacer un array alguna estructura de datos donde almacenar a los clientes
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


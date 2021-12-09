package uiMain;

import baseDatos.BaseDeDatos;
import gestorAplicacion.*;
import java.util.Scanner;

import static gestorAplicacion.Catalogo.platos;

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
            	System.out.println("en esta base de datos se almacena la informaci�n de todos nuestros clientes frecuentes");
            	
            	//System.out.println(cliente.getcrearCliente);
            	//falta hacer un array alguna estructura de datos donde almacenar a los clientes
            }else if (option.equals("3")) {
            	System.out.println("metodo 3");
            }else if(option.equals("4")){
                menuCatalogo();
            }else if(option.equals("5")){
                menuInsumos();
            }else if(option.equals("0")){
                break;
            }
        }
	}

    //menu donde se podra ver todo lo relacionado con el catalogo del restaurante
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
                //Esta opcion permite ver el catalogo de platos disponibles para que se pueda tomar el pedido
                Catalogo.verCatalogo();//Muestra el catalogo
                System.out.println(" Digite el numero de plato que desee");
                Integer num= in.nextInt();
                //despues de que haya escogido le pide al cajero que digite el numero del plato escogido
                //si el cajero digita un numero erroneo lo vuelve a pedir
                if (platos.containsKey(num)) {
                    //como el plato existe con esa llave numerica
                    //procede a crear un plato que sera el pedido por el user
                    //este plato contiene los valores(values) de la llave que se pidio anteriormente
                    Catalogo plato=platos.get(num);
                    System.out.println(" Nombre= "+plato.getNombrePlato());
                    System.out.println(" precio= " +plato.getPrecio());
                    System.out.println(" Agregado al pedido");
                    //en esta linea debe ir un metodo de Pedido donde se le ingrese el plato con
                    //el cual se generaria el pedido final lo cual tambien permitira crear el recibo
                }else{
                    System.out.println(" Digite un numero valido");
                }
            }else if (option.equals("2")) {
                System.out.println("none");
            }else if (option.equals("3")) {
                System.out.println("none");
            }else if(option.equals("0")){
                return;
            }
        }
    }

    //menu donde se podra ver todo lo relacionado con insumos de la clase materiaPrima
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
                materiaPrima.verInsumos();//muestra los insumos disponibles
            }else if (option.equals("2")) {
                System.out.println("none");
            }else if (option.equals("3")) {
                System.out.println("none");
            }else if(option.equals("0")){
                return;
            }
        }
    }



}


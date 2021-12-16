package uiMain;

import baseDatos.BaseDeDatos;
import gestorAplicacion.*;

import java.util.ArrayList;
import java.util.Scanner;

import static gestorAplicacion.Catalogo.platos;

public class Interfaz {

    private static int CedulaCLiente;

	public static void main(String[] args) {
	    BaseDeDatos base=new BaseDeDatos();
	    base.baseDeDatos();
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
        Cliente cliente = null;
        Reserva reserva = null;
		String option;
        label:
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

            switch (option) {
                case "1":
                    System.out.println("Bienvenido al sistema de reservas");
                    Scanner numcc = new Scanner(System.in);
                    System.out.println("Ingrese un numero de cedula");
                    if ((boolean) (cliente.getCedula() == reserva.getCliente().getCedula())) {
                        System.out.println("usted ya cuenta con una reserva");
                    } else {
                        System.out.println("usted acaba de crear una reserva con la cedula" + Persona.getcedula);
                    }


                    break;
                case "2":
                    menuPuntos();
                    //System.out.println("en esta base de datos se almacena la información de todos nuestros clientes frecuentes");

                    //System.out.println(cliente.getcrearCliente);
                    //falta hacer un array alguna estructura de datos donde almacenar a los clientes
                    break;
                case "3":
                    System.out.println("metodo 3");
                    break;
                case "4":
                    menuCatalogo();
                    break;
                case "5":
                    menuInsumos();
                    break;
                case "0":
                    break label;
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
            switch (option) {
                case "1":
                    //Esta opcion permite ver el catalogo de platos disponibles para que se pueda tomar el pedido
                    Catalogo.verCatalogo();//Muestra el catalogo

                    System.out.println(" Digite el numero de plato que desee");
                    Integer num = in.nextInt();
                    //despues de que haya escogido le pide al cajero que digite el numero del plato escogido
                    //si el cajero digita un numero erroneo lo vuelve a pedir
                    if (platos.containsKey(num)) {
                        //como el plato existe con esa llave numerica
                        //procede a crear un plato que sera el pedido por el user
                        //este plato contiene los valores(values) de la llave que se pidio anteriormente
                        Catalogo plato = platos.get(num);
                        System.out.println(" Nombre= " + plato.getNombrePlato());
                        System.out.println(" precio= " + plato.getPrecio());
                        System.out.println(" Agregado al pedido");
                        //en esta linea debe ir un metodo de Pedido donde se le ingrese el plato con
                        //el cual se generaria el pedido final lo cual tambien permitira crear el recibo
                    } else {
                        System.out.println(" Digite un numero valido");
                    }
                    break;
                case "2":
                    System.out.println("none");
                    break;
                case "3":
                    System.out.println("none aún");
                    break;
                case "0":
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

    //menu donde se podra ver todo lo relacionado con los puntos de los clientes
    public static void menuPuntos() {
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Verificar.");
            System.out.println("2. Actualizar estatus segun puntos.");
            System.out.println("3. Canjear puntos.");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {

                Scanner cedulascan=new Scanner(System.in);
                String cedula;
                cedula = cedulascan.next();
                CedulaCLiente = Integer.parseInt(cedula);
                ArrayList<Cliente> pruebacedula = new ArrayList();

                //Busca la cedula ingresada en el array de clientes
                for (int i = 0; i < pruebacedula.size(); i++) {

                    Cliente clienteprueba = pruebacedula.get(i);
                    if (clienteprueba.getCedula() == CedulaCLiente){

                        System.out.println("Nombre" + clienteprueba.getNombre());
                        //Verificacion del estuatus segun atributo, 0 normal, 1 frecuente, 2 VIP
                        if (clienteprueba.getestatus() == 0) {
                            System.out.println("Su estatus es" + "Cliente normal");
                        }else if(clienteprueba.getestatus() == 1){
                            System.out.println("Su estatus es" + "Cliente frecuente");
                        }else if(clienteprueba.getestatus() == 2){
                            System.out.println("Su estatus es" + "Cliente VIP");
                        }
                        System.out.println("Sus puntos son:" + clienteprueba.getPuntos());
                    }

                }
                return;

            }else if (option.equals("2")) {
                //asignador de estatus segun cantidad de puntos
                ArrayList<Cliente> prueba = new ArrayList();
                for (int i = 0; i < prueba.size(); i++) {

                    Cliente clientepuntos = prueba.get(i);
                    int leerpuntos = clientepuntos.getPuntos();
                    int status = clientepuntos.getestatus();

                    //verifica los clientes que anteriormente no eran frecuentes o VIP.
                    if (status == 0) {
                        if (leerpuntos < 10000) {
                            clientepuntos.setestatus(0);
                        } else if (leerpuntos > 10000 && leerpuntos < 100000) {
                            clientepuntos.setestatus(1);
                        } else if (leerpuntos > 100000) {
                            clientepuntos.setestatus(2);
                        }
                        //verifica para los clientes subir a VIP, no los degrada a cliente normal despues de ser frecuente.
                    } else if (status == 1) {
                        if (leerpuntos > 100000) {
                            clientepuntos.setestatus(2);
                        }
                    }
                }
                //Para los clientes VIP no se hace chequeo, una ves VIP no se degradan.
                System.out.println("Estatus de clientes actualizado");
                return;

            }else if (option.equals("3")) {
                menucanjeoPuntos();;
            }else if(option.equals("0")){
                return;
            }
        System.out.println("sistema actualizado");
        }
    }

    //menu donde se podra ver todo lo relacionado con el canjeo de puntos de los clientes
    public static void menucanjeoPuntos() {
        Scanner in=new Scanner(System.in);
        String option;
        ArrayList<Cliente> prueba = new ArrayList();
                while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Escoja una opcion para canjeo de puntos:");
            System.out.println("1. (5.000 puntos) Postre tradicional de la casa.");
            System.out.println("2. (20.000 puntos) Vino Colección Reserva.");
            System.out.println("3. Pago Con puntos. (50.000 puntos en adelante)");
            System.out.println("0. Salir.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            if (option.equals("1")) {
                //Busca la cedula ingresada en el array de clientes
                for (int i = 0; i < prueba.size(); i++) {

                    Cliente clienteprueba = prueba.get(i);
                    if (clienteprueba.getCedula() == CedulaCLiente) {
                        //verifica la cantidad de puntos y procede a hacer el descuento en caso de ser posible
                        if (clienteprueba.getPuntos()>5000) {
                            clienteprueba.actualizar_puntos(clienteprueba.getPuntos() - 5000);
                            System.out.println("retiro de puntos realizado");
                        }else {
                            System.out.println("no dispone de suficientes puntos");
                        }
                    }
                }
                return;
            }else if (option.equals("2")) {
                //Busca la cedula ingresada en el array de clientes
                for (int i = 0; i < prueba.size(); i++) {

                    Cliente clienteprueba = prueba.get(i);
                    if (clienteprueba.getCedula() == CedulaCLiente) {
                        //verifica la cantidad de puntos y procede a hacer el descuento en caso de ser posible
                        if (clienteprueba.getPuntos()>20000) {
                            clienteprueba.actualizar_puntos(clienteprueba.getPuntos() - 20000);
                            System.out.println("retiro de puntos realizado");
                        }else {
                            System.out.println("no dispone de suficientes puntos");
                        }
                    }
                }
                return;
            }else if (option.equals("3")) {
                //implementar opcion de pago de factura con puntos
               /* //Busca la cedula ingresada en el array de clientes
                for (int i = 0; i < prueba.size(); i++) {

                    Cliente clienteprueba = prueba.get(i);
                    if (clienteprueba.getCedula() == CedulaCLiente) {
                        //verifica la cantidad de puntos y procede a hacer el descuento en caso de ser posible
                        if (clienteprueba.getPuntos()>20000) {
                            clienteprueba.actualizar_puntos(clienteprueba.getPuntos() - 20000);
                            System.out.println("retiro de puntos realizado");
                        }else {
                            System.out.println("no dispone de suficientes puntos");
                        }
                    }
                }*/
            }else if(option.equals("0")){
                return;
            }
        }
    }



}


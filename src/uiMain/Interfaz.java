package uiMain;

import baseDatos.BaseDeDatos;
import gestorAplicacion.*;


import java.sql.SQLOutput;
import java.util.Scanner;

import static gestorAplicacion.Catalogo.platos;
import static gestorAplicacion.Mesa.mesas;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

import static gestorAplicacion.Catalogo.platos;
import static gestorAplicacion.Cliente.clientes;
import static gestorAplicacion.Empleado.empleados;
import static gestorAplicacion.Mesa.mesas;
import static gestorAplicacion.Pedido.pedidos;
import static gestorAplicacion.Persona.getcedula;
import static gestorAplicacion.Proveedor.proveedores;
import static gestorAplicacion.Reserva.reservas;
import static gestorAplicacion.Mesa.*;


public class Interfaz {


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
            System.out.println("4. Pedido y facturaci�n.");
            System.out.println("5. Gestion del restaurante");
            System.out.println("6. ");
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
                        System.out.println("Usted no cuenta con resevas porfavor seleccione una opcion");
                        System.out.println("1 Crear reserva");
                        System.out.println("0 volver al menu anterior");
                        
                       switch (option) {
                       case "1":
                    	   System.out.println("Usted esta creando una reserva porfavor proporcione los datos requeridos");
                    	   Scanner id = new Scanner(System.in);
                    	   System.out.println("ingrese su documento de identidad");
                    	   Scanner fechares = new Scanner(System.in);
                    	   System.out.println("ingrese una fecha para su reserva");
                    	   Scanner horares = new Scanner(System.in);
                    	   System.out.println("igrese una hora para su reserva");
                    	   Scanner sederes = new Scanner(System.in);
                    	   System.out.println("ingrese un numero de sede para su reserva");
                    	   System.out.println("su reserva se ha guardado exitosamente con el #cc"+id+"para la fecha"+fechares+"a las"+
                    		horares+"en la sede"+sederes);
                    	  
                       }
                       break;
                       
                    }


                    break;
                case "2":
                    System.out.println("en esta base de datos se almacena la informaci�n de todos nuestros clientes frecuentes");

                    //System.out.println(cliente.getcrearCliente);
                    //falta hacer un array alguna estructura de datos donde almacenar a los clientes
                    break;
                case "3":
                    System.out.println("Bienvenido al sistema para registrar clientes");
                    System.out.println("Ingrese un numero de documento");
                    Integer num = in.nextInt();
                    Scanner nombre = new Scanner (System.in);
                    String cadena;
                    System.out.println("ingrese un nombre a fin con el numero de documento");
                    cadena = nombre.next();
                    System.out.println("Se ha registrado a"+ nombre +"con el documento#"+num+"de forma exitosa");
                    break;
                case "4":

                    pedido_facturacion();
                    break;
                case "5":
                    gestionRestaurante();
                    break;
                case "6":
                    menuInsumos();
                    break;
                case "0":
                    break label;
            }
        }
    }

    private static void gestionRestaurante() {
	    //Este menu funcionara como el crud de todas las clases del programa
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Cliente.");
            System.out.println("2. Empleado.");
            System.out.println("3. Reserva.");
            System.out.println("4. Pedido.");
            System.out.println("5. Mesa.");
            System.out.println("6. Proveedor.");
            System.out.println("7. Sede.");
            System.out.println("0. Volver.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            switch (option) {
                case "1":
                    menuCliente();//menu donde se podra ver y editar toda la informacion relacionada con los clientes
                    break;
                case "2":
                    menuEmpleado();//menu donde se podra ver y editar toda la informacion relacionada con los empleados
                    break;
                case "3":
                    menuReserva();//menu donde se podra ver y editar toda la informacion relacionada con las reservas
                    break;
                case "4":
                    menuPedido();//menu donde se podra ver y editar toda la informacion relacionada con los pedidos
                    break;
                case "5":
                    menuMesa();//menu donde se podra ver y editar toda la informacion relacionada con las mesas
                    break;
                case "6":
                    menuProveedor();//menu donde se podra ver y editar toda la informacion relacionada con los proveedores
                    break;
                case "7":
                    menuSede();//menu donde se podra ver y editar toda la informacion relacionada con las sedes
                    break;
                case "0":
                    return;
            }
        }
    }

    private static void menuCliente() {
	    //Menu con todo lo relacionado al cliente
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println(" Menu Cliente. ");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Crear cliente.");
            System.out.println("2. Editar cliente.");
            System.out.println("3. Eliminar cliente.");
            System.out.println("4. Ver clientes.");
            System.out.println("5. .");
            System.out.println("6. .");
            System.out.println("7. .");
            System.out.println("0. Volver.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            switch (option) {
                case "1"://en esta opcion se podra crear un cliente
                    System.out.println(" Por favor ingrese la cedula del cliente");
                    int cedula=in.nextInt();//primero se pide la cedula
                    //despues se comprueba de que no exista ningun cliente con esta cedula
                    //ya que la cedula es unica y no deben haber dos con la misma
                    for (Cliente cliente: clientes ){ //recorre la lista de clientes
                        if (cliente.getCedula()==cedula){ //encuentra un cliente que ya tiene esta cedula
                            System.out.println(" Esta cedula ya existe ");
                            return;
                            //luego imprime una advertencia y se sale
                        }
                    }
                    //llegado a este punto se comprobo que la cedula es valida
                    //por ende se terminan de pedir la informacion restante para crear el cliente
                    System.out.println(" Por favor ingrese el nombre");
                    String nombre=in.next();
                    System.out.println(" Por favor ingrese el telefono");
                    int telefono= in.nextInt();
                    System.out.println(" Por favor ingrese la direccion");
                    String direccion= in.next();
                    Cliente.crearCliente(cedula,nombre,telefono,direccion);//aca se crea el cliente
                    System.out.println(" �Cliente creado con exito!");
                    break;
                case "2"://en esta opcion se editara la informacion del cliente
                    System.out.println("-----------------------------");
                    System.out.println(" Lista de clientes");//Primero se muestran los clientes para que el usuario escoja el que quiere editar
                    for (Cliente cliente: clientes ){
                        System.out.println(cliente);
                    }
                    System.out.println("-----------------------------");
                    System.out.println();
                    System.out.println(" Digite la cedula del cliente que desea editar");
                    int cedu=in.nextInt();//se pide la cedula del cliente que se escogio para editar
                    for (Cliente cliente1: clientes ){
                        if (cliente1.getCedula()==cedu){//se encuentra el cliente
                            System.out.println("-----------------------------");
                            System.out.println(" Cliente a editar");
                            System.out.println(cliente1);//se muestra el cliente que se va a editar solo para comprobar
                            System.out.println("Escoja una opcion:");//menu para escoger la informacion especifica del cliente a editar
                            System.out.println("1. Editar cedula.");
                            System.out.println("2. Editar nombre.");
                            System.out.println("3. Editar telefono.");
                            System.out.println("4. Editar direccion.");
                            System.out.println("0. Salir.");
                            System.out.println("-----------------------------");
                            option = in.next();
                            if (option.equals("1")) {//opcion para editar la cedula
                                System.out.println(" Cedula actual");
                                System.out.println(cliente1.getCedula());//se muestra la cedula actual,antes de ser editada
                                System.out.println(" Digite la nueva cedula");
                                int cedul=in.nextInt();//se pide la nueva cedula
                                //y se comprueba de que no exista ningun cliente registrado con esta cedula
                                for (Cliente cliente2: clientes ){
                                    if (cliente2.getCedula()==cedul){
                                        System.out.println(" Esta cedula ya existe ");
                                        return;
                                    }
                                }
                                //como la cedula es valida se procede a editar
                                cliente1.setCedula(cedul);//aca se edita la cedula
                                System.out.println(" �Cedula editada con exito!");
                            }else if (option.equals("2")) {//opcion para editar el nombre
                                System.out.println(" Nombre actual");
                                System.out.println(cliente1.getNombre());//se muestra el nombre actual que se va a editar
                                System.out.println(" Digite el nuevo nombre");
                                String name=in.next();//se pide el nuevo nombre
                                cliente1.setNombre(name);//aca se edita el nombre
                                System.out.println(" �Nombre editado con exito!");
                            }else if (option.equals("3")) {//opcion para editar el telefono
                                System.out.println(" Telefono actual");
                                System.out.println(cliente1.getTelefono());//se muestra el telefono actual que se va a editar
                                System.out.println(" Digite el nuevo telefono");
                                int tel=in.nextInt();//se pide el nuevo telefono
                                cliente1.setTelefono(tel);//aca se edita el telefono
                                System.out.println(" �Telefono editado con exito!");
                            }else if (option.equals("4")) {//opcion para editar la direccion
                                System.out.println(" Direccion actual");
                                System.out.println(cliente1.getDireccion());//se muestra la direccion actual que se va a editar
                                System.out.println(" Digite la nueva direccion");
                                String dir=in.next();//se pide la nueva direccion
                                cliente1.setDireccion(dir);//aca se edita la direccion
                                System.out.println(" �Direccion editada con exito!");
                            }else if(option.equals("0")){
                                return;
                            }
                        }
                    }
                    break;
                case "3"://opcion para eliminar un cliente
                    //condicional para comprobar que si hayan clientes registrados
                    if(clientes.isEmpty()){
                        //si no hay muestra una advertencia
                        System.out.println("no hay clientes registrados");
                    }else{
                        //de lo contrario muestra todos los clientes registrados
                        //para que el usuario identifique la cedula del cliente a eliminar
                        System.out.println("-----------------------------");
                        System.out.println(" Lista de clientes");
                        for (Cliente cliente: clientes ){
                            System.out.println(cliente);
                        }
                        System.out.println("-----------------------------");
                        System.out.println();
                        System.out.println(" Digite la cedula del cliente que desea eliminar");
                        int ced=in.nextInt();//se pide la cedula del cliente a eliminar
                        for (Cliente cliente1: clientes ){
                            if (cliente1.getCedula()==ced){//encuentra el cliente
                                clientes.remove(cliente1);//elimina el cliente
                                System.out.println(" �Cliente eliminado con exito! ");
                            }
                        }
                    }
                    break;
                case "4"://opcion para ver todos los clientes registrados
                    //condicional para comprobar que si hayan clientes
                    if(clientes.isEmpty()){
                        //si no hay muestra una advertencia
                        System.out.println("no hay clientes para ver");
                    }else{
                        //de lo contrario
                        //recorre el arreglo mostrando todos los clientes registrados hasta el momento
                        System.out.println("-----------------------------");
                        for (Cliente cliente: clientes ){
                            System.out.println(cliente);
                            System.out.println();
                        }
                        System.out.println("-----------------------------");
                    }
                    break;
                case "0":
                    return;
            }
        }
    }

    private static void menuEmpleado() {
        //Menu con todo lo relacionado al empleado
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println(" Menu Empleado. ");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Crear empleado.");
            System.out.println("2. Editar empleado.");
            System.out.println("3. Eliminar empleado.");
            System.out.println("4. Ver empleados.");
            System.out.println("5. .");
            System.out.println("6. .");
            System.out.println("7. .");
            System.out.println("0. Volver.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            switch (option) {
                case "1"://en esta opcion se podra crear un empleado
                    System.out.println(" Por favor ingrese la cedula del empleado");
                    int cedula=in.nextInt();//primero se pide la cedula
                    //despues se comprueba de que no exista ningun empleado con esta cedula
                    //ya que la cedula es unica y no deben haber dos con la misma
                    for (Empleado empleado: empleados ){ //recorre la lista de empleados
                        if (empleado.getCedula()==cedula){ //encuentra un empleado que ya tiene esta cedula
                            System.out.println(" Esta cedula ya existe ");
                            return;
                            //luego imprime una advertencia y se sale
                        }
                    }
                    //llegado a este punto se comprobo que la cedula es valida
                    //por ende se terminan de pedir la informacion restante para crear el empleado
                    System.out.println(" Por favor ingrese el nombre");
                    String nombre=in.next();
                    System.out.println(" Por favor ingrese el telefono");
                    int telefono= in.nextInt();
                    System.out.println(" Por favor ingrese la direccion");
                    String direccion= in.next();
                    System.out.println(" Por favor ingrese el id");
                    int id=in.nextInt();
                    System.out.println(" Por favor ingrese el cargo");
                    String cargo= in.next();
                    System.out.println(" Por favor ingrese el sueldo");
                    int sueldo=in.nextInt();
                    Empleado.crearEmpleado(cedula,nombre,telefono,direccion,id,cargo,sueldo);//aca se crea el empleado
                    System.out.println(" �Empleado creado con exito!");
                    break;
                case "2"://opcion para editar un empleado
                    System.out.println("-----------------------------");
                    System.out.println(" Lista de Empleados");//Primero se muestran los empleados para que el usuario escoja el que quiere editar
                    Empleado.verEmpleados();
                    System.out.println("-----------------------------");
                    System.out.println();
                    System.out.println(" Digite la cedula del empleado que desea editar");
                    int cedu=in.nextInt();//se pide la cedula del empleado que se escogio para editar
                    for (Empleado empleado1: empleados ){
                        if (empleado1.getCedula()==cedu){//se encuentra el empleado
                            System.out.println("-----------------------------");
                            System.out.println(" Empleado a editar");
                            System.out.println(empleado1);//se muestra el empleado que se va a editar solo para comprobar
                            System.out.println("Escoja una opcion:");//menu para escoger la informacion especifica del empleado a editar
                            System.out.println("1. Editar cedula.");
                            System.out.println("2. Editar nombre.");
                            System.out.println("3. Editar telefono.");
                            System.out.println("4. Editar direccion.");
                            System.out.println("5. Editar id.");
                            System.out.println("6. Editar cargo.");
                            System.out.println("7. Editar sueldo.");
                            System.out.println("0. Salir.");
                            System.out.println("-----------------------------");
                            option = in.next();
                            if (option.equals("1")) {//opcion para editar la cedula
                                System.out.println(" Cedula actual");
                                System.out.println(empleado1.getCedula());//se muestra la cedula actual,antes de ser editada
                                System.out.println(" Digite la nueva cedula");
                                int cedul=in.nextInt();//se pide la nueva cedula
                                //y se comprueba de que no exista ningun empleado registrado con esta cedula
                                for (Empleado empleado2: empleados ){
                                    if (empleado2.getCedula()==cedul){
                                        System.out.println(" Esta cedula ya existe ");
                                        return;
                                    }
                                }
                                //como la cedula es valida se procede a editar
                                empleado1.setCedula(cedul);//aca se edita la cedula
                                System.out.println(" �Cedula editada con exito!");
                            }else if (option.equals("2")) {//opcion para editar el nombre
                                System.out.println(" Nombre actual");
                                System.out.println(empleado1.getNombre());//se muestra el nombre actual que se va a editar
                                System.out.println(" Digite el nuevo nombre");
                                String name=in.next();//se pide el nuevo nombre
                                empleado1.setNombre(name);//aca se edita el nombre
                                System.out.println(" �Nombre editado con exito!");
                            }else if (option.equals("3")) {//opcion para editar el telefono
                                System.out.println(" Telefono actual");
                                System.out.println(empleado1.getTelefono());//se muestra el telefono actual que se va a editar
                                System.out.println(" Digite el nuevo telefono");
                                int tel=in.nextInt();//se pide el nuevo telefono
                                empleado1.setTelefono(tel);//aca se edita el telefono
                                System.out.println(" �Telefono editado con exito!");
                            }else if (option.equals("4")) {//opcion para editar la direccion
                                System.out.println(" Direccion actual");
                                System.out.println(empleado1.getDireccion());//se muestra la direccion actual que se va a editar
                                System.out.println(" Digite la nueva direccion");
                                String dir=in.next();//se pide la nueva direccion
                                empleado1.setDireccion(dir);//aca se edita la direccion
                                System.out.println(" �Direccion editada con exito!");
                            }else if (option.equals("5")) {//opcion para editar el id
                                System.out.println(" ID actual");
                                System.out.println(empleado1.getId());//se muestra el id actual que se va a editar
                                System.out.println(" Digite el nuevo ID");
                                int ID=in.nextInt();//se pide el nuevo id
                                empleado1.setId(ID);//aca se edita el id
                                System.out.println(" �ID editado con exito!");
                            }else if (option.equals("6")) {//opcion para editar el cargo
                                System.out.println(" Cargo actual");
                                System.out.println(empleado1.getCargo());//se muestra el cargo actual que se va a editar
                                System.out.println(" Digite el nuevo cargo");
                                String Cargo=in.next();//se pide el nuevo cargo
                                empleado1.setCargo(Cargo);//aca se edita el cargo
                                System.out.println(" �Cargo editado con exito!");
                            }else if (option.equals("7")) {//opcion para editar el sueldo
                                System.out.println(" Sueldo actual");
                                System.out.println(empleado1.getDireccion());//se muestra el sueldo actual que se va a editar
                                System.out.println(" Digite el nuevo sueldo");
                                int Sueldo=in.nextInt();//se pide el nuevo sueldo
                                empleado1.setSueldo(Sueldo);//aca se edita el sueldo
                                System.out.println(" �Direccion editada con exito!");
                            }else if(option.equals("0")){
                                return;
                            }
                        }
                    }
                    break;
                case "3"://opcion para eliminar un empleado
                    //condicional para comprobar que si hayan empleados registrados
                    if(empleados.isEmpty()){
                        //si no hay muestra una advertencia
                        System.out.println("no hay empleados registrados");
                        return;
                    }else{
                        //de lo contrario muestra todos los empleados registrados
                        //para que el usuario identifique la cedula del empleado a eliminar
                        System.out.println("-----------------------------");
                        System.out.println(" Lista de Empleado");
                        Empleado.verEmpleados();
                        System.out.println("-----------------------------");
                        System.out.println();
                        System.out.println(" Digite la cedula del empleado que desea eliminar");
                        int ced=in.nextInt();//se pide la cedula del empleado a eliminar
                        for (Empleado empleado1: empleados ){
                            if (empleado1.getCedula()==ced){//encuentra el empleado
                                empleados.remove(empleado1);//elimina el empleado
                                System.out.println(" �Empleado eliminado con exito! ");
                            }
                        }
                    }
                    break;
                case "4"://opcion para ver los empleados registrados hasta el momento
                    //condicional para comprobar que si hayan empleados
                    if(empleados.isEmpty()){
                        //si no hay muestra una advertencia
                        System.out.println("no hay empleados para ver");
                    }else{
                        //de lo contrario
                        //recorre el arreglo mostrando todos los empleados registrados hasta el momento
                        System.out.println("-----------------------------");
                        Empleado.verEmpleados();
                        System.out.println("-----------------------------");
                    }
                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":

                    break;
                case "0":
                    return;
            }
        }
    }

    private static void menuReserva() {
        //Menu con todo lo relacionado con las reservas
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println(" Menu Reservas. ");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Crear reserva.");
            System.out.println("2. Editar reserva.");
            System.out.println("3. Eliminar reserva.");
            System.out.println("4. Ver reservas.");
            System.out.println("5. .");
            System.out.println("6. .");
            System.out.println("7. .");
            System.out.println("0. Volver.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            switch (option) {
                case "1"://en esta opcion se podra crear una reserva
                    System.out.println(" Por favor ingrese el numero de la reserva");
                    int num=in.nextInt();//primero se pide el numero de la reserva
                    //despues se comprueba de que no exista ninguna reserva con este numero
                    //ya que es unico y no deben haber dos reservas con el mismo numero
                    for (Reserva reserva: reservas ){ //recorre la lista de empleados
                        if (reserva.getNumreserva()==num){ //encuentra una reserva con este numero
                            System.out.println(" Este numero de reserva ya existe ");
                            return;
                            //luego imprime una advertencia y se sale
                        }
                    }
                    //llegado a este punto se comprobo que el numero de reserva es valido
                    //por ende se terminan de pedir la informacion restante para crear la reserva
                    System.out.println(" Por favor ingrese la fecha de reserva");
                    String fecha=in.next();
                    System.out.println(" Por favor ingrese el cliente");
                    //se agrega un cliente
                    System.out.println("-----------------------------");
                    System.out.println(" Lista de Clientes");//se muestran los clientes para que el usuario escoja el cliente due�o de la reserva
                    Cliente.verCliente();
                    System.out.println("-----------------------------");
                    System.out.println();
                    System.out.println(" Digite la cedula del cliente que desea agregar");
                    int cedul=in.nextInt();//se pide la cedula del cliente que se escogio
                    Cliente cliente=new Cliente();
                    for (Cliente cliente1: clientes ) {
                        if (cliente1.getCedula()==cedul) {//aca encuentra al cliente que sera el due�o de la reserva
                            cliente=cliente1;
                        }
                    }
                    System.out.println(" �Es aplicable?");//se pregunta si la reserva es aplicable o no
                    System.out.println("1. Si.");
                    System.out.println("2. No.");
                    System.out.println();
                    option = in.next();
                    boolean aplicable;
                    if (option.equals("1")){
                        aplicable=true;
                    }else if (option.equals("2")){
                        aplicable=false;
                    }else {
                        System.out.println(" Ingrese una opcion valida");
                        return;
                    }
                    Reserva.crearReserva(num,fecha,cliente,aplicable);//aca se crea la reserva
                    System.out.println(" �Reserva creada con exito!");
                    break;
                case "2"://opcion para editar una reserva
                    System.out.println("-----------------------------");
                    System.out.println(" Lista de Reserva");//Primero se muestran las reserva para que el usuario escoja la que quiere editar
                    Reserva.verReserva();
                    System.out.println("-----------------------------");
                    System.out.println();
                    System.out.println(" Digite el numero de la reserva que desea editar");
                    int numero=in.nextInt();//se pide el numero de la reserva que se escogio para editar
                    for (Reserva reserva1: reservas ){
                        if (reserva1.getNumreserva()==numero){//se encuentra la reserva
                            System.out.println("-----------------------------");
                            System.out.println(" Reserva a editar");
                            System.out.println(reserva1);//se muestra la reserva que se va a editar solo para comprobar
                            System.out.println("Escoja una opcion:");//menu para escoger la informacion especifica de la reserva a editar
                            System.out.println("1. Editar cliente.");
                            System.out.println("2. Editar numero de reserva.");
                            System.out.println("3. Editar fecha.");
                            System.out.println("4. Editar aplicable.");
                            System.out.println("0. Salir.");
                            System.out.println("-----------------------------");
                            option = in.next();
                            if (option.equals("1")) {//opcion para editar el cliente due�o de la reserva
                                System.out.println("-----------------------------");
                                System.out.println(" Lista de Clientes");//se muestran los clientes para que el usuario escoja el que quiere editar
                                Cliente.verCliente();
                                System.out.println("-----------------------------");
                                System.out.println();
                                System.out.println(" Digite la cedula del nuevo due�o de la reserva");
                                int cedu=in.nextInt();//se pide la cedula del cliente que se escogio
                                for (Cliente cliente1:clientes){
                                    if (cliente1.getCedula()==cedu){
                                        reserva1.setCliente(cliente1);//aca se edita el due�o de la reserva
                                        System.out.println(" �Cliente editado con exito!");
                                    }
                                }
                            }else if (option.equals("2")) {//opcion para editar el numero de la reserva
                                System.out.println(" Numero de reserva actual");
                                System.out.println(reserva1.getNumreserva());//se muestra el numero de la reserva actual que se va a editar
                                System.out.println(" Digite el nuevo numero de reserva");
                                int nume=in.nextInt();//se pide el nuevo numero
                                reserva1.setNumreserva(nume);//aca se edita el numero de reserva
                                System.out.println(" �Numero de reserva editado con exito!");
                            }else if (option.equals("3")) {//opcion para la editar la fecha de reserva
                                System.out.println(" Fecha actual");
                                System.out.println(reserva1.getFechareserva());//se muestra la fecha actual de la reserva que se va a editar
                                System.out.println(" Digite la nueva fecha");
                                String Fecha=in.next();//se pide la nueva fecha
                                reserva1.setFechareserva(Fecha);//aca se edita la fecha de la reserva
                                System.out.println(" �Fecha de reserva editada con exito!");
                            }else if (option.equals("4")) {//opcion para editar el aplicable
                                System.out.println(" Estado del aplicable actual");
                                System.out.println(reserva1.isAplicable());//se muestra el estado actual del aplicable
                                System.out.println(" �Es aplicable?");//se pregunta si la reserva es aplicable o no
                                System.out.println("1. Si.");
                                System.out.println("2. No.");
                                System.out.println();
                                option = in.next();
                                if (option.equals("1")){
                                    reserva1.setAplicable(true);//aca se edita el aplicable
                                    System.out.println(" �Aplicable editado con exito!");
                                }else if (option.equals("2")){
                                    reserva1.setAplicable(false);//aca se edita el aplicable
                                    System.out.println(" �Aplicable editado con exito!");
                                }else {
                                    System.out.println(" Ingrese una opcion valida");
                                    return;
                                }
                            }else if(option.equals("0")){
                                return;
                            }
                        }
                    }
                    break;
                case "3"://opcion para eliminar una reserva
                    //condicional para comprobar que si hayan reservas registradas
                    if(reservas.isEmpty()){
                        //si no hay muestra una advertencia
                        System.out.println("no hay reservas registrados");
                        return;
                    }else{
                        //de lo contrario muestra todos los reservas registradas
                        //para que el usuario identifique el numero de la reserva a eliminar
                        System.out.println("-----------------------------");
                        System.out.println(" Lista de Reservas");
                        Reserva.verReserva();
                        System.out.println("-----------------------------");
                        System.out.println();
                        System.out.println(" Digite el numero de la reserva que desea eliminar");
                        int nume=in.nextInt();//se pide el numero de la reserva a eliminar
                        for (Reserva reserva1: reservas ){
                            if (reserva1.getNumreserva()==nume){//encuentra la reserva
                                reservas.remove(reserva1);//elimina la reserva
                                System.out.println(" �Reserva eliminada con exito! ");
                            }
                        }
                    }
                    break;
                case "4"://opcion para ver las reservas registradas hasta el momento
                    //condicional para comprobar que si hayan reservas
                    if(reservas.isEmpty()){
                        //si no hay,muestra una advertencia
                        System.out.println("no hay reservas para ver");
                    }else{
                        //de lo contrario
                        //recorre el arreglo mostrando todas las reserva registradas hasta el momento
                        System.out.println("-----------------------------");
                        Reserva.verReserva();
                        System.out.println("-----------------------------");
                    }
                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":

                    break;
                case "0":
                    return;
            }
        }
    }
//=====================================================================================================================
    private static void menuPedido() {
        //Menu con todo lo relacionado con los pedidos
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println(" Menu Pedidos. ");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Crear pedidos.");
            System.out.println("2. Editar pedidos.");
            System.out.println("3. Eliminar pedidos.");
            System.out.println("4. Ver pedidos.");
            System.out.println("5. .");
            System.out.println("6. .");
            System.out.println("7. .");
            System.out.println("0. Volver.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            switch (option) {
                case "1"://en esta opcion se podra crear un pedido
                    System.out.println(" Digite el id del pedido ");
                    int id=in.nextInt();//se pide el id del pedido
                    System.out.println(" Por favor escoga el cliente due�o del pedido");//el pedido debe tener un cliente due�o
                    System.out.println("-----------------------------");
                    System.out.println(" Lista de Clientes");//se muestran los clientes para que el usuario escoja el due�o
                    Cliente.verCliente();
                    System.out.println("-----------------------------");
                    System.out.println();
                    System.out.println(" Digite la cedula del cliente que desea agregar");
                    int cedul=in.nextInt();//se pide la cedula del cliente que se escogio
                    Cliente cliente=new Cliente();
                    for (Cliente cliente1: clientes ) {
                        if (cliente1.getCedula()==cedul) {//aca encuentra al cliente que sera el due�o del pedido
                            cliente=cliente1;
                        }
                    }
                    //se muestran las mesas registradas para que el usuario escoga la que quiera agregar
                    System.out.println("-----------------------------");
                    System.out.println(" Lista de Mesas");
                    Mesa.verMesas();
                    System.out.println("-----------------------------");
                    System.out.println();
                    System.out.println(" Digite el id de la mesa que desea escoger");
                    int ID=in.nextInt();//se pide el id de la mesa que se escogio
                    Mesa mesa=new Mesa();
                    for (Mesa mesa1:mesas.values()) {
                        if (mesa1.getIdunico() == ID) {//encuentra la mesa
                            mesa=mesa1;
                        }
                    }
                    //se muestra el catalogo de platos disponibles para que se pueda tomar el pedido
                    System.out.println("-----------------------------");
                    Catalogo.verCatalogo();//Muestra el catalogo
                    System.out.println("-----------------------------");
                    System.out.println();
                    System.out.println(" �Cuantos platos desea comprar el cliente?");//se pregunta cuantos platos comprara el cliente
                    //ya que el cliente puede comprar mas de un plato en cada pedido,por ende se le pedira un plato la cantidad de veces que va a comprar
                    int cantidad= in.nextInt();
                    ArrayList<Catalogo> pedidosPlato = new ArrayList<>();
                    for (int i=1; i<=cantidad; i++) {
                        //se muestra el catalogo de platos disponibles para que se pueda tomar el pedido
                        System.out.println();
                        System.out.println(" Pedido plato "+i);
                        System.out.println("-----------------------------");
                        Catalogo.verCatalogo();//Muestra el catalogo
                        System.out.println("-----------------------------");
                        System.out.println();
                        System.out.println(" Digite el numero de plato que desee");
                        Integer num = in.nextInt();
                        //despues de que haya escogido le pide al cajero que digite el numero del plato escogido
                        //si el cajero digita un numero erroneo lo vuelve a pedir
                        if (platos.containsKey(num)) {
                            //como el plato existe con esa llave numerica
                            //procede a crear un plato que sera el pedido por el user
                            //este plato contiene los valores(values) de la llave que se pidio anteriormente
                            Catalogo plato = platos.get(num);
                            System.out.println(" Nombre= " + plato.getNombrePlato());//aca se muestra el plato que se agrego al pedido
                            System.out.println(" precio= " + plato.getPrecio());//con su respectivo precio
                            pedidosPlato.add(plato);//aca se agrega el pedido
                            System.out.println(" Agregado al pedido");
                        } else {
                            System.out.println(" Digite un numero valido");
                        }
                    }
                    Pedido.crearPedido(cliente,mesa,id,pedidosPlato);//aca se crea el pedido
                    System.out.println(" �Pedido creado con exito!");
                    break;
                case "2"://opcion para editar un pedido
                    System.out.println("-----------------------------");
                    System.out.println(" Lista de Pedidos");//Primero se muestran los pedidos para que el usuario escoja el que quiere editar
                    Pedido.verPedidos();
                    System.out.println("-----------------------------");
                    System.out.println();
                    System.out.println(" Digite el id del pedido que desea editar");
                    int numero=in.nextInt();//se pide el numero de la reserva que se escogio para editar
                    for (Pedido pedido1: pedidos ){
                        if (pedido1.getIdpedido()==numero){//encuentra el pedido
                            System.out.println("-----------------------------");
                            System.out.println(" Pedido a editar");
                            System.out.println(pedido1);//se muestra el pedido que se va a editar solo para comprobar
                            System.out.println("Escoja una opcion:");//menu para escoger la informacion especifica del pedido a editar
                            System.out.println("1. Editar cliente.");
                            System.out.println("2. Editar mesa.");
                            System.out.println("3. Editar id del pedido.");
                            System.out.println("0. Salir.");
                            System.out.println("-----------------------------");
                            option = in.next();
                            if (option.equals("1")) {//opcion para editar el cliente due�o del pedido
                                System.out.println("-----------------------------");
                                System.out.println(" Lista de Clientes");//se muestran los clientes para que el usuario escoja el que quiere editar
                                Cliente.verCliente();
                                System.out.println("-----------------------------");
                                System.out.println();
                                System.out.println(" Digite la cedula del nuevo due�o del pedido");
                                int cedu=in.nextInt();//se pide la cedula del cliente que se escogio
                                for (Cliente cliente1:clientes){
                                    if (cliente1.getCedula()==cedu){
                                        pedido1.setCliente(cliente1);//aca se edita el due�o del pedido
                                        System.out.println(" �Cliente editado con exito!");
                                    }
                                }
                            }else if (option.equals("2")) {//opcion para editar la mesa del pedido
                                System.out.println(" Mesa actual");
                                System.out.println(pedido1.getMesa());//muestra la mesa actual
                                //Luego se muestran la lista de mesas para que el usuario escoja alguna
                                System.out.println("-----------------------------");
                                System.out.println(" Lista de Mesas");
                                Mesa.verMesas();
                                System.out.println("-----------------------------");
                                System.out.println();
                                System.out.println(" Digite el id de la nueva mesa");
                                int idMesa=in.nextInt();//se pide el id de la mesa que se escogio
                                for (Mesa mesa1:mesas.values()){
                                    if (mesa1.getIdunico()==idMesa){//encuentra la mesa
                                        pedido1.setMesa(mesa1);
                                        System.out.println(" �Mesa editada con exito!");
                                    }
                                }
                            }else if (option.equals("3")) {//opcion para la editar el id del pedido
                                System.out.println(" ID actual");
                                System.out.println(pedido1.getIdpedido());//se muestra el id actual
                                System.out.println(" Digite el nuevo ID");
                                int newID=in.nextInt();//se pide el nuevo id
                                pedido1.setIdpedido(newID);//aca se edita el id del pedido
                                System.out.println(" �ID editado con exito!");
                            }else if(option.equals("0")){
                                return;
                            }
                        }
                    }
                    break;
                case "3"://opcion para eliminar un pedido
                    //condicional para comprobar que si hayan pedidos registradss
                    if(pedidos.isEmpty()){
                        //si no hay muestra una advertencia
                        System.out.println("no hay pedidos registrados");
                        return;
                    }else{
                        //de lo contrario muestra todos los pedidos registrados
                        //para que el usuario identifique el numero de pedido a eliminar
                        System.out.println("-----------------------------");
                        System.out.println(" Lista de Pedidos");
                        Pedido.verPedidos();
                        System.out.println("-----------------------------");
                        System.out.println();
                        System.out.println(" Digite el numero del pedido que desea eliminar");
                        int nume=in.nextInt();//se pide el numero del pedido a eliminar
                        for (Pedido pedido: pedidos ){
                            if (pedido.getIdpedido()==nume){//encuentra el pedido
                                pedidos.remove(pedido);//elimina el pedido
                                System.out.println(" �Pedido eliminado con exito! ");
                            }
                        }
                    }
                    break;
                case "4"://opcion para ver los pedidos registrados hasta el momento
                    //condicional para comprobar que si hayan pedidos
                    if(pedidos.isEmpty()){
                        //si no hay,muestra una advertencia
                        System.out.println("no hay pedidos para ver");
                    }else{
                        //de lo contrario
                        //recorre el arreglo mostrando todos los pedidos registradas hasta el momento
                        System.out.println("-----------------------------");
                        Pedido.verPedidos();
                        System.out.println("-----------------------------");
                    }
                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":

                    break;
                case "0":
                    return;
            }
        }
    }
    //====================================================================================================================

    private static void menuMesa() {
        //Menu con todo lo relacionado con las mesas
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println(" Menu Mesas. ");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Crear mesa.");
            System.out.println("2. Editar mesa.");
            System.out.println("3. Eliminar mesas.");
            System.out.println("4. Ver mesas.");
            System.out.println("5. .");
            System.out.println("6. .");
            System.out.println("7. .");
            System.out.println("0. Volver.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            switch (option) {
                case "1"://en esta opcion se podra crear una mesa
                    System.out.println(" Digite el id de la mesa ");
                    int id=in.nextInt();//se pide el id de la nueva mesa
                    for (Mesa mesa:mesas.values()){
                        if (mesa.getIdunico()==id){//encuentra una mesa ya registrada con dicho id
                            System.out.println(" Ya existe una mesa con dicho ID");//advierte que no pueden haber dos mesas con el mismo id y se sale
                            return;
                        }
                    }
                    //se pide la informacion restante para crear la mesa
                    System.out.println(" Digite la zona");
                    short zona=in.nextShort();
                    System.out.println(" Digite el numero de la mesa");
                    int numMesa= in.nextInt();
                    new Mesa(id,zona,numMesa);//aca se crea la mesa
                    System.out.println(" �Mesa creada con exito!");
                    break;
                case "2"://opcion para editar una mesa
                    System.out.println("-----------------------------");
                    System.out.println(" Lista de Mesas");//Primero se muestran las mesas para que el usuario escoja la que quiera editar
                    Mesa.verMesas();
                    System.out.println("-----------------------------");
                    System.out.println();
                    System.out.println(" Digite el id de la mesa que desea editar");
                    int ID=in.nextInt();//se pide el id de la mesa que se escogio para editar
                    for (Mesa mesa1:mesas.values()) {
                        if (mesa1.getIdunico()==ID) {//encuentra la mesa
                            System.out.println("-----------------------------");
                            System.out.println(" Mesa a editar");
                            System.out.println(mesa1);//se muestra la mesa que se va a editar solo para comprobar
                            System.out.println("Escoja una opcion:");//menu para escoger la informacion especifica a editar de la mesa
                            System.out.println("1. Editar id.");
                            System.out.println("2. Editar zona.");
                            System.out.println("3. Editar numero de mesa.");
                            System.out.println("0. Salir.");
                            System.out.println("-----------------------------");
                            option = in.next();
                            if (option.equals("1")) {//opcion para editar el id de la mesa
                                System.out.println( "Digite el nuevo ID");
                                int newID= in.nextInt();
                                for (Mesa mesa:mesas.values()){
                                    if (mesa.getIdunico()==newID){//encuentra una mesa ya registrada con dicho id
                                        System.out.println(" Ya existe una mesa con dicho ID");//advierte que no pueden haber dos mesas con el mismo id y se sale
                                        return;
                                    }
                                }
                                mesa1.setIdunico(newID);
                                System.out.println(" �ID editado con exito!");
                            }else if (option.equals("2")) {//opcion para editar la zona
                                System.out.println(" Zona de la mesa actual");
                                System.out.println(mesa1.getZona());//se muestra la zona actual
                                System.out.println(" Digite la nueva zona");
                                System.out.println("1. VIP." +
                                        "2. SALON PRINCIPAL." +
                                        "3. TERRAZA.");
                                short zone= in.nextShort();
                                if(zone > 0 && zone <4)
                                mesa1.setZona(zone);//aca se edita la zona
                                System.out.println(" �Zona editada con exito!");
                            }else if (option.equals("3")) {//opcion para la editar el numero de la mesa
                                System.out.println(" Numero de la mesa actual");
                                System.out.println(mesa1.getNumero());//muestra el numero actual de la mesa
                                System.out.println(" Digite el nuevo numero");
                                int newNum= in.nextInt();
                                mesa1.setNumero(newNum);//aca se edita el numero de la mesa
                                System.out.println(" �Numero de mesa editado con exito!");
                            }else if(option.equals("0")){
                                return;
                            }
                        }
                    }
                    break;
                case "3"://opcion para eliminar una mesa
                    //condicional para comprobar que si hayan mesas registradas
                    if(mesas.isEmpty()){
                        //si no hay,muestra una advertencia
                        System.out.println("no hay mesas registradas");
                        return;
                    }else{
                        //de lo contrario muestra todas las mesas registradas
                        //para que el usuario identifique el id de la mesa a eliminar
                        System.out.println("-----------------------------");
                        System.out.println(" Lista de Mesas");
                        Mesa.verMesas();
                        System.out.println("-----------------------------");
                        System.out.println();
                        System.out.println(" Digite el id de la mesa que desea eliminar");
                        int nume=in.nextInt();//se pide el id de la mesa a eliminar
                        for (Mesa mesa: mesas.values()){
                            if (mesa.getIdunico()==nume){//encuentra la mesa
                                mesas.remove(mesa);//elimina la mesa
                                System.out.println(" �Mesa eliminada con exito! ");
                            }
                        }
                    }
                    break;
                case "4"://opcion para ver las mesas registradas
                    //condicional para comprobar que si hayan mesas registradas
                    if(mesas.isEmpty()){
                        //si no hay,muestra una advertencia
                        System.out.println("no hay mesas registradas");
                        return;
                    }else{
                        //de lo contrario muestra todas las mesas registradas
                        System.out.println("-----------------------------");
                        Mesa.verMesas();
                        System.out.println("-----------------------------");
                    }
                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":

                    break;
                case "0":
                    return;
            }
        }
    }

    private static void menuProveedor() {
        //Menu con todo lo relacionado con los proveedores
        Scanner in=new Scanner(System.in);
        String option;
        while(true) {
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println(" Menu Proveedores. ");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Crear proveedor.");
            System.out.println("2. Editar proveedor.");
            System.out.println("3. Eliminar proveedor.");
            System.out.println("4. Ver proveedores.");
            System.out.println("5. .");
            System.out.println("6. .");
            System.out.println("7. .");
            System.out.println("0. Volver.");
            System.out.println("-----------------------------");
            System.out.println();
            option = in.next();
            switch (option) {
                case "1"://en esta opcion se podra crear un proveedor
                    System.out.println(" Digite el NIT del proveedor ");
                    int nit=in.nextInt();//se pide el nit del nuevo proveedor
                    for (Proveedor proveedor:proveedores){
                        if (proveedor.getNit()==nit){
                            System.out.println(" Ya existe un proveedor registrado con ese NIT");
                            return;
                        }
                    }
                    //como el NIT es valido,se digita la informacion restante para crear al proveedor
                    System.out.println(" Digite el nombre del proveedor ");
                    String nombre=in.next();
                    System.out.println(" Digite el telefono del proveedor ");
                    String telefono=in.next();
                    Proveedor.crearProveedor(nit,nombre,telefono);//aqui se crea al proveedor
                    break;
                case "2"://opcion para editar a un proveedor
                    System.out.println("-----------------------------");
                    System.out.println(" Lista de Proveedores");//Primero se muestran los proveedores para que el usuario escoja el que quiera editar
                    Proveedor.verProveedores();
                    System.out.println("-----------------------------");
                    System.out.println();
                    System.out.println(" Digite el NIT del proveedor que desea editar");
                    int ID=in.nextInt();//se pide el nit del proveedor que se escogio para editar
                    for (Proveedor proveedor1:proveedores) {
                        if (proveedor1.getNit()==ID) {//encuentra al proveedor
                            System.out.println("-----------------------------");
                            System.out.println(" Proveedor a editar");
                            System.out.println(proveedor1);//se muestra el proveedor que se va a editar solo para comprobar
                            System.out.println("Escoja una opcion:");//menu para escoger la informacion especifica a editar de la mesa
                            System.out.println("1. Editar NIT.");
                            System.out.println("2. Editar nombre.");
                            System.out.println("3. Editar telefono.");
                            System.out.println("0. Salir.");
                            System.out.println("-----------------------------");
                            option = in.next();
                            if (option.equals("1")) {//opcion para editar el nit de un proveedor
                                System.out.println( "Digite el nuevo NIT");
                                int newNIT= in.nextInt();
                                for (Proveedor proveedor:proveedores){
                                    if (proveedor.getNit()==newNIT){//encuentra un proveedor ya registrado con dicho nit
                                        System.out.println(" Ya existe un proveedor con dicho NIT");//advierte que no pueden haber dos proveedores con el mismo nit y se sale
                                        return;
                                    }
                                }
                                proveedor1.setNit(newNIT);
                                System.out.println(" �NIT editado con exito!");
                            }else if (option.equals("2")) {//opcion para editar el nombre
                                System.out.println(" Nombre del proveedor actual");
                                System.out.println(proveedor1.getNombre());//se muestra el nombre actual
                                System.out.println(" Digite el nuevo nombre");
                                String name= in.next();
                                proveedor1.setNombre(name);//aca se edita el nombre
                                System.out.println(" �Nombre editado con exito!");
                            }else if (option.equals("3")) {//opcion para la editar el telefono del proveedor
                                System.out.println(" Numero de telefono actual");
                                System.out.println(proveedor1.getTelefono());//muestra el telefono actual del proveedor
                                System.out.println(" Digite el nuevo telefono");
                                String newTel= in.next();
                                proveedor1.setTelefono(newTel);//aca se edita el telefono del proveedor
                                System.out.println(" �Telefono editado con exito!");
                            }else if(option.equals("0")){
                                return;
                            }
                        }
                    }
                    break;

                case "3"://opcion para eliminar un proveedor
                    //condicional para comprobar que si hayan proveedores registrados
                    if(proveedores.isEmpty()){
                        //si no hay,muestra una advertencia
                        System.out.println("no hay proveedores registrados");
                    }else{
                        //de lo contrario muestra todas los proveedores registrados
                        //para que el usuario identifique el nit del proveedor a eliminar
                        System.out.println("-----------------------------");
                        System.out.println(" Lista de Proveedores");
                        Proveedor.verProveedores();
                        System.out.println("-----------------------------");
                        System.out.println();
                        System.out.println(" Digite el NIT del proveedor que desea eliminar");
                        int NIT=in.nextInt();//se pide el nit del proveedor a eliminar
                        for (Proveedor proveedor: proveedores ){
                            if (proveedor.getNit()==NIT){//encuentra el proveedor
                                proveedores.remove(proveedor);//elimina el proveedores
                                System.out.println(" �Proveedor eliminado con exito! ");
                            }
                        }
                    }
                    break;
                case "4"://opcion para ver los proveedores
                    //condicional para comprobar que si hayan proveedores registrados
                    if(proveedores.isEmpty()){
                        //si no hay,muestra una advertencia
                        System.out.println("no hay proveedores registrados");
                    }else{
                        //de lo contrario muestra todas los proveedores registrados
                        System.out.println("-----------------------------");
                        Proveedor.verProveedores();
                        System.out.println("-----------------------------");
                    }
                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":

                    break;
                case "0":
                    return;
            }
        }
    }

    private static void menuSede() {
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
                    System.out.println("none a�n");
                    break;
                case "0":
                    return;
            }
        }
    }

    public static void pedido_facturacion(){
        int option;
        Scanner in=new Scanner(System.in);
        System.out.println();
        System.out.println("-----------------------------");
        Mesa.verMesas();
        System.out.println("-----------------------------");
        option = in.nextInt();
        while(true){
            if(mesas.get(option).equals(true)){
                if (mesas.get(option).isDisponibilidad()){
                    if(mesas.get(option).entornoMesa() == null){
                        System.out.println("A�n no tiene pedido para �sta mesa.");
                    }else{
                    mesas.get(option).entornoMesa();}
                }
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


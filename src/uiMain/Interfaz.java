package uiMain;

import baseDatos.BaseDeDatos;
import gestorAplicacion.*;

import java.util.Map;
import java.util.Scanner;

import static gestorAplicacion.Catalogo.platos;
import static gestorAplicacion.Cliente.clientes;
import static gestorAplicacion.Empleado.empleados;

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
            System.out.println("4. Catalogo");
            System.out.println("5. Gestion del restaurante");
            System.out.println("6. Insumos");
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
                case "clientes frecuentes":
                    System.out.println("en esta base de datos se almacena la información de todos nuestros clientes frecuentes");

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
                    System.out.println(" ¡Cliente creado con exito!");
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
                                System.out.println(" ¡Cedula editada con exito!");
                            }else if (option.equals("2")) {//opcion para editar el nombre
                                System.out.println(" Nombre actual");
                                System.out.println(cliente1.getNombre());//se muestra el nombre actual que se va a editar
                                System.out.println(" Digite el nuevo nombre");
                                String name=in.next();//se pide el nuevo nombre
                                cliente1.setNombre(name);//aca se edita el nombre
                                System.out.println(" ¡Nombre editado con exito!");
                            }else if (option.equals("3")) {//opcion para editar el telefono
                                System.out.println(" Telefono actual");
                                System.out.println(cliente1.getTelefono());//se muestra el telefono actual que se va a editar
                                System.out.println(" Digite el nuevo telefono");
                                int tel=in.nextInt();//se pide el nuevo telefono
                                cliente1.setTelefono(tel);//aca se edita el telefono
                                System.out.println(" ¡Telefono editado con exito!");
                            }else if (option.equals("4")) {//opcion para editar la direccion
                                System.out.println(" Direccion actual");
                                System.out.println(cliente1.getDireccion());//se muestra la direccion actual que se va a editar
                                System.out.println(" Digite la nueva direccion");
                                String dir=in.next();//se pide la nueva direccion
                                cliente1.setDireccion(dir);//aca se edita la direccion
                                System.out.println(" ¡Direccion editada con exito!");
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
                                System.out.println(" ¡Cliente eliminado con exito! ");
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
                    System.out.println(" ¡Empleado creado con exito!");
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
                                System.out.println(" ¡Cedula editada con exito!");
                            }else if (option.equals("2")) {//opcion para editar el nombre
                                System.out.println(" Nombre actual");
                                System.out.println(empleado1.getNombre());//se muestra el nombre actual que se va a editar
                                System.out.println(" Digite el nuevo nombre");
                                String name=in.next();//se pide el nuevo nombre
                                empleado1.setNombre(name);//aca se edita el nombre
                                System.out.println(" ¡Nombre editado con exito!");
                            }else if (option.equals("3")) {//opcion para editar el telefono
                                System.out.println(" Telefono actual");
                                System.out.println(empleado1.getTelefono());//se muestra el telefono actual que se va a editar
                                System.out.println(" Digite el nuevo telefono");
                                int tel=in.nextInt();//se pide el nuevo telefono
                                empleado1.setTelefono(tel);//aca se edita el telefono
                                System.out.println(" ¡Telefono editado con exito!");
                            }else if (option.equals("4")) {//opcion para editar la direccion
                                System.out.println(" Direccion actual");
                                System.out.println(empleado1.getDireccion());//se muestra la direccion actual que se va a editar
                                System.out.println(" Digite la nueva direccion");
                                String dir=in.next();//se pide la nueva direccion
                                empleado1.setDireccion(dir);//aca se edita la direccion
                                System.out.println(" ¡Direccion editada con exito!");
                            }else if (option.equals("5")) {//opcion para editar el id
                                System.out.println(" ID actual");
                                System.out.println(empleado1.getId());//se muestra el id actual que se va a editar
                                System.out.println(" Digite el nuevo ID");
                                int ID=in.nextInt();//se pide el nuevo id
                                empleado1.setId(ID);//aca se edita el id
                                System.out.println(" ¡ID editado con exito!");
                            }else if (option.equals("6")) {//opcion para editar el cargo
                                System.out.println(" Cargo actual");
                                System.out.println(empleado1.getCargo());//se muestra el cargo actual que se va a editar
                                System.out.println(" Digite el nuevo cargo");
                                String Cargo=in.next();//se pide el nuevo cargo
                                empleado1.setCargo(Cargo);//aca se edita el cargo
                                System.out.println(" ¡Cargo editado con exito!");
                            }else if (option.equals("7")) {//opcion para editar el sueldo
                                System.out.println(" Sueldo actual");
                                System.out.println(empleado1.getDireccion());//se muestra el sueldo actual que se va a editar
                                System.out.println(" Digite el nuevo sueldo");
                                int Sueldo=in.nextInt();//se pide el nuevo sueldo
                                empleado1.setSueldo(Sueldo);//aca se edita el sueldo
                                System.out.println(" ¡Direccion editada con exito!");
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
                                System.out.println(" ¡Empleado eliminado con exito! ");
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
    }

    private static void menuPedido() {
    }

    private static void menuMesa() {
    }

    private static void menuProveedor() {
    }

    private static void menuSede() {
    }
}


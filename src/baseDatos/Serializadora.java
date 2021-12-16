/*package baseDatos;

import java.io.*;
import java.util.ArrayList;

public class Serializadora {

}*/

//Codigo base serializador (ctrl + shift + / + seleccionar, uncoment all)

package baseDatos;

        import gestorAplicacion.*;

        import java.io.EOFException;
        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import java.io.ObjectInputStream;
        import java.io.ObjectOutputStream;
        import java.io.Serializable;
        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.LinkedList;
        import java.util.TreeMap;

public class Serializadora implements Serializable {

    //Serializando arrays y leyendolos
    public static void Escritura() {

        //Serializar
        FileOutputStream Escritorclientes;
        FileOutputStream Escritorempleados;
        FileOutputStream Escritorcomidasede;
        FileOutputStream Escritorproveedor;
        FileOutputStream Escritorpedidos;
        FileOutputStream Escritorreservas;
        FileOutputStream Escritormesas;

        try {
            //Serializa la lista de clientes
            Escritorclientes = new FileOutputStream(System.getProperty("user.dir") + "\\tmp\\Listaclientes.txt");
            ObjectOutputStream out = new ObjectOutputStream(Escritorclientes);
            out.writeObject(Cliente.clientes);
            out.close();
            Escritorclientes.close();

            //Serializa la lista de empleados
            Escritorempleados = new FileOutputStream(System.getProperty("user.dir") + "\\tmp\\Listaempleados.txt");
            ObjectOutputStream out2 = new ObjectOutputStream(Escritorempleados);
            out.writeObject(Empleado.empleados);
            out2.close();
            Escritorclientes.close();

            //Serializa la lista de comidasede
            Escritorcomidasede = new FileOutputStream(System.getProperty("user.dir") + "\\tmp\\Listacomidasede.txt");
            ObjectOutputStream out3 = new ObjectOutputStream(Escritorcomidasede);
            out.writeObject(Catalogo.platos);
            out3.close();
            Escritorclientes.close();

            //Serializa la lista de proveedor
            Escritorproveedor = new FileOutputStream(System.getProperty("user.dir") + "\\tmp\\Listaproveedor.txt");
            ObjectOutputStream out4 = new ObjectOutputStream(Escritorproveedor);
            out.writeObject(Proveedor.proveedores);
            out4.close();
            Escritorproveedor.close();

            //Serializa la lista de pedidos
            Escritorpedidos = new FileOutputStream(System.getProperty("user.dir") + "\\tmp\\Listapedidos.txt");
            ObjectOutputStream out5 = new ObjectOutputStream(Escritorpedidos);
            out.writeObject(Pedido.pedidos);
            out5.close();
            Escritorpedidos.close();

            //Serializa la lista de reservas
            Escritorreservas = new FileOutputStream(System.getProperty("user.dir") + "\\tmp\\Listareservas.txt");
            ObjectOutputStream out6 = new ObjectOutputStream(Escritorreservas);
            out.writeObject(Reserva.reservas);
            out6.close();
            Escritorreservas.close();

            //Serializa la lista de mesas
            Escritormesas = new FileOutputStream(System.getProperty("user.dir") + "\\tmp\\Listamesas.txt");
            ObjectOutputStream out7 = new ObjectOutputStream(Escritormesas);
            out.writeObject(Mesa.mesas);
            out7.close();
            Escritorclientes.close();


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void Lectura() {
        //Deserializar

        FileInputStream Lectorclientes;
        FileInputStream Lectorempleados;
        FileInputStream Lectorcomidasede;
        FileInputStream Lectorproveedor;
        FileInputStream Lectorpedidos;
        FileInputStream Lectorreservas;
        FileInputStream Lectormesas;
        try {
            Lectorclientes = new FileInputStream(System.getProperty("user.dir") + "/tmp/Listaclientes.txt");
            ObjectInputStream in = new ObjectInputStream(Lectorclientes);
            HashMap<Integer, Cliente> cargaclientes = new HashMap<>();
            Cliente.clientes = cargaclientes;
            in.close();
            Lectorclientes.close();

            //Metodo para probar que esta leyendo
           /* for (Cliente test : cargaclientes) {
                System.out.println(test.getNombre());
                System.out.println(test.getCedula());
            }*/

            Lectorempleados = new FileInputStream(System.getProperty("user.dir") + "/tmp/Listaempleados.txt");
            ObjectInputStream in2 = new ObjectInputStream(Lectorempleados);
            LinkedList<Empleado> cargaempleados = new LinkedList<>();
            Empleado.empleados = cargaempleados;
            in2.close();
            Lectorempleados.close();

            //Metodo para probar que esta leyendo
           /* for (Cliente test : cargaclientes) {
                System.out.println(test.getNombre());
                System.out.println(test.getCedula());
            }*/

            Lectorcomidasede = new FileInputStream(System.getProperty("user.dir") + "/tmp/Listacomidasede.txt");
            ObjectInputStream in3 = new ObjectInputStream(Lectorcomidasede);
            TreeMap cargaplatos = new TreeMap<>();
            Catalogo.platos = cargaplatos;
            in3.close();
            Lectorcomidasede.close();

            //Metodo para probar que esta leyendo
           /* for (Cliente test : cargaclientes) {
                System.out.println(test.getNombre());
                System.out.println(test.getCedula());
            }*/

            Lectorproveedor = new FileInputStream(System.getProperty("user.dir") + "/tmp/Listaproveedor.txt");
            ObjectInputStream in4 = new ObjectInputStream(Lectorproveedor);
            LinkedList<Proveedor> cargaproveedores = new LinkedList<>();
            Proveedor.proveedores = cargaproveedores;
            in4.close();
            Lectorproveedor.close();

            //Metodo para probar que esta leyendo
           /* for (Cliente test : cargaclientes) {
                System.out.println(test.getNombre());
                System.out.println(test.getCedula());
            }*/

            Lectorpedidos = new FileInputStream(System.getProperty("user.dir") + "/tmp/Listapedidos.txt");
            ObjectInputStream in5 = new ObjectInputStream(Lectorpedidos);
            LinkedList<Pedido> cargapedidos = new LinkedList<>();
            Pedido.pedidos = cargapedidos;
            in5.close();
            Lectorpedidos.close();

            //Metodo para probar que esta leyendo
           /* for (Cliente test : cargaclientes) {
                System.out.println(test.getNombre());
                System.out.println(test.getCedula());
            }*/

            Lectorreservas = new FileInputStream(System.getProperty("user.dir") + "/tmp/Listareservas.txt");
            ObjectInputStream in6 = new ObjectInputStream(Lectorreservas);
            LinkedList<Reserva> cargareservas = new LinkedList<>();
            Reserva.reservas = cargareservas;
            in6.close();
            Lectorreservas.close();

            //Metodo para probar que esta leyendo
           /* for (Cliente test : cargaclientes) {
                System.out.println(test.getNombre());
                System.out.println(test.getCedula());
            }*/

            Lectormesas = new FileInputStream(System.getProperty("user.dir") + "/tmp/Listamesas.txt");
            ObjectInputStream in7 = new ObjectInputStream(Lectormesas);
            HashMap cargamesas = new HashMap<>();
            Mesa.mesas = cargamesas;
            in7.close();
            Lectormesas.close();

            //Metodo para probar que esta leyendo
           /* for (Cliente test : cargaclientes) {
                System.out.println(test.getNombre());
                System.out.println(test.getCedula());
            }*/

            System.out.println("Se cargaron correctamente los datos");

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } /*catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
    }
}


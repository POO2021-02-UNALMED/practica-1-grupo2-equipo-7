package gestorAplicacion;
import java.util.LinkedList;
import java.util.Map;

public class Proveedor {
    private int nit;
    private String nombre;
    private String telefono;
    //private Map<String, materiaPrima> productos_ofrecidos;
    public static LinkedList<Proveedor> proveedores=new LinkedList<>();

    public Proveedor(int nit, String nombre, String telefono){
        this.nit = nit;
        this.nombre = nombre;
        this.telefono = telefono;
        //this.productos_ofrecidos = productos_ofrecidos;
    }

    //Getters y Setters
    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static void crearProveedor(int nit, String nombre, String telefono) {
        Proveedor newProveedor=new Proveedor(nit,nombre,telefono);
        proveedores.add(newProveedor);
    }

    public static void verProveedores() {
        for(Proveedor proveedor:proveedores){
            System.out.println(proveedor);
        }
    }

    @Override
    public String toString() {
        return "NIT Proveedor " + nit + "\n" +
                "[ Nombre: " + nombre + "\n" +
                "  Telefono: " + telefono + " ]";
    }
}

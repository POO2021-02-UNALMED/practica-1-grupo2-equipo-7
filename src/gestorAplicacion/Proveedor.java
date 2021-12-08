package gestorAplicacion;
import java.util.Map;

public class Proveedor {
    private int nit;
    private String nombre;
    private String telefono;
    private Map<String, materiaPrima> productos_ofrecidos;
    private static Map<String, Proveedor> proveedores;

    public Proveedor(int nit, String nombre, String telefono, Map productos_ofrecidos, Map proveedores){
        this.nit = nit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.productos_ofrecidos = productos_ofrecidos;
        proveedores.put(this.nombre, this);
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

    public Map<String, materiaPrima> getProductos_ofrecidos() {
        return productos_ofrecidos;
    }

    public void setProductos_ofrecidos(Map<String, materiaPrima> productos_ofrecidos) {
        this.productos_ofrecidos = productos_ofrecidos;
    }

    public Map<String, Proveedor> getProveedores() {
        return proveedores;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nit=" + nit +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", productos_ofrecidos=" + productos_ofrecidos +
                '}';
    }
}

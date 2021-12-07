package gestorAplicacion;

import java.util.Hashtable;

public class materiaPrima {

    //Proveedor proveedor;
    protected String nombreInsumo;
    protected int cantInsumo;
    public static Hashtable<String,Integer> insumos=new Hashtable<>();

    public materiaPrima(String nombreInsumo, int cantInsumo) {
        this.nombreInsumo = nombreInsumo;
        this.cantInsumo = cantInsumo;
        insumos.put(nombreInsumo,cantInsumo);
    }
}

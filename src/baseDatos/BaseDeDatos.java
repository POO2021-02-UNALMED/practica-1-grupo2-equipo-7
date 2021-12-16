package baseDatos;

import gestorAplicacion.*;
import java.util.HashMap;


public class BaseDeDatos {
    public void baseDeDatos(){
        Catalogo.crearCatalogo("chicken burguer",12);
        Catalogo.crearCatalogo("vegan burguer",12);
        Catalogo.crearCatalogo("fish burguer",12);
        Catalogo.crearCatalogo("green burguer",12);
        Catalogo.crearCatalogo("vegan sandwich",15);
        Catalogo.crearCatalogo("chicken sandwich",15);
        Catalogo.crearCatalogo("tuna sandwich",15);
        Catalogo.crearCatalogo("fish sandwich",15);
        Catalogo.crearCatalogo("turkey sandwich",15);

        materiaPrima.crearInsumo("tomate", 20);
        materiaPrima.crearInsumo("cebolla", 20);
        materiaPrima.crearInsumo("tuna", 40);
        materiaPrima.crearInsumo("fish", 40);
        materiaPrima.crearInsumo("chicken", 40);
        materiaPrima.crearInsumo("potato", 20);
    
    HashMap<Integer, String > mapaClientes =new HashMap<Integer,String>();

        new Mesa(1, (short) 1,18);
        new Mesa(2, (short) 2,6);
        new Mesa(3, (short) 3,7);
        new Mesa(4, (short) 2,8);
        new Mesa(5, (short) 2,9);
    }
    
   
}

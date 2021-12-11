package baseDatos;

import gestorAplicacion.*;


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
        
        Cliente.crearCliente(1009825,"ricardo",31245678,"av colombia #63-10");
        Cliente.crearCliente(123,"r",321,"av");
    }
    
   
}

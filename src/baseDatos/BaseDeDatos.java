package baseDatos;

import gestorAplicacion.Catalogo;

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
    }
}

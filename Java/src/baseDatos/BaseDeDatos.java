package baseDatos;

import gestorAplicacion.*;
import java.util.HashMap;

import java.util.HashMap;
import java.util.TreeMap;


public class BaseDeDatos {
    public void baseDeDatos(){
        HashMap<String, Double> cb = new HashMap<>();
        cb.put("tomate",0.3);
        cb.put("cebolla",0.3);
        cb.put("chicken",0.5);
        cb.put("lechuga",0.3);
        cb.put("bread",0.4);
        HashMap<String, Double> vb = new HashMap<>();
        vb.put("tomate",0.3);
        vb.put("cebolla",0.3);
        vb.put("champiñon",0.5);
        vb.put("lechuga",0.3);
        vb.put("bread",0.4);
        HashMap<String, Double> fb = new HashMap<>();
        fb.put("tomate",0.3);
        fb.put("cebolla",0.3);
        fb.put("fish",0.5);
        fb.put("lechuga",0.3);
        fb.put("bread",0.4);
        HashMap<String, Double> gb = new HashMap<>();
        gb.put("tomate",0.3);
        gb.put("cebolla",0.3);
        gb.put("pimiento",0.5);
        gb.put("lechuga",0.3);
        gb.put("bread",0.4);
        HashMap<String, Double> vs = new HashMap<>();
        vs.put("tomate",0.3);
        vs.put("cebolla",0.3);
        vs.put("lenteja",0.5);
        vs.put("lechuga",0.3);
        vs.put("bread",0.4);
        HashMap<String, Double> cs = new HashMap<>();
        cs.put("tomate",0.3);
        cs.put("cebolla",0.3);
        cs.put("chicken",0.5);
        cs.put("bread",0.4);
        HashMap<String, Double> ts = new HashMap<>();
        ts.put("tomate",0.3);
        ts.put("cebolla",0.3);
        ts.put("tuna",0.5);
        ts.put("bread",0.4);
        HashMap<String, Double> fs = new HashMap<>();
        fs.put("tomate",0.3);
        fs.put("cebolla",0.3);
        fs.put("fish",0.5);
        fs.put("bread",0.4);
        HashMap<String, Double> tks = new HashMap<>();
        tks.put("tomate",0.3);
        tks.put("cebolla",0.3);
        tks.put("turkey",0.5);
        tks.put("bread",0.4);

        Catalogo.crearCatalogo("chicken burguer",12,cb);
        Catalogo.crearCatalogo("vegan burguer",12,vb);
        Catalogo.crearCatalogo("fish burguer",12,fb);
        Catalogo.crearCatalogo("green burguer",12,gb);
        Catalogo.crearCatalogo("vegan sandwich",15,vb);
        Catalogo.crearCatalogo("chicken sandwich",15,cb);
        Catalogo.crearCatalogo("tuna sandwich",15,ts);
        Catalogo.crearCatalogo("fish sandwich",15,fs);
        Catalogo.crearCatalogo("turkey sandwich",15,tks);

        materiaPrima.crearInsumo("tomate", 20);
        materiaPrima.crearInsumo("lechuga", 20);
        materiaPrima.crearInsumo("champiñon", 20);
        materiaPrima.crearInsumo("pimiento", 20);
        materiaPrima.crearInsumo("lenteja", 20);
        materiaPrima.crearInsumo("cebolla", 20);
        materiaPrima.crearInsumo("tuna", 40);
        materiaPrima.crearInsumo("fish", 40);
        materiaPrima.crearInsumo("chicken", 40);
        materiaPrima.crearInsumo("turkey", 40);
        materiaPrima.crearInsumo("patata", 20);
        materiaPrima.crearInsumo("bread", 20);
        materiaPrima.crearInsumo("meat", 20);

        
        Cliente.crearCliente(1009825,"ricardo",31245678,"av colombia #63-10",null);
        Cliente.crearCliente(1123, "Juan", 3124, "Sarie bay", null);
        Cliente.crearCliente(15423, "Carlos", 35324, "Tablitas", null);
        Cliente.crearCliente(16333, "Luz", 345324, "Morrys Landing", null);
        Cliente.crearCliente(11254, "Doris", 31644, "San Luis", null);
        Cliente.crearCliente(1143323, "Keder", 312644, "Barrio Obrero", null);
        Cliente.crearCliente(1123453, "Leo", 315424, "Atlantico", null);
        Cliente.crearCliente(123,"r",321,"av",null);
        materiaPrima.crearInsumo("potato", 20);
    
    HashMap<Integer, String > mapaClientes =new HashMap<Integer,String>();

        new Mesa(1, (short) 1,18);
        new Mesa(2, (short) 2,6);
        new Mesa(3, (short) 3,7);
        new Mesa(4, (short) 2,8);
        new Mesa(5, (short) 2,9);
        Reserva.crearReserva(1009825, 23,  "24/12/21", "14:00", 2);
        Reserva.crearReserva(1009845, 44,  "26/12/21", "16:00", 7);
        Reserva.crearReserva(1049825, 25,  "12/12/21", "18:00", 4);

    }
    
   
}

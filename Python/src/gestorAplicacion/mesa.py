#from Basedatos.baseDeDatos import baseDedatos
from cliente import Cliente
from catalogo import Catalogo
from cliente import Cliente
from pedido import Pedido
import random 

class Mesa():

    mesas = {}
    #baseDedatos.base_de_datos()
    
    def __init__(self, id, numero, zona, disponibilidad = True, pedidoM = None):
        self._idUnico        = id
        self._numero         = numero
        self._zona           = zona
        self._disponibilidad = disponibilidad
        self.pedido         = pedidoM
        Mesa.mesas[numero] = self
    
    def getIdunico(self):
        return self._idUnico

    def setIdunico(self, id):
        self._idUnico = id
    
    def getZona(self):
        if (self._zona == 1):
            return "VIP"
        elif (self._zona == 2):
            return "Salón principal"
        elif (self._zona == 3):
            return "Terraza"
        elif (self._zona != range(0,4)):
            return "Código de zona inválido"
    

    def setZona(self, zona):
        self._zona = zona

    
    def getNumero(self):
        return self._numero

    
    def setNumero(self, numero):
        self._numero = numero
    

    def getPedido(self):
        return self._pedido

    def isDisponibilidad(self):
        return self._disponibilidad

    def setDisponibilidad(self, disponibilidad):
        self._disponibilidad = disponibilidad
    
    def entornoMesa(self, cliente):
        val = 0
        idPedido = random.randint(0, 10000)
        pedidoM           = {Catalogo : int}
        Catalogo.verCatalogo() #Crear método para ver el catálogo
        if (self.pedido == None):
            Pedido(cliente, self, idPedido, pedidoM)
            self._disponibilidad = False
        else: 
            print("""
            ___________________________
            Pedido actual:
            Plato(c/u)                    /            Cant./Precio
            
            """)
            for plato, cantidad in self._pedido.items():
                print(f'{plato}  / {cantidad}/{plato.getPrecio()*cantidad}')
                val += cantidad * plato.getPrecio()
        print("""Elija uno por uno los items que desea agregar a su pedido, con 0 finaliza el pedido.
               Escriba 0000 Para realizar la factura de la mesa actual.""")
        op = int(input())
        if (op == 0000):
            self._pedido.recibo(val)
            for plato, cantidad in self._pedido.items():
                Catalogo.descontarInsumos(plato, cantidad)
            self._pedido = None
            self._disponibilidad = True
        else:
            pass

cb = {str : }
cb["tomate"] = 0.3
cb["cebolla"] = 0.3
cb["chicken"] = 0.5
cb["lechuga"] = 0.3
cb["bread"] = 0.4
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

Cliente(1124, "Alberto Nuñez", 312313, "Barrio Nueva Guinea")
Mesa(112, 1, 1)

Mesa.entornoMesa(Mesa.mesas[1], Cliente.clientes[1124])

   
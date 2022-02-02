#from Basedatos.baseDeDatos import baseDedatos
from numpy import double
from gestorAplicacion.cliente import Cliente
from gestorAplicacion.catalogo import Catalogo
from gestorAplicacion.cliente import Cliente
from gestorAplicacion.pedido import Pedido
from gestorAplicacion.materiaprima import materiaPrima
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
        if (self._disponibilidad):
            return "Disponible"
        else:
            return "Ocupada"

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
            
            while(op != 0):
                if (Catalogo.listaPlatos.get(op)):
                    cant = int(input("¿Qué cantidad desea?"))
                    op = int(input("""Elija uno por uno los items que desea agregar a su pedido, con 0 finaliza el pedido.
               Escriba 0000 Para realizar la factura de la mesa actual."""))








    @classmethod
    def verMesas(cls):
        for numero, mesa in Mesa.mesas.items():
            print(f'Mesa {numero} ({mesa.isDisponibilidad()})')
# Diccionarios con los ingredientes y sus cantidades
    def ingreso_datos():
        cb = {str : double}
        cb["tomate"] = 0.3
        cb["cebolla"] = 0.3
        cb["chicken"] = 0.5
        cb["lechuga"] = 0.3
        cb["bread"] = 0.4
        vb = {str : double}
        vb["tomate"] = 0.3
        vb["cebolla"] = 0.3
        vb["champiñon"] = 0.5
        vb["lechuga"] = 0.3
        vb["bread"] = 0.4
        fb = {str : double}
        fb["tomate"] = 0.3
        fb["cebolla"] = 0.3
        fb["fish"] = 0.5
        fb["lechuga"] = 0.3
        fb["bread"] = 0.4
        gb = {str : double}
        gb["tomate"] = 0.3
        gb["cebolla"] = 0.3
        gb["pimiento"] = 0.5
        gb["lechuga"] = 0.3
        gb["bread"] = 0.4
        vs = {str : double}
        vs["tomate" ] = 0.3
        vs["cebolla"] = 0.3
        vs["lenteja"] = 0.5
        vs["lechuga"] = 0.3
        vs["bread"] = 0.4
        cs = {str : double}
        cs["tomate"] = 0.3
        cs["cebolla"] = 0.3
        cs["chicken"] = 0.5
        cs["bread"] = 0.4
        ts = {str : double}
        ts["tomate"] = 0.3
        ts["cebolla"] = 0.3
        ts["tuna"] = 0.5
        ts["bread"] = 0.4
        fs = {str : double}
        fs["tomate"] = 0.3
        fs["cebolla"] = 0.3
        fs["fish"] = 0.5
        fs["bread"] = 0.4
        tks = {str : double}
        tks["tomate"] = 0.3
        tks["cebolla"] = 0.3
        tks["turkey"] = 0.5
        tks["bread"] = 0.4


        #catalogos
        Catalogo("chicken burguer",12,cb)
        Catalogo("vegan burguer",12,vb)
        Catalogo("fish burguer",12,fb)
        Catalogo("green burguer",12,gb)
        Catalogo("vegan sandwich",15,vb)
        Catalogo("chicken sandwich",15,cb)
        Catalogo("tuna sandwich",15,ts)
        Catalogo("fish sandwich",15,fs)
        Catalogo("turkey sandwich",15,tks)
        # materia prima
        materiaPrima("tomate", 20)
        materiaPrima("lechuga", 20)
        materiaPrima("champiñon", 20)
        materiaPrima("pimiento", 20)
        materiaPrima("lenteja", 20)
        materiaPrima("cebolla", 20)
        materiaPrima("tuna", 40)
        materiaPrima("fish", 40)
        materiaPrima("chicken", 40)
        materiaPrima("turkey", 40)
        materiaPrima("patata", 20)
        materiaPrima("bread", 20)
        materiaPrima("meat", 20)
        materiaPrima("potato", 20)

        # Clientes
        Cliente(1009825,"ricardo",31245678,"av colombia #63-10")
        Cliente(1123, "Juan", 3124, "Sarie bay")
        Cliente(15423, "Carlos", 35324, "Tablitas")
        Cliente(16333, "Luz", 345324, "Morrys Landing")
        Cliente(11254, "Doris", 31644, "San Luis")
        Cliente(1143323, "Keder", 312644, "Barrio Obrero")
        Cliente(1123453, "Leo", 315424, "Atlantico")
        Cliente(123,"r",321,"av")
        Cliente(1124, "Alberto Nuñez", 312313, "Barrio Nueva Guinea")
        
        #Mesas
        Mesa(1, 1,18)
        Mesa(2, 2,6)
        Mesa(3, 3,7)
        Mesa(4, 4,8)
        Mesa(5, 5,9)



#Mesa.entornoMesa(Mesa.mesas[1], Cliente.clientes[1124])
#Mesa.verMesas()
def run():
    cc = int(input("Ingrese la cc del cliente: "))
    Cliente.verification(cc)
    Mesa.verMesas()
    mes = int(input("A qué mesa desea entrar?"))
    Mesa.entornoMesa(Mesa.mesas.get(mes), Cliente.clientes.get(cc))
#print(Cliente.clientes[cc].nombre)
#print(Cliente.clientes.keys())
#.get(cc,'no se encuentra')
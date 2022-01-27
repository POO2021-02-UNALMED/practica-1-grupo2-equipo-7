from typing_extensions import Self
from xmlrpc.client import Boolean
from numpy import short
from Python.src.Basedatos.Serializadora import save_mesas
from gestorAplicacion import pedido
from Basedatos import Serializadora
from gestorAplicacion import cliente
from gestorAplicacion import catalogo
import random

class Mesa():
    
    def __init__(cls, self, id, numero, zona, disponibilidad = True):
        self._idUnico        = id
        self._numero         = int
        self._zona           = short
        self._disponibilidad = bool
        self._pedido         = pedido
        save_mesas(numero, self)
    
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

    
    def getNumero(self, numero):
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
        pedidoM           = {catalogo : int}
        catalogo.verCatalogo() #Crear método para ver el catálogo
        if (self._pedido == None):
            pedido(cliente, self, idPedido, pedidoM)
            self._disponibilidad = False
        else: 
            print("""
            ___________________________
            Pedido actual:
            Plato(c/u)                    /            Cant./Precio
            
            """)
            for plato, cantidad in self._pedido.items():
                print(f'{plato}  / {cantidad}/{plato.getPrecio()*cantidad}')
                
        






   
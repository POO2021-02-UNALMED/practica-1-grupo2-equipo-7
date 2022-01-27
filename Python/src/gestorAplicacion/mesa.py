from typing_extensions import Self
from xmlrpc.client import Boolean
from numpy import short
from Python.src.Basedatos.Serializadora import save_mesas
from gestorAplicacion import pedido
from Basedatos import Serializadora


class Mesa():
    
    def __init__(cls, self, id, numero, zona, disponibilidad = True):
        self._idUnico        = id
        self._numero         = int
        self._zona           = short
        self._disponibilidad = bool
        self._pedido         = pedido
        save_mesas(numero, self)
    
    
   
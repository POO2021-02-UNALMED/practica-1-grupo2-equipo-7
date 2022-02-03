from persona import Persona
import pickle
class Cliente(Persona):

    clientes = {}
    def __init__(self,cedula,nombre,telefono, direccion,reserva = None):
        super().__init__( cedula,nombre,telefono, direccion)
        self.reserva = reserva
        Cliente.clientes[cedula] = self
    
    fichero_binario=open("Losclientes","wb")

    pickle.dump(clientes, fichero_binario)

    fichero_binario.close()

    del(fichero_binario)

fichero=open("LosClientes", "rb")

misClientes=pickle.load(fichero)

fichero.close()

for c in misClientes:

    print(c.estado())
    @classmethod

    def verClientes(cls):
        for cedula, cliente in Cliente.clientes.items():
            print(f'Cedula: {cedula} Nombre: {cliente.nombre}')

    def setReserva(self,reserv):
        self.reserva = reserv

    def getReserva(self):
        return self.reserva  


    def verification(cedula):
        if(Cliente.clientes.get(cedula,'no se encuentra')=='no se encuentra'):
            print('El usuario no existe, vamos a crearlo:')
            cc = input('¿Desea usar el mismo número de cc?')
            if(len(cc) == 0):
                cc = cedula
            nombre = input("Ingrese su nombre: ")
            telefono = input('Ingrese su número de teléfono: ')
            direccion = input('Ingrese su dirección: ')
            Cliente(cc, nombre, telefono, direccion)
            print(f'Bienvenido(a) sr(a) {nombre}')
        else: 
            print(f'Bienvenido(a) sr(a) {Cliente.clientes.get(cedula).nombre}')



    


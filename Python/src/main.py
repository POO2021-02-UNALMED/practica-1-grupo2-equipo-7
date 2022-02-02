from ast import Lambda
from cProfile import label
from cgitb import text
from distutils import command
from doctest import master
from email import message
from lib2to3.pgen2.token import LEFTSHIFT
from textwrap import fill
from tkinter import *
import tkinter as tk
from tkinter.messagebox import showinfo, showwarning
from turtle import bgcolor, right
from gestorAplicacion.cliente import Cliente

from gestorAplicacion.persona import Persona
from gestorAplicacion.empleado import Empleado
#from gestorAplicacion.interfaz_entornoMesa import botones_mesas
from gestorAplicacion.mesa import Mesa

class posicion():
    num = 1
    pos_y = 0
    pos_x = 1

#se crea la ventana de inicio
ventana = tk.Tk()
ventana.title("Inicio") #el titulo de la ventana
ventana.geometry("900x500") #las dimensiones

#botones salir y descripcion---------
btnSalir=Button(ventana,text="Salir",bg="gray",command=ventana.destroy)
btnSalir.place(relx=0.85,rely=0.95,relheight=0.05,relwidth=0.12)

#ventana descripcion--------------------------------------
def Descripcion():
    ventanaDescp=Toplevel()
    ventanaDescp.geometry("300x400")
    ventanaDescp.title("Descripcion")
    textDesc="Poopina es un software  de gestión y organización para restaurantes, el cual se basa en ayudar a ordenar nuestro restaurante. Podremos registrar clientes frecuentes, gestionar reservas, tener control del inventario , llevar control estricto sobre cada orden y la mesa donde esta se efectuó entre otras cosas."

    contenedorDescp=Frame(ventanaDescp, height=250 , width=350,bd=2, bg="Light Blue" , relief=SUNKEN)
    contenedorDescp.pack(fill="both",expand="True",padx=4,pady=4,side=TOP)

    mensaje=Message(contenedorDescp,text=textDesc,bg="Light Blue" ,fg="black",font="Arial")
    mensaje.place(relx=0.01,relheight=0.9,relwidth=0.9)

#----------------------------------------------------------
#boton descripcion
btnDesc=Button(ventana,text="Descripcion",bg="gray",command=Descripcion)
btnDesc.place(relx=0.7,rely=0.95,relheight=0.05,relwidth=0.12)

#---------------------------------------------------


#ventana menu ---------------------------------------------
def menu():
    ventana.withdraw()
    ventanaMenu=Toplevel()
    ventanaMenu.geometry("900x500")
    ventanaMenu.title("POOPINA")
    ventanaMenu.configure(background="light gray")
    contenedor=Frame(ventanaMenu,bg="gray" ,bd=2,relief=SUNKEN)
    contenedor.place(relheight=1,relwidth=1)

    def salir():
        ventanaMenu.destroy()
        ventana.mainloop()
        

    #Mensaje sobre los desarrolladores
    def ayuda():
        showinfo(title="Desarrolladores" ,message=" Edgar Alexis Garcia Camuan \n Omar Enrique Chavez Fonseca \n Keder Julian Madera Polo") 

   
    #En esta seccion va todo lo relacionado con el menu cliente y sus funciones
    def cliente():
        contenedor1=Frame(ventanaMenu,bd=2,relief=SUNKEN)
        contenedor1.place(relx=0.01,rely=0.01,relheight=0.97,relwidth=0.97)

        Barra=Frame(contenedor1,bg="gray" ,bd=2,relief=SUNKEN)
        Barra.place(relheight=0.07,relwidth=1)

        def registrar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN)
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

            lista=Listbox(contenedor2,bd=2,relief=SUNKEN)
            lista.place(relx=0.6,rely=0.08,relheight=0.45,relwidth=0.37)

            nombre=StringVar()
            cedula=StringVar()
            telefono=StringVar()
            direccion=StringVar()
            

            nombre_label=Label(contenedor2 ,text="Nombre",bd=2,relief=SUNKEN,bg="light gray")
            nombre_label.place(relx=0.05,rely=0.08,relheight=0.05,relwidth=0.15)
            nombre_entry=Entry(contenedor2,textvariable=nombre)
            nombre_entry.place(relx=0.22,rely=0.08,relheight=0.05,relwidth=0.35)

            cedula_label=Label(contenedor2 ,text="Cedula",bd=2,relief=SUNKEN,bg="light gray")
            cedula_label.place(relx=0.05,rely=0.16,relheight=0.05,relwidth=0.15)
            cedula_entry=Entry(contenedor2,textvariable=cedula)
            cedula_entry.place(relx=0.22,rely=0.16,relheight=0.05,relwidth=0.35)

            telefono_label=Label(contenedor2 ,text="Telefono",bd=2,relief=SUNKEN,bg="light gray")
            telefono_label.place(relx=0.05,rely=0.24,relheight=0.05,relwidth=0.15)
            telefono_entry=Entry(contenedor2,textvariable=telefono)
            telefono_entry.place(relx=0.22,rely=0.24,relheight=0.05,relwidth=0.35)

            direccion_label=Label(contenedor2 ,text="Direccion",bd=2,relief=SUNKEN,bg="light gray")
            direccion_label.place(relx=0.05,rely=0.32,relheight=0.05,relwidth=0.15)
            direccion_entry=Entry(contenedor2,textvariable=direccion)
            direccion_entry.place(relx=0.22,rely=0.32,relheight=0.05,relwidth=0.35)


            def crear():
                lista.delete(0,END)
                
                name=nombre_entry.get()
                cc=cedula_entry.get()
                tel=telefono_entry.get()
                dir=direccion_entry.get()
            
                newCliente=Cliente(cc,name,tel,dir)

                lista.insert(END,('¡Empleado creado con exito!'))
                lista.insert(END,('Nombre: ',newCliente.nombre))
                lista.insert(END,('Cedula: ',newCliente.cedula))
                lista.insert(END,('Telefono: ',newCliente.telefono))
                lista.insert(END,('Direccion: ',newCliente.direccion))
                lista.insert(END,('Reserva: ',newCliente.reserva))

                btnReserva=Button(contenedor2,width=20 ,bd=2,relief=SUNKEN,text="Reserva",bg="light gray",command=reserva)
                btnReserva.place(relx=0.6,rely=0.7,relheight=0.05,relwidth=0.25)
              
               

                nombre_entry.delete(0,END)
                cedula_entry.delete(0,END)
                telefono_entry.delete(0,END)
                direccion_entry.delete(0,END)
                

            btncrear=Button(contenedor2,width=20 ,bd=2,relief=SUNKEN,text="Registrar",bg="light gray",command=crear)
            btncrear.place(relx=0.1,rely=0.7,relheight=0.05,relwidth=0.25)

        def ver():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="yellow")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def eliminar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="white")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def editar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="black")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        btn1=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Registrar Cliente",bg="light gray",command=registrar)
        btn1.grid(row=0,column=0)
        btn2=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Ver Cliente",bg="light gray",command=ver)
        btn2.grid(row=0,column=1)
        btn3=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Eliminar Cliente",bg="light gray",command=eliminar)
        btn3.grid(row=0,column=2)
        btn4=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Editar Cliente",bg="light gray",command=editar)
        btn4.grid(row=0,column=3)



    #En esta seccion va todo lo relacionado con el menu reserva y sus funciones
    def reserva():
        contenedor1=Frame(ventanaMenu,bd=2,relief=SUNKEN)
        contenedor1.place(relx=0.01,rely=0.01,relheight=0.97,relwidth=0.97)

        Barra=Frame(contenedor1,bg="gray" ,bd=2,relief=SUNKEN)
        Barra.place(relheight=0.07,relwidth=1)

        def registrar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="red")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def ver():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="yellow")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def eliminar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="white")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def editar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="black")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        btn1=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Registrar Reserva",bg="light gray",command=registrar)
        btn1.grid(row=0,column=0)
        btn2=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Ver Reserva",bg="light gray",command=ver)
        btn2.grid(row=0,column=1)
        btn3=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Eliminar Reserva",bg="light gray",command=eliminar)
        btn3.grid(row=0,column=2)
        btn4=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Editar Reserva",bg="light gray",command=editar)
        btn4.grid(row=0,column=3)


    #En esta seccion va todo lo relacionado con el menu mesa y sus funciones
    def mesa():
        contenedor1=Frame(ventanaMenu ,bd=2,relief=SUNKEN)
        contenedor1.place(relx=0.01,rely=0.01,relheight=0.97,relwidth=0.97)

        Barra=Frame(contenedor1,bg="gray" ,bd=2,relief=SUNKEN)
        Barra.place(relheight=0.07,relwidth=1)

        def registrar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="red")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def ver():
            pos_y = 0
            pos_x = 1
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="yellow")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)
            
            def actualizar_posicion(pos_x, pos_y):
                
                if (pos_x == 8):
                    pos_y += 1
                    pos_x = 0
                else:
                    pos_x += 1   
                return pos_x, pos_y

            Mesa.ingreso_datos()
            Mesa.verMesas()
            for num in Mesa.mesas.keys():
                btn7 = Button(contenedor2, width=10, text=f'Mesa {num}', background = "green", command=pedido)
                btn7.grid(padx=0, pady=2, row=pos_y, column=pos_x)
                pos_x, pos_y = actualizar_posicion(pos_x, pos_y)
                

        def eliminar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="white")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def editar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="black")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        btn1=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Registrar Mesa",bg="light gray",command=registrar)
        btn1.grid(row=0,column=0)
        btn2=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Ver Mesas",bg="light gray",command=ver)
        btn2.grid(row=0,column=1)
        btn3=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Eliminar Mesa",bg="light gray",command=eliminar)
        btn3.grid(row=0,column=2)
        btn4=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Editar Mesa",bg="light gray",command=editar)
        btn4.grid(row=0,column=3)

    
    #En esta seccion va todo lo relacionado con el menu pedido y sus funciones
    def pedido():
        
        contenedor1=Frame(ventanaMenu ,bd=2,relief=SUNKEN)
        contenedor1.place(relx=0.01,rely=0.01,relheight=0.97,relwidth=0.97)

        Barra=Frame(contenedor1,bg="gray" ,bd=2,relief=SUNKEN)
        Barra.place(relheight=0.07,relwidth=1)

        def registrar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="red")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def ver():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="yellow")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)
            
        


        def eliminar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="white")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def editar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="black")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def facturar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="blue")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        btn1=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Registrar Pedido",bg="light gray",command=registrar)
        btn1.grid(row=0,column=0)
        btn2=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Ver Pedido",bg="light gray",command=ver)
        btn2.grid(row=0,column=1)
        btn3=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Eliminar Pedido",bg="light gray",command=eliminar)
        btn3.grid(row=0,column=2)
        btn4=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Editar Pedido",bg="light gray",command=editar)
        btn4.grid(row=0,column=3)
        btn5=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Facturar Pedido",bg="light gray",command=facturar)
        btn5.grid(row=0,column=4)

    
    
    
    #En esta seccion va todo lo relacionado con el menu empleado y sus funciones
    def empleado():
        contenedor1=Frame(ventanaMenu,bd=2,relief=SUNKEN)
        contenedor1.place(relx=0.01,rely=0.01,relheight=0.97,relwidth=0.97)

        Barra=Frame(contenedor1,bg="gray" ,bd=2,relief=SUNKEN)
        Barra.place(relheight=0.07,relwidth=1)

        #esta funcion registrara un nuevo empleado
        def registro():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN)
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

            lista=Listbox(contenedor2,bd=2,relief=SUNKEN)
            lista.place(relx=0.6,rely=0.08,relheight=0.45,relwidth=0.37)

            nombre=StringVar()
            cedula=StringVar()
            telefono=StringVar()
            direccion=StringVar()
            cargo=StringVar()
            sueldo=StringVar()

            nombre_label=Label(contenedor2 ,text="Nombre",bd=2,relief=SUNKEN,bg="light gray")
            nombre_label.place(relx=0.05,rely=0.08,relheight=0.05,relwidth=0.15)
            nombre_entry=Entry(contenedor2,textvariable=nombre)
            nombre_entry.place(relx=0.22,rely=0.08,relheight=0.05,relwidth=0.35)

            cedula_label=Label(contenedor2 ,text="Cedula",bd=2,relief=SUNKEN,bg="light gray")
            cedula_label.place(relx=0.05,rely=0.16,relheight=0.05,relwidth=0.15)
            cedula_entry=Entry(contenedor2,textvariable=cedula)
            cedula_entry.place(relx=0.22,rely=0.16,relheight=0.05,relwidth=0.35)

            telefono_label=Label(contenedor2 ,text="Telefono",bd=2,relief=SUNKEN,bg="light gray")
            telefono_label.place(relx=0.05,rely=0.24,relheight=0.05,relwidth=0.15)
            telefono_entry=Entry(contenedor2,textvariable=telefono)
            telefono_entry.place(relx=0.22,rely=0.24,relheight=0.05,relwidth=0.35)

            direccion_label=Label(contenedor2 ,text="Direccion",bd=2,relief=SUNKEN,bg="light gray")
            direccion_label.place(relx=0.05,rely=0.32,relheight=0.05,relwidth=0.15)
            direccion_entry=Entry(contenedor2,textvariable=direccion)
            direccion_entry.place(relx=0.22,rely=0.32,relheight=0.05,relwidth=0.35)

            cargo_label=Label(contenedor2 ,text="Cargo",bd=2,relief=SUNKEN,bg="light gray")
            cargo_label.place(relx=0.05,rely=0.4,relheight=0.05,relwidth=0.15)
            cargo_entry=Entry(contenedor2,textvariable=cargo)
            cargo_entry.place(relx=0.22,rely=0.4,relheight=0.05,relwidth=0.35)

            sueldo_label=Label(contenedor2 ,text="Sueldo",bd=2,relief=SUNKEN,bg="light gray")
            sueldo_label.place(relx=0.05,rely=0.48,relheight=0.05,relwidth=0.15)
            sueldo_entry=Entry(contenedor2,textvariable=sueldo)
            sueldo_entry.place(relx=0.22,rely=0.48,relheight=0.05,relwidth=0.35)

            def crear():
                lista.delete(0,END)
                
                name=nombre_entry.get()
                cc=cedula_entry.get()
                tel=telefono_entry.get()
                dir=direccion_entry.get()
                carg=cargo_entry.get()
                suel=sueldo_entry.get()

                empleadoNew=Empleado(cc,name,tel,dir,carg,suel)

                lista.insert(END,('¡Empleado creado con exito!'))
                lista.insert(END,('Nombre: ',empleadoNew.nombre))
                lista.insert(END,('Cedula: ',empleadoNew.cedula))
                lista.insert(END,('Telefono: ',empleadoNew.telefono))
                lista.insert(END,('Direccion: ',empleadoNew.direccion))
                lista.insert(END,('Cargo: ',empleadoNew._cargo))
                lista.insert(END,('Sueldo: ',empleadoNew._sueldo))
               

                nombre_entry.delete(0,END)
                cedula_entry.delete(0,END)
                telefono_entry.delete(0,END)
                direccion_entry.delete(0,END)
                cargo_entry.delete(0,END)
                sueldo_entry.delete(0,END)

            btncrear=Button(contenedor2,width=20 ,bd=2,relief=SUNKEN,text="Registrar",bg="light gray",command=crear)
            btncrear.place(relx=0.1,rely=0.7,relheight=0.05,relwidth=0.25)


        def verEmpleados():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN)
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

            lista=Listbox(contenedor2,bd=2,relief=SUNKEN)
            lista.place(relx=0.06,rely=0.06,relheight=0.85,relwidth=0.85)

            scroll=Scrollbar(contenedor2,bd=3,relief=SUNKEN,bg="gray",command=lista.yview)
            scroll.place(relx=0.91,rely=0.064,relheight=0.85,relwidth=0.02)
            lista.config(yscrollcommand=scroll)

            lista.insert(END,('Lista de empleados  '))
            for cedula,empleado in Empleado.empleados.items():
                lista.insert(END,'\n')
                lista.insert(END,('Nombre: ',empleado.nombre))
                lista.insert(END,('Cedula: ',empleado.cedula))
                lista.insert(END,('Telefono: ',empleado.telefono))
                lista.insert(END,('Direccion: ',empleado.direccion))
                lista.insert(END,('Cargo: ',empleado.getCargo()))
                lista.insert(END,('sueldo: ',empleado.getSueldo()))
                lista.insert(END,'\n')

            #for x in Empleado.empleados:
            #    lista.insert(END,(Empleado.empleados[x]))

 
            

        def elimEmpleado():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN)
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

            lista=Listbox(contenedor2,bd=2,relief=SUNKEN)
            lista.place(relx=0.6,rely=0.08,relheight=0.45,relwidth=0.37)

            cedula=StringVar()

            msg_label=Label(contenedor2 ,text="Digite la cedula del empleado a eliminar",font="Elephant")
            msg_label.place(relx=0.05,rely=0.08,relheight=0.05,relwidth=0.52)

            cedula_label=Label(contenedor2 ,text="Cedula",bd=2,relief=SUNKEN,bg="light gray")
            cedula_label.place(relx=0.05,rely=0.18,relheight=0.05,relwidth=0.15)
            cedula_entry=Entry(contenedor2,textvariable=cedula)
            cedula_entry.place(relx=0.22,rely=0.18,relheight=0.05,relwidth=0.35)

            def eliminar():
                print("empleado eliminado")
             

            btnelim=Button(contenedor2,width=20 ,bd=2,relief=SUNKEN,text="Eliminar",bg="light gray",command=eliminar)
            btnelim.place(relx=0.1,rely=0.3,relheight=0.05,relwidth=0.25)

        def editEmpleado():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN)
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

            lista=Listbox(contenedor2,bd=2,relief=SUNKEN)
            lista.place(relx=0.6,rely=0.08,relheight=0.45,relwidth=0.37)

            lista.insert(END,('Lista de empleados: '))
            lista.insert(END,'\n')
            #un for que recorra la lista
            for cedula,empleado in Empleado.empleados.items():
                lista.insert(END,('Nombre: ',empleado.nombre))
                lista.insert(END,('Cedula: ',empleado.cedula))
                lista.insert(END,('Telefono: ',empleado.telefono))
                lista.insert(END,('Direccion: ',empleado.direccion))
                lista.insert(END,('Cargo: ',empleado.getCargo()))
                lista.insert(END,('sueldo: ',empleado.getSueldo()))
                lista.insert(END,'\n')

            cedula=StringVar()

            msg_label=Label(contenedor2 ,text="Digite la cedula del empleado a editar",font="Elephant")
            msg_label.place(relx=0.05,rely=0.08,relheight=0.05,relwidth=0.52)

            cedula_label=Label(contenedor2 ,text="Cedula",bd=2,relief=SUNKEN,bg="light gray")
            cedula_label.place(relx=0.05,rely=0.18,relheight=0.05,relwidth=0.15)
            cedula_entry=Entry(contenedor2,textvariable=cedula)
            cedula_entry.place(relx=0.22,rely=0.18,relheight=0.05,relwidth=0.35)

            def comprobarCedula(Ced):
                #Esta funcion lo que hace es verrificar si en la lista se encuentra la cedula que se ingresa(con el cedula_entry.get)
                #si es asi permite editar de lo contrario emitira un mensaje de advertencia
                try:
                    if(Empleado.empleados[Ced]):
                      editarEmpleado(Empleado.empleados[Ced])
                    else:
                       raise KeyError 
                
                except KeyError:
                    showwarning('Advertencia','La cedula digitada no existe') 

            def editarEmpleado(empleado):

                contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN)
                contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

                lista=Listbox(contenedor2,bd=2,relief=SUNKEN)
                lista.place(relx=0.6,rely=0.08,relheight=0.45,relwidth=0.37)

                nombre=StringVar()
                cedula=StringVar()
                telefono=StringVar()
                direccion=StringVar()
                cargo=StringVar()
                sueldo=StringVar()

                #textExample = tk.Entry(root) 
                #textExample.insert(0, "Default Text") 
                #textExample.pack()

                nombre_label=Label(contenedor2 ,text="Nombre",bd=2,relief=SUNKEN,bg="light gray")
                nombre_label.place(relx=0.05,rely=0.08,relheight=0.05,relwidth=0.15)
                nombre_entry=Entry(contenedor2,textvariable=nombre)
                nombre_entry.insert(0,empleado.getNombre())
                nombre_entry.place(relx=0.22,rely=0.08,relheight=0.05,relwidth=0.35)
 
                cedula_label=Label(contenedor2 ,text="Cedula",bd=2,relief=SUNKEN,bg="light gray")
                cedula_label.place(relx=0.05,rely=0.16,relheight=0.05,relwidth=0.15)
                cedula_entry=Entry(contenedor2,textvariable=cedula)
                cedula_entry.insert(0,empleado.getCedula())
                cedula_entry.place(relx=0.22,rely=0.16,relheight=0.05,relwidth=0.35)

                telefono_label=Label(contenedor2 ,text="Telefono",bd=2,relief=SUNKEN,bg="light gray")
                telefono_label.place(relx=0.05,rely=0.24,relheight=0.05,relwidth=0.15)
                telefono_entry=Entry(contenedor2,textvariable=telefono)
                telefono_entry.insert(0,empleado.getTelefono())
                telefono_entry.place(relx=0.22,rely=0.24,relheight=0.05,relwidth=0.35)

                direccion_label=Label(contenedor2 ,text="Direccion",bd=2,relief=SUNKEN,bg="light gray")
                direccion_label.place(relx=0.05,rely=0.32,relheight=0.05,relwidth=0.15)
                direccion_entry=Entry(contenedor2,textvariable=direccion)
                direccion_entry.insert(0,empleado.getDireccion())
                direccion_entry.place(relx=0.22,rely=0.32,relheight=0.05,relwidth=0.35)

                cargo_label=Label(contenedor2 ,text="Cargo",bd=2,relief=SUNKEN,bg="light gray")
                cargo_label.place(relx=0.05,rely=0.4,relheight=0.05,relwidth=0.15)
                cargo_entry=Entry(contenedor2,textvariable=cargo)
                cargo_entry.insert(0,empleado.getCargo())
                cargo_entry.place(relx=0.22,rely=0.4,relheight=0.05,relwidth=0.35)

                sueldo_label=Label(contenedor2 ,text="Sueldo",bd=2,relief=SUNKEN,bg="light gray")
                sueldo_label.place(relx=0.05,rely=0.48,relheight=0.05,relwidth=0.15)
                sueldo_entry=Entry(contenedor2,textvariable=sueldo)
                sueldo_entry.insert(0,empleado.getSueldo())
                sueldo_entry.place(relx=0.22,rely=0.48,relheight=0.05,relwidth=0.35)

                def edit(empleado):
                    
                   lista.delete(0,END)
                   #print(nombre_entry.get())
                   name=nombre_entry.get()
                   cc=cedula_entry.get()
                   tel=telefono_entry.get()
                   dir=direccion_entry.get()
                   carg=cargo_entry.get()
                   suel=sueldo_entry.get()

                   empleado.setNombre(name)
                   empleado.setCedula(cc)
                   empleado.setTelefono(tel)
                   empleado.setDireccion(dir)
                   empleado.setCargo(carg)
                   empleado.setSueldo(suel)

                   lista.insert(END,('¡Empleado editado con exito!'))
                   lista.insert(END,('Nombre: ',name))
                   lista.insert(END,('Cedula: ',cc))
                   lista.insert(END,('Telefono: ',tel))
                   lista.insert(END,('Direccion: ',dir))
                   lista.insert(END,('Cargo: ',carg))
                   lista.insert(END,('Sueldo: ',suel))
                
                   nombre_entry.delete(0,END)
                   cedula_entry.delete(0,END)
                   telefono_entry.delete(0,END)
                   direccion_entry.delete(0,END)
                   cargo_entry.delete(0,END)
                   sueldo_entry.delete(0,END)

                btncrear=Button(contenedor2,width=20 ,bd=2,relief=SUNKEN,text="Editar",bg="light gray",command=lambda:edit(empleado))
                btncrear.place(relx=0.1,rely=0.7,relheight=0.05,relwidth=0.25)   
   
            btneditar=Button(contenedor2,width=20 ,bd=2,relief=SUNKEN,text="Editar",bg="light gray",command=lambda:comprobarCedula(cedula_entry.get()))
            btneditar.place(relx=0.1,rely=0.3,relheight=0.05,relwidth=0.25)

        btn1=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Registrar Empleado",bg="light gray",command=registro)
        btn1.grid(row=0,column=0)
        btn2=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Ver Empleados",bg="light gray",command=verEmpleados)
        btn2.grid(row=0,column=1)
        btn3=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Eliminar Empleado",bg="light gray",command=elimEmpleado)
        btn3.grid(row=0,column=2)
        btn4=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Editar Empleado",bg="light gray",command=editEmpleado)
        btn4.grid(row=0,column=3)



    #En esta seccion va todo lo relacionado con el menu de la materia prima y sus funciones
    def maPrima():
        contenedor1=Frame(ventanaMenu,bd=2,relief=SUNKEN)
        contenedor1.place(relx=0.01,rely=0.01,relheight=0.97,relwidth=0.97)

        Barra=Frame(contenedor1,bg="gray" ,bd=2,relief=SUNKEN)
        Barra.place(relheight=0.07,relwidth=1)

        def registro():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="red")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def verMaPrima():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="yellow")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def eliMaPrima():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="white")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def editMaPrima():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="black")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        btn1=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Registrar Materia Prima",bg="light gray",command=registro)
        btn1.grid(row=0,column=0)
        btn2=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Ver Materia Prima",bg="light gray",command=verMaPrima)
        btn2.grid(row=0,column=1)
        btn3=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Eliminar Materia Prima",bg="light gray",command=eliMaPrima)
        btn3.grid(row=0,column=2)
        btn4=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Editar Materia Prima",bg="light gray",command=editMaPrima)
        btn4.grid(row=0,column=3)


    
    #En esta seccion va todo lo relacionado con el menu catalogo y sus funciones
    def catalogo():
        contenedor1=Frame(ventanaMenu,bd=2,relief=SUNKEN)
        contenedor1.place(relx=0.01,rely=0.01,relheight=0.97,relwidth=0.97)

        Barra=Frame(contenedor1,bg="gray" ,bd=2,relief=SUNKEN)
        Barra.place(relheight=0.07,relwidth=1)

        def registrar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="red")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def ver():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="yellow")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def eliminar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="white")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        def editar():
            contenedor2=Frame(contenedor1,bd=2,relief=SUNKEN,bg="black")
            contenedor2.place(rely=0.07,relheight=0.97,relwidth=1)

        btn1=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Registrar Catalogo",bg="light gray",command=registrar)
        btn1.grid(row=0,column=0)
        btn2=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Ver Catalogo",bg="light gray",command=ver)
        btn2.grid(row=0,column=1)
        btn3=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Eliminar Catalogo",bg="light gray",command=eliminar)
        btn3.grid(row=0,column=2)
        btn4=Button(Barra,width=20 ,bd=2,relief=SUNKEN,text="Editar Catalogo",bg="light gray",command=editar)
        btn4.grid(row=0,column=3)



    #En esta seccion va la informacion acerca de que hace el programa 
    def aplicacion():
        contenedor1=Frame(ventanaMenu,bg="gray" ,bd=2,relief=SUNKEN)
        contenedor1.place(relx=0.01,rely=0.01,relheight=0.97,relwidth=0.97)

        



    #Barra del menu-----------------------------------------
    barraMenu=Menu(ventanaMenu)
    mnuArchivo=Menu(barraMenu)
    mnuArchivo.add_command(label='Aplicacion',command=aplicacion)
    mnuArchivo.add_command(label='Salir',command=salir)
    barraMenu.add_cascade(label='Archivo',menu=mnuArchivo)
    mnuProc=Menu(barraMenu)
    mnuProc.add_command(label='Cliente',command=cliente)
    mnuProc.add_command(label='Reserva',command=reserva)
    mnuProc.add_command(label='Mesa',command=mesa)
    mnuProc.add_command(label='Pedido',command=pedido)
    mnuProc.add_command(label='Empleado',command=empleado)
    mnuProc.add_command(label='Materia Prima',command=maPrima)
    mnuProc.add_command(label='Catalogo',command=catalogo)
    mnuAyu=Menu(barraMenu)
    mnuAyu.add_cascade(label='Acerca de',command=ayuda)
    barraMenu.add_cascade(label='Procesos y Consultas',menu=mnuProc)
    barraMenu.add_cascade(label='Ayuda',menu=mnuAyu)

    ventanaMenu.config(menu=barraMenu)
    #-------------------------------------------------------


    




#----------------------------------------------------------




#contenedor inicio ----------------------------------
contenedor1=Frame(ventana, height=430 ,bg="sky Blue" , width=270,bd=2,relief=SUNKEN)
contenedor1.pack(fill="both",expand="True", padx=15,pady=30, side=LEFT )

bienvenida1="¡Bienvenido al sistema Poopina!"
bienvenida2="Nos encanta tenerte aqui,con nuestra ayuda puedes administrar tu restaurante con facilidad."

contenedorBienvenida=Frame(contenedor1, height=80 , width=250,bd=2,bg="Light Blue" , relief=SUNKEN)
contenedorBienvenida.pack(fill="both",expand="True",padx=4,pady=4,side=TOP)

mensaje1=Message(contenedorBienvenida,text=bienvenida1,width=300,bg="Light Blue" ,fg="black",font="Elephant")
mensaje1.pack(fill="both",expand="True")
mensaje2=Message(contenedorBienvenida,text=bienvenida2,width=300,bg="Light Blue" ,fg="black",font="Arial")
mensaje2.pack(fill="both",expand="True")

contenedorInicio=Frame(contenedor1, height=330 , bg="Light Blue",width=250,bd=2,relief=SUNKEN)
contenedorInicio.pack(fill="both",padx=4,pady=4,expand="True")


imgH=tk.PhotoImage(file="huevos.png")
img1=Label(contenedorInicio,image=imgH, bg="Light Blue")
img1.place(relx=0.01,rely=0.01,relheight=0.28,relwidth=0.3)



imgS=tk.PhotoImage(file="sushi.png")
img2=Label(contenedorInicio,image=imgS, bg="Light Blue")
img2.place(relx=0.33,y=0.25,relheight=0.25,relwidth=0.35)
#img2.place(x=13,y=10,height=100,width=100)

imgA=tk.PhotoImage(file="arepa.png")
img3=Label(contenedorInicio,image=imgA, bg="Light Blue")
img3.place(relx=0.7,rely=0.01,relheight=0.31,relwidth=0.31)

imgP=tk.PhotoImage(file="pollo.png")
img4=Label(contenedorInicio,image=imgP, bg="Light Blue")
img4.place(relx=0.20,rely=0.35,relheight=0.29,relwidth=0.31)

imgB=tk.PhotoImage(file="burguer.png")
img5=Label(contenedorInicio,image=imgB, bg="Light Blue")
img5.place(relx=0.57,rely=0.35,relheight=0.29,relwidth=0.27)

#imgH=tk.PhotoImage(file="huevos.png")
#img1=Label(contenedorInicio,image=imgH, bg="Light Blue")
#img1.place(x=113,y=10,height=100,width=100)
#
#imgS=tk.PhotoImage(file="sushi.png")
#img2=Label(contenedorInicio,image=imgS, bg="Light Blue")
#img2.place(relx=0.013,y=0.010,relheight=1,relwidth=1)
##img2.place(x=13,y=10,height=100,width=100)
#
#imgA=tk.PhotoImage(file="arepa.png")
#img3=Label(contenedorInicio,image=imgA, bg="Light Blue")
#img3.place(x=213,y=10,height=100,width=100)
#
#imgP=tk.PhotoImage(file="pollo.png")
#img4=Label(contenedorInicio,image=imgP, bg="Light Blue")
#img4.place(x=53,y=90,height=90,width=100)

#imgB=tk.PhotoImage(file="burguer.png")
#img5=Label(contenedorInicio,image=imgB, bg="Light Blue")
#img5.place(x=173,y=93,height=80,width=80)



btnIniciar=Button(contenedorInicio,text="Iniciar",bg="sky Blue",command=menu)
btnIniciar.place(relx=0.41,rely=0.75,relheight=0.1,relwidth=0.2)
#----------------------------------------------------------

#label2=Label(contenedorFotos,bd=2,relief=SUNKEN,text="img 2",bg="gray")
#label2.place(relx=0.03,rely=0.5,relheight=0.45,relwidth=0.45)
#label3=Label(contenedorFotos,bd=2,relief=SUNKEN,text="img 3",bg="gray")
#label3.place(relx=0.5,rely=0.03,relheight=0.45,relwidth=0.45)
#label4=Label(contenedorFotos,bd=2,relief=SUNKEN,text="img 4",bg="gray")
#label4.place(relx=0.5,rely=0.5,relheight=0.45,relwidth=0.45)

#contenedor hoja de vida ----------------------------------

imghv20cpy=tk.PhotoImage(file="HV20.gif")
imghv21cpy=tk.PhotoImage(file="HV21.gif")
imghv22cpy=tk.PhotoImage(file="HV22.gif")
imghv23cpy=tk.PhotoImage(file="HV23.gif")
def HV2():
    msgHV2="Omar Enrique Chávez Fonseca, de 23 años, es estudiante de la universidad nacional de Colombia\n  y la plataforma Platzi.  En las cuales estudia Ingeniería de sistemas e informática\n  además de Desarrollo Backend con Python y Django respectivamente. \n Cuenta con conocimientos en lenguajes como Python, Java, C++."
    btnHV=Button(contenedor2, bg="Light blue",text=msgHV2,command=HV2,height=5,width=90)
    btnHV.place(relheight=0.25,relwidth=1)
    mensaje=Button(btnHV,text=msgHV2,width=500 ,height=100,bg="Light blue" ,fg="black",command=HV3)
    mensaje.pack()
    #btnHV=Button(contenedor2,text="Hoja de vida 2",command=HV3, bg="Light Blue")
    #btnHV.place(relx=0.01,rely=0.01,relheight=0.2,relwidth=0.98)

    label1=Label(contenedorFotos,height=11, width=36,bd=2,relief=SUNKEN,text="img 2.1",bg="gray")
    label1.grid(row=0,column=0)
    imgHV20=Label(label1,image=imghv20cpy,bg="gray")
    imgHV20.place(relheight=1,relwidth=1)

    label2=Label(contenedorFotos,height=11 , width=36,bd=2,relief=SUNKEN,text="img 2.2",bg="gray")
    label2.grid(row=0,column=1)
    imgHV21=Label(label2,image=imghv21cpy,bg="gray")
    imgHV21.place(relheight=1,relwidth=1)

    label3=Label(contenedorFotos,height=11 , width=36,bd=2,relief=SUNKEN,text="img 2.3",bg="gray")
    label3.grid(row=1,column=0)
    imgHV22=Label(label3,image=imghv22cpy,bg="gray")
    imgHV22.place(relheight=1,relwidth=1)

    label4=Label(contenedorFotos,height=11, width=36,bd=2,relief=SUNKEN,text="img 2.4",bg="gray")
    label4.grid(row=1,column=1)
    imgHV23=Label(label4,image=imghv23cpy,bg="gray")
    imgHV23.place(relheight=1,relwidth=1)
    
imghv30cpy=tk.PhotoImage(file="HV30.gif")
imghv31cpy=tk.PhotoImage(file="HV31.gif")
imghv32cpy=tk.PhotoImage(file="HV32.gif")
imghv33cpy=tk.PhotoImage(file="HV33.gif")
def HV3():
    msgHV3="Keder Julian Madera Polo Estudiante de pregrado del programa ingeniería \n de sistemas e informática de la UNAL cuenta con el conocimiento de \n lenguajes de programación como visual Basic, java, Python y c++, además de \n certificados en seguridad informática básica impartidos en platzi."
    btnHV=Button(contenedor2, bg="Light blue",text=msgHV3,command=HV2,height=5,width=90)
    btnHV.place(relheight=0.25,relwidth=1)
    mensaje=Button(btnHV,text=msgHV3,width=500 ,height=100,bg="Light blue" ,fg="black",command=HV1)
    mensaje.pack()

    label1=Label(contenedorFotos,height=11, width=36,bd=2,relief=SUNKEN,text="img 3.1",bg="gray")
    label1.grid(row=0,column=0)
    imgHV30=Label(label1,image=imghv30cpy,bg="gray")
    imgHV30.place(relheight=1,relwidth=1)

    label2=Label(contenedorFotos,height=11 , width=36,bd=2,relief=SUNKEN,text="img 3.2",bg="gray")
    label2.grid(row=0,column=1)
    imgHV31=Label(label2,image=imghv31cpy,bg="gray")
    imgHV31.place(relheight=1,relwidth=1)

    label3=Label(contenedorFotos,height=11 , width=36,bd=2,relief=SUNKEN,text="img 3.3",bg="gray")
    label3.grid(row=1,column=0)
    imgHV32=Label(label3,image=imghv32cpy,bg="gray")
    imgHV32.place(relheight=1,relwidth=1)

    label4=Label(contenedorFotos,height=11, width=36,bd=2,relief=SUNKEN,text="img 3.4",bg="gray")
    label4.grid(row=1,column=1)
    imgHV33=Label(label4,image=imghv33cpy,bg="gray")
    imgHV33.place(relheight=1,relwidth=1)



imghv10cpy=tk.PhotoImage(file="HV10.gif")
imghv11cpy=tk.PhotoImage(file="HV11.gif")
imghv12cpy=tk.PhotoImage(file="HV12.gif")
imghv13cpy=tk.PhotoImage(file="HV13.gif")
def HV1():
    msgHV1="Edgar Alexis Garcia Camuan,20 años,Estudiante de pregrado del programa \n en Ing.Sistemas e informatica en la UNAL. Cuento con un certificado \n hecho en asociacion de MINTIC y la UNAB en aplicaciones moviles \n donde tomé experiencia en Java,Javascript,css y php."
    btnHV=Button(contenedor2, bg="Light blue",text=msgHV1,command=HV2,height=5,width=90)
    btnHV.place(relheight=0.25,relwidth=1)
    mensaje=Button(btnHV,text=msgHV1,width=500 ,height=100,bg="Light blue" ,fg="black",command=HV2)
    mensaje.pack()
    #btnHV.place(relx=0.01,rely=0.01,relheight=0.2,relwidth=0.98)
    #labelHV=Button(contenedor,height=3, width=100,text=msgHV1,bg="Light blue",command=HV2)
    #labelHV.place(relx=0.01,rely=0.01,relheight=0.98,relwidth=0.98)
    #mensaje1=Message(btnHV,text=msgHV1,width=40 ,fg="black",font="Arial")
    label1=Label(contenedorFotos,height=11, width=36,bd=2,relief=SUNKEN,bg="gray")
    label1.grid(row=0,column=0)
    imgHV1=Label(label1,image=imghv10cpy,bg="gray")
    imgHV1.place(relheight=1,relwidth=1)

    label2=Label(contenedorFotos,height=11 , width=36,bd=2,relief=SUNKEN,text="img 2",bg="gray")
    label2.grid(row=0,column=1)
    imgHV2=Label(label2,image=imghv11cpy,bg="gray")
    imgHV2.place(relheight=1,relwidth=1)

    label3=Label(contenedorFotos,height=11 , width=36,bd=2,relief=SUNKEN,text="img 3",bg="gray")
    label3.grid(row=1,column=0)
    imgHV3=Label(label3,image=imghv12cpy,bg="gray")
    imgHV3.place(relheight=1,relwidth=1)

    label4=Label(contenedorFotos,height=11, width=36,bd=2,relief=SUNKEN,text="img 4",bg="gray")
    label4.grid(row=1,column=1)
    imgHV4=Label(label4,image=imghv13cpy,bg="gray")
    imgHV4.place(relheight=1,relwidth=1)

    

contenedor2=Frame(ventana, height=430 , width=270,bg="sky Blue" ,bd=2,relief=SUNKEN)
contenedor2.pack(fill="both",expand="True",padx=15,pady=30, side=LEFT)

contenedorHV=Frame(contenedor2, height=80 ,bg="Light Blue", width=250,bd=2,relief=SUNKEN)
contenedorHV.pack(fill="both",expand="True",padx=2,pady=2,side=TOP)

contenedorFotos=Frame(contenedor2, height=330 ,bg="sky Blue",width=250,bd=1,relief=SUNKEN)
contenedorFotos.pack(fill="both",expand="True",padx=4,pady=4)


label1=Label(contenedorFotos,height=11, width=36,bd=2,relief=SUNKEN,text="img 1",bg="gray")
label1.grid(row=0,column=0)
imghv1=tk.PhotoImage(file="HV10.gif")
imgHV1=Label(label1,image=imghv1,bg="gray")
imgHV1.place(relheight=1,relwidth=1)

label2=Label(contenedorFotos,height=11 , width=36,bd=2,relief=SUNKEN,text="img 2",bg="gray")
label2.grid(row=0,column=1)
imghv2=tk.PhotoImage(file="HV11.gif")
imgHV2=Label(label2,image=imghv2,bg="gray")
imgHV2.place(relheight=1,relwidth=1)

label3=Label(contenedorFotos,height=11 , width=36,bd=2,relief=SUNKEN,text="img 3",bg="gray")
label3.grid(row=1,column=0)
imghv3=tk.PhotoImage(file="HV12.gif")
imgHV3=Label(label3,image=imghv3,bg="gray")
imgHV3.place(relheight=1,relwidth=1)

label4=Label(contenedorFotos,height=11, width=36,bd=2,relief=SUNKEN,text="img 4",bg="gray")
label4.grid(row=1,column=1)
imghv4=tk.PhotoImage(file="HV13.gif")
imgHV4=Label(label4,image=imghv4,bg="gray")
imgHV4.place(relheight=1,relwidth=1)

#btnHV=Button(contenedor2,height=5 ,width=40,text="HVVVV",bg="gray")

btnHV=Button(contenedor2,text="Hoja de vida 1",command=HV2, bg="Light Blue")
btnHV.place(relx=0.01,rely=0.01,relheight=0.2,relwidth=0.98)

msgHV="Edgar Alexis Garcia Camuan,20 años,Estudiante de pregrado del programa \n en Ing.Sistemas e informatica en la UNAL. Cuento con un certificado \n hecho en asociacion de MINTIC y la UNAB en aplicaciones moviles \n donde tomé experiencia en Java,Javascript,css y php."
btnHV=Button(contenedor2, bg="Light blue",text=msgHV,command=HV2,height=5,width=90)
btnHV.place(relheight=0.25,relwidth=1)
mensaje=Button(btnHV,text=msgHV,width=500 ,height=100,bg="Light blue" ,fg="black",command=HV2)
mensaje.pack()




#----------------------------------------------------------------------





Mesa.ingreso_datos()

ventana.mainloop() 
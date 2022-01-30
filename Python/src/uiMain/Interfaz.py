from doctest import master
from email import message
from lib2to3.pgen2.token import LEFTSHIFT
from textwrap import fill
from tkinter import *
import tkinter as tk
from turtle import bgcolor, right

#se crea la ventana de inicio
ventana = tk.Tk()
ventana.title("Inicio") #el titulo de la ventana
ventana.geometry("700x460") #las dimensiones

#botones salir y descripcion---------
btnSalir=Button(ventana,height=1,width=10,text="Salir",bg="gray",command=ventana.destroy)
btnSalir.place(x=600,y=431)

#ventana descripcion--------------------------------------
def Descripcion():
    ventanaDescp=Toplevel()
    ventanaDescp.geometry("300x400")
    ventanaDescp.title("Descripcion")
    bienvenida1="¡Bienvenido al sistema Poopina!"
    bienvenida2="Nos encanta tenerte aqui,con nuestra ayuda puedes administrar tu restaurante con facilidad."

    contenedorDescp=Frame(ventanaDescp, height=250 , width=350,bd=2,bg="Light Blue" , relief=SUNKEN)
    contenedorDescp.pack(fill="both",expand="True",padx=4,pady=4,side=TOP)

#----------------------------------------------------------
#boton descripcion
btnDesc=Button(ventana,height=1,width=10,text="Descripcion",bg="gray",command=Descripcion)
btnDesc.place(x=500,y=431)

#---------------------------------------------------


#ventana menu ---------------------------------------------
def menu():
    ventanaMenu=Toplevel()
    ventanaMenu.geometry("900x500")
    ventanaMenu.title("POOPINA")
    

    




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
img1.place(x=113,y=10,height=100,width=100)

imgS=tk.PhotoImage(file="sushi.png")
img2=Label(contenedorInicio,image=imgS, bg="Light Blue")
img2.place(x=13,y=10,height=100,width=100)

imgA=tk.PhotoImage(file="arepa.png")
img3=Label(contenedorInicio,image=imgA, bg="Light Blue")
img3.place(x=213,y=10,height=100,width=100)

imgP=tk.PhotoImage(file="pollo.png")
img4=Label(contenedorInicio,image=imgP, bg="Light Blue")
img4.place(x=53,y=90,height=90,width=100)

imgB=tk.PhotoImage(file="burguer.png")
img5=Label(contenedorInicio,image=imgB, bg="Light Blue")
img5.place(x=173,y=93,height=80,width=80)

btnIniciar=Button(contenedorInicio, height=1,width=7,text="Iniciar",bg="sky Blue",command=menu)
btnIniciar.place(x=130,y=200)
#----------------------------------------------------------

#label2=Label(contenedorFotos,bd=2,relief=SUNKEN,text="img 2",bg="gray")
#label2.place(relx=0.03,rely=0.5,relheight=0.45,relwidth=0.45)
#label3=Label(contenedorFotos,bd=2,relief=SUNKEN,text="img 3",bg="gray")
#label3.place(relx=0.5,rely=0.03,relheight=0.45,relwidth=0.45)
#label4=Label(contenedorFotos,bd=2,relief=SUNKEN,text="img 4",bg="gray")
#label4.place(relx=0.5,rely=0.5,relheight=0.45,relwidth=0.45)

#contenedor hoja de vida ----------------------------------


def HV2():
    btnHV=Button(contenedor2,text="Hoja de vida 2",command=HV3)
    btnHV.place(relx=0.01,rely=0.01,relheight=0.2,relwidth=0.98)

    label1=Label(contenedorFotos,height=10, width=17,bd=2,relief=SUNKEN,text="img 2.1",bg="gray")
    label1.grid(row=0,column=0)
    label2=Label(contenedorFotos,height=10 , width=17,bd=2,relief=SUNKEN,text="img 2.2",bg="gray")
    label2.grid(row=0,column=1)
    label3=Label(contenedorFotos,height=10 , width=17,bd=2,relief=SUNKEN,text="img 2.3",bg="gray")
    label3.grid(row=1,column=0)
    label4=Label(contenedorFotos,height=10, width=17,bd=2,relief=SUNKEN,text="img 2.4",bg="gray")
    label4.grid(row=1,column=1)

def HV3():
    btnHV=Button(contenedor2,text="Hoja de vida 3",command=HV4)
    btnHV.place(relx=0.01,rely=0.01,relheight=0.2,relwidth=0.98)

    label1=Label(contenedorFotos,height=10, width=17,bd=2,relief=SUNKEN,text="img 3.1",bg="gray")
    label1.grid(row=0,column=0)
    label2=Label(contenedorFotos,height=10 , width=17,bd=2,relief=SUNKEN,text="img 3.2",bg="gray")
    label2.grid(row=0,column=1)
    label3=Label(contenedorFotos,height=10 , width=17,bd=2,relief=SUNKEN,text="img 3.3",bg="gray")
    label3.grid(row=1,column=0)
    label4=Label(contenedorFotos,height=10, width=17,bd=2,relief=SUNKEN,text="img 3.4",bg="gray")
    label4.grid(row=1,column=1)

def HV4():
    btnHV=Button(contenedor2,text="Hoja de vida 4",command=HV1)
    btnHV.place(relx=0.01,rely=0.01,relheight=0.2,relwidth=0.98)

    label1=Label(contenedorFotos,height=10, width=17,bd=2,relief=SUNKEN,text="img 4.1",bg="gray")
    label1.grid(row=0,column=0)
    label2=Label(contenedorFotos,height=10 , width=17,bd=2,relief=SUNKEN,text="img 4.2",bg="gray")
    label2.grid(row=0,column=1)
    label3=Label(contenedorFotos,height=10 , width=17,bd=2,relief=SUNKEN,text="img 4.3",bg="gray")
    label3.grid(row=1,column=0)
    label4=Label(contenedorFotos,height=10, width=17,bd=2,relief=SUNKEN,text="img 4.4",bg="gray")
    label4.grid(row=1,column=1)

def HV1():
    btnHV=Button(contenedor2,text="Hoja de vida 1",command=HV2)
    btnHV.place(relx=0.01,rely=0.01,relheight=0.2,relwidth=0.98)

    label1=Label(contenedorFotos,height=10, width=17,bd=2,relief=SUNKEN,text="img 1.1",bg="gray")
    label1.grid(row=0,column=0)
    label2=Label(contenedorFotos,height=10 , width=17,bd=2,relief=SUNKEN,text="img 1.2",bg="gray")
    label2.grid(row=0,column=1)
    label3=Label(contenedorFotos,height=10 , width=17,bd=2,relief=SUNKEN,text="img 1.3",bg="gray")
    label3.grid(row=1,column=0)
    label4=Label(contenedorFotos,height=10, width=17,bd=2,relief=SUNKEN,text="img 1.4",bg="gray")
    label4.grid(row=1,column=1)

contenedor2=Frame(ventana, height=430 , width=270,bd=2,relief=SUNKEN)
contenedor2.pack(fill="both",expand="True",padx=15,pady=30, side=LEFT)

contenedorHV=Frame(contenedor2, height=80 , width=250,bd=2,relief=SUNKEN)
contenedorHV.pack(fill="both",expand="True",padx=2,pady=2,side=TOP)

contenedorFotos=Frame(contenedor2, height=330 , width=250,bd=1,relief=SUNKEN)
contenedorFotos.pack(fill="both",expand="True",padx=4,pady=4)

label1=Label(contenedorFotos,height=10, width=17,bd=2,relief=SUNKEN,text="img 1",bg="gray")
label1.grid(row=0,column=0)
label2=Label(contenedorFotos,height=10 , width=17,bd=2,relief=SUNKEN,text="img 2",bg="gray")
label2.grid(row=0,column=1)
label3=Label(contenedorFotos,height=10 , width=17,bd=2,relief=SUNKEN,text="img 3",bg="gray")
label3.grid(row=1,column=0)
label4=Label(contenedorFotos,height=10, width=17,bd=2,relief=SUNKEN,text="img 4",bg="gray")
label4.grid(row=1,column=1)

#btnHV=Button(contenedor2,height=5 ,width=40,text="HVVVV",bg="gray")

btnHV=Button(contenedor2,text="Hoja de vida 1",command=HV2)
btnHV.place(relx=0.01,rely=0.01,relheight=0.2,relwidth=0.98)




#----------------------------------------------------------------------







ventana.mainloop() 
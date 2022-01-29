from doctest import master
from lib2to3.pgen2.token import LEFTSHIFT
from textwrap import fill
from tkinter import *
import tkinter
from turtle import right

ventana = Tk()
ventana.title("Inicio")
ventana.geometry("600x450")
contenedor1=Frame(ventana, height=430 , width=270,bd=2,relief=SUNKEN)
contenedor1.pack(fill="both",expand="True", padx=10,pady=10, side=LEFT )


#label1=Label(contenedor1,text="Bienvenido al sistema del restaurante Poopina")
#label1.pack()

contenedor2=Frame(ventana, height=430 , width=270,bd=2,relief=SUNKEN)
contenedor2.pack(fill="both",expand="True",padx=10,pady=10, side=LEFT,)

contenedorHV=Frame(contenedor2, height=80 , width=250,bd=1,relief=SUNKEN)
contenedorHV.pack(fill="both",expand="True",padx=4,pady=4,side=TOP)

contenedorFotos=Frame(contenedor2, height=330 , width=250,bd=1,relief=SUNKEN)
contenedorFotos.pack(fill="both",expand="True",padx=4,pady=4)
#labelHV=Label(contenedor2,text="hoja de vida")
#labelHV.pack()

label1=Label(contenedorFotos,height=10, width=17,bd=2,relief=SUNKEN,text="img 1",bg="gray")
label1.grid(row=0,column=0)
label2=Label(contenedorFotos,height=10 , width=17,bd=2,relief=SUNKEN,text="img 2",bg="gray")
label2.grid(row=0,column=1)
label3=Label(contenedorFotos,height=10 , width=17,bd=2,relief=SUNKEN,text="img 3",bg="gray")
label3.grid(row=1,column=0)
label4=Label(contenedorFotos,height=10, width=17,bd=2,relief=SUNKEN,text="img 4",bg="gray")
label4.grid(row=1,column=1)


#label1=Label(contenedorFotos,bd=2,relief=SUNKEN,text="img 1",bg="gray")
#label1.grid(relx=0.03,rely=0.03,relheight=0.45,relwidth=0.45)
#label2=Label(contenedorFotos,bd=2,relief=SUNKEN,text="img 2",bg="gray")
#label2.place(relx=0.03,rely=0.5,relheight=0.45,relwidth=0.45)
#label3=Label(contenedorFotos,bd=2,relief=SUNKEN,text="img 3",bg="gray")
#label3.place(relx=0.5,rely=0.03,relheight=0.45,relwidth=0.45)
#label4=Label(contenedorFotos,bd=2,relief=SUNKEN,text="img 4",bg="gray")
#label4.place(relx=0.5,rely=0.5,relheight=0.45,relwidth=0.45)



ventana.mainloop() 
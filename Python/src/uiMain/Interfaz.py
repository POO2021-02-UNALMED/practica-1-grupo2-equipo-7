from cProfile import label
from cgitb import text
from doctest import master
from email import message
from lib2to3.pgen2.token import LEFTSHIFT
from textwrap import fill
from tkinter import *
import tkinter as tk
from tkinter.messagebox import showinfo
from turtle import bgcolor, right

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
    

    contenedorDescp=Frame(ventanaDescp, height=250 , width=350,bd=2, bg="Light Blue" , relief=SUNKEN)
    contenedorDescp.pack(fill="both",expand="True",padx=4,pady=4,side=TOP)

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
    contenedor=Frame(ventanaMenu,height=495,width=895,bg="gray" ,bd=2,relief=SUNKEN)
    contenedor.place(x=2,y=2)

    def salir():
        ventanaMenu.destroy()
        ventana.mainloop()
        

    #Mensaje sobre los desarrolladores
    def ayuda():
        showinfo(title="Desarrolladores" ,message=" Edgar Alexis Garcia Camuan \n Omar Enrique Chavez Fonseca \n Keder Julian Madera Polo") 

    def cliente():
        contenedor1=Frame(ventanaMenu,height=495,width=895,bg="blue" ,bd=2,relief=SUNKEN)
        contenedor1.place(x=2,y=2)

    def reserva():
        contenedor1=Frame(ventanaMenu,height=495,width=895,bg="red" ,bd=2,relief=SUNKEN)
        contenedor1.place(x=2,y=2)

    def mesa():
        contenedor1=Frame(ventanaMenu,height=495,width=895,bg="green" ,bd=2,relief=SUNKEN)
        contenedor1.place(x=2,y=2)

    def pedido():
        contenedor1=Frame(ventanaMenu,height=495,width=895,bg="white" ,bd=2,relief=SUNKEN)
        contenedor1.place(x=2,y=2)

    def empleado():
        contenedor1=Frame(ventanaMenu,height=495,width=895,bg="black" ,bd=2,relief=SUNKEN)
        contenedor1.place(x=2,y=2)

    def maPrima():
        contenedor1=Frame(ventanaMenu,height=495,width=895,bg="yellow" ,bd=2,relief=SUNKEN)
        contenedor1.place(x=2,y=2)

    def catalogo():
        contenedor1=Frame(ventanaMenu,height=495,width=895,bg="sky blue" ,bd=2,relief=SUNKEN)
        contenedor1.place(x=2,y=2)

    def aplicacion():
        contenedor1=Frame(ventanaMenu,height=495,width=895,bg="gray" ,bd=2,relief=SUNKEN)
        contenedor1.place(x=2,y=2)
        contenedor2=Frame(contenedor1,bg="gray")
        contenedor2.place(x=250,y=100)
        msgDes="Aplicacion"
        msgDes1="¬ "
        msgDes2="¬ "
        msgDes3="¬ "
        msgDes4="¬ "
        mensaje=Message(contenedor2,text=msgDes,width=500 ,bg="gray" ,fg="black",font="Elephant 20")
        mensaje.pack()
        mensaje1=Message(contenedor2,text=msgDes1,width=500,bg="gray" ,fg="black",font="Arial 20")
        mensaje1.pack()
        mensaje2=Message(contenedor2,text=msgDes2,width=500 ,bg="gray" ,fg="black",font="Arial 20")
        mensaje2.pack()
        mensaje3=Message(contenedor2,text=msgDes3,width=500 ,bg="gray" ,fg="black",font="Arial 20")
        mensaje3.pack()
        mensaje4=Message(contenedor2,text=msgDes4,width=500 ,bg="gray" ,fg="black",font="Arial 20")
        mensaje4.pack()
        
      

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

#imgH=tk.PhotoImage(file="huevos.png")
#img1=Label(contenedorInicio,image=imgH, bg="Light Blue")
#img1.place(x=113,y=10,height=100,width=100)

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


def HV2():
    msgHV2="Edgar Alexis Garcia Camuan,20 años,Estudiante de pregrado del programa \n en Ing.Sistemas e informatica en la UNAL. Cuento con un certificado \n hecho en asociacion de MINTIC y la UNAB en aplicaciones moviles \n donde tomé experiencia en Java,Javascript,css y php."
    btnHV=Button(contenedor2, bg="Light blue",text=msgHV2,command=HV2,height=5,width=90)
    btnHV.place(relheight=0.25,relwidth=1)
    mensaje=Button(btnHV,text=msgHV2,width=500 ,height=100,bg="Light blue" ,fg="black",command=HV3)
    mensaje.pack()
    #btnHV=Button(contenedor2,text="Hoja de vida 2",command=HV3, bg="Light Blue")
    #btnHV.place(relx=0.01,rely=0.01,relheight=0.2,relwidth=0.98)

    label1=Label(contenedorFotos,height=11, width=36,bd=2,relief=SUNKEN,text="img 2.1",bg="gray")
    label1.grid(row=0,column=0)
    label2=Label(contenedorFotos,height=11 , width=36,bd=2,relief=SUNKEN,text="img 2.2",bg="gray")
    label2.grid(row=0,column=1)
    label3=Label(contenedorFotos,height=11 , width=36,bd=2,relief=SUNKEN,text="img 2.3",bg="gray")
    label3.grid(row=1,column=0)
    label4=Label(contenedorFotos,height=11, width=36,bd=2,relief=SUNKEN,text="img 2.4",bg="gray")
    label4.grid(row=1,column=1)

def HV3():
    msgHV3="Edgar Alexis Garcia Camuan,20 años,Estudiante de pregrado del programa \n en Ing.Sistemas e informatica en la UNAL. Cuento con un certificado \n hecho en asociacion de MINTIC y la UNAB en aplicaciones moviles \n donde tomé experiencia en Java,Javascript,css y php."
    btnHV=Button(contenedor2, bg="Light blue",text=msgHV3,command=HV2,height=5,width=90)
    btnHV.place(relheight=0.25,relwidth=1)
    mensaje=Button(btnHV,text=msgHV3,width=500 ,height=100,bg="Light blue" ,fg="black",command=HV1)
    mensaje.pack()

    label1=Label(contenedorFotos,height=11, width=36,bd=2,relief=SUNKEN,text="img 3.1",bg="gray")
    label1.grid(row=0,column=0)
    label2=Label(contenedorFotos,height=11 , width=36,bd=2,relief=SUNKEN,text="img 3.2",bg="gray")
    label2.grid(row=0,column=1)
    label3=Label(contenedorFotos,height=11 , width=36,bd=2,relief=SUNKEN,text="img 3.3",bg="gray")
    label3.grid(row=1,column=0)
    label4=Label(contenedorFotos,height=11, width=36,bd=2,relief=SUNKEN,text="img 3.4",bg="gray")
    label4.grid(row=1,column=1)

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







ventana.mainloop() 
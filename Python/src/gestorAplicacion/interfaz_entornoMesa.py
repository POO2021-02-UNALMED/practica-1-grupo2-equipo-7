from re import A
from tkinter import *
from tkinter import ttk
import tkinter

mesas = [i for i in range(0,4)]
print(mesas)

class botones_mesas:
    num = 1
    pos_y = 0
    pos_x = 1

    def __init__(self, window):
        self.num = botones_mesas.num
        self.pos_x = botones_mesas.pos_x
        self.pos_y = botones_mesas.pos_y
        btn7 = Button(window, width=10, text=f'Mesa {self.num}', background = "green")
        btn7.grid(padx=0, pady=2, row=self.pos_y, column=self.pos_x)
        botones_mesas.actualizar_posicion()
        

    def actualizar_posicion():
        botones_mesas.num += 1
        if (botones_mesas.pos_x == 8):
            botones_mesas.pos_y += 1
            botones_mesas.pos_x = 0

        botones_mesas.pos_x += 1
        


    def creador():
        botones_mesas()

    def funcion():
        window = tkinter.Toplevel(win_principal)
        win_principal.iconify()
        window.title("Hola")
        boton = tkinter.Button(window, text="boton secundario", command=botones_mesas.creador(window))
        boton.grid(padx=0, pady=2, row=0, column=0)

    


    
    


#window = Tk()

#window.title("La funcionalidad mas verga.")
#btn7 = Button(window, width=10, text="Creador", command = botones_mesas.creador)
#btn7.grid(padx=0, pady=2, row=0, column=0)

win_principal = Tk()
win_principal.title("La ventana principal de POOpina")
boton = tkinter.Button(win_principal, text="Abrir otra ventana", command=botones_mesas.funcion)
boton.pack()
boton.grid(padx=0, pady=2, row=0, column=0)



win_principal.mainloop()
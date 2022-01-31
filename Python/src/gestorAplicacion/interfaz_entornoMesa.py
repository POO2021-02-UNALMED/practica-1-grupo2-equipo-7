
from re import A
from tkinter import *
from tkinter import ttk
import tkinter

win_principal = Tk()
win_principal.title("Mesas")
boton = tkinter.Button(win_principal, text="Abrir otra ventana")
boton.pack()
boton.grid(padx=0, pady=2, row=0, column=0)



win_principal.mainloop()
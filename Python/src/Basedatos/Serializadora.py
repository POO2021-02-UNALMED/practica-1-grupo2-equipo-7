from gestorAplicacion import mesa

mesas           = {int : mesa}

def save_mesas(numero, mesa):
    mesas[numero] = mesa

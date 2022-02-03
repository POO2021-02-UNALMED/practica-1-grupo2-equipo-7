import pickle
fichero=open("losEmpleados", "rb")

misEmpleados=pickle.load(fichero)

fichero.close()

for c in misEmpleados:

    print(c.estado())

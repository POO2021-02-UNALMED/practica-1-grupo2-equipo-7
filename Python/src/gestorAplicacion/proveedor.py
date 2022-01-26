class Proveedor:

    listaProveedores=[]
    def __init__(self, nit,nombre,telefono):
        self.nit = nit
        self.nombre=nombre
        self.telefono=telefono
    

    #getters y setters   
    def setNit(self, nit):
        self.nit = nit
    
    def getNit(self):
        return self.nit

    def setNombre(self, nombre):
        self.nombre=nombre
    
    def getNombre(self):
        return self.nombre

    def setTelefono(self, telefono):
        self.telefono=telefono
    
    def getTelefono(self):
        return self.telefono

    #public static void crearProveedor(int nit, String nombre, String telefono) {
    #   Proveedor newProveedor=new Proveedor(nit,nombre,telefono);
    #    proveedores.add(newProveedor);
    #}

    #public static void verProveedores() {
    #    for(Proveedor proveedor:proveedores){
    #        System.out.println(proveedor);
    #    }
    #}

    #@Override
    #public String toString() {
    #    return "NIT Proveedor " + nit + "\n" +
    #            "[ Nombre: " + nombre + "\n" +
    #            "  Telefono: " + telefono + " ]";
    #}
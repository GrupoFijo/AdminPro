package proyecto_1;
 
public class Cliente{//la clase cliente se usara de almacenamiento para operaciones al momento de imprimir el comprobante
    private boolean metodoPago;
    private String direccion,nombre,dni;
    
    //Constructor//
    public Cliente( String nombre,boolean metodoPago,String dni,String direccion) {
        this.metodoPago = metodoPago;
        this.direccion = direccion;
        this.nombre = nombre;
        this.dni = dni;
    }
/////Metodos Geter's y Seter's
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    public boolean isMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(boolean metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
 
    //finalmente una devolucion de tipo string de los datos de la clase
    @Override
    public String toString() {
        return "Nombre: " + nombre+
               "\nDni: " + dni +
               "\nMetodo de pago: " + metodoPago + 
               "\nDireccion: " + direccion+"\n";
    }
}


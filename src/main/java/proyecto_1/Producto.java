/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

/**
 *
 * @author danie
 */
public class Producto {
    private int codigo,cantidad;
    private float precio;
    private String descipcion;
    private boolean dis;
    /*la clase producto se utiliza para almacenar los atributos de los productos
    que seran utilizados luego de la lectura en la clase Inventario
    */
    
    //constructor
    public Producto(int codigo, int cantidad, float precio, String descipcion) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descipcion = descipcion;
    }

    
    
    ///metodos geter's y seter's
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }
    
    
    ///devolucion de los datos en String
    
    @Override
    public String toString() {
        return "\nProducto \n"+ descipcion+ "\n" + codigo + "\n" + cantidad + "\n" + precio;
    }    
    
}

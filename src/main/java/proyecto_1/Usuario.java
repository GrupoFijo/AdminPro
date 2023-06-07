/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Usuario {//
    protected String nombre,codigo;
    protected int edad;
    protected float propina=0;

    
    public Usuario(String nombre, String codigo, int edad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.edad = edad;
       
    }
    

    
    protected void ActualizarEstadisticas(String text){//Las estadisticas seran actualizadas directamente,
        //para esto necesitamos como parametro una cadena de texto, que recolectaremos del Override de Estadisticas
        try{
            File archivo=new File("Estadisticas.txt");//primero se elimina el archivo
            archivo.delete();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!\nNo se a podido leer los ficheros");
            //en caso de un fallo en la lectura se lanzara una excepcion
        }
        try{
            PrintWriter archivo=new PrintWriter("Estadisticas.txt");//luego se creara un nuevo archivo
            archivo.print(text);//se imprime el texto
            archivo.close();//se cierra el archivo
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!\nNo se a podido leer los ficheros");
            //en caso de un fallo en la lectura se lanzara una excepcion
        }
    }    
    
    

    protected void ActualizarInventario(List Lista){//se actualiza el inventario directamente,
        //para ello se necesita como parametro la lista de productos
        try{File archivo=new File("Inventariado.txt");//empezamos borrando el archivo
        archivo.delete();
        }catch(Exception ex){
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!\nNo se a podido leer los ficheros");
        }
        try{  //luego volvemos a crear el archivo y en el, imprimimos los datos obtenidos del parametro
       PrintWriter archivo=new PrintWriter("Inventariado.txt");
       archivo.print(propina);//en la primera linea sera imprimido la propina actualizada
       for(int i=0;i<Lista.size();i++){
            archivo.print(Lista.get(i).toString());
        }
        archivo.close();//se cierra el archivo
            }catch(Exception e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!\nNo se a podido leer los ficheros");
        //en caso de un fallo en la lectura se lanzara una excepcion
            }
    }
    
    //metodos Geter's y Seter's
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPropina() {
        return propina;
    }

    public void setPropina(float propina) {
        this.propina = propina;
    }

    //////
}

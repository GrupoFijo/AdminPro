/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Inventario {
    private List<Producto> inventario=new ArrayList<Producto>();//se necesitara una lista dinamica de Productos para almacenar cada producto leido
    private float propinas;
    public Inventario(){
        //el Constructor de Inventario lee el archivo Inventariado.txt 
        File archivo = new File ("Inventariado.txt");
        FileReader fr = null;
        BufferedReader br = null;
        if(!archivo.exists()){//en caso de que el archivo no exita, creara uno nuevo
        try{
        archivo.createNewFile();
        fr=new FileReader(archivo);
        fr.close();
            JOptionPane.showMessageDialog(null, "No hay datos en el inventario");//se indica a travez de un mensaje que el inventario esta vacio
        }catch(IOException e){
            e.printStackTrace();JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!\nNo se a podido leer los ficheros");
            //si hay un error dentro de la lectura entonces se lanzara una excepxion
        }
        }
        else//en caso de que el archivo si existe,procederemos a realizar la lectura del fichero
        {
        try{
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            this.propinas=Float.parseFloat(br.readLine());//la primera linea del archivo siempre dara el almacenamiento de las propinas obtenidas
            String descripcion;
            while((descripcion = br.readLine())!=null)//el bluce continua hasta leer todo el fichero
            {
                String descripcionProducto = br.readLine();
                int codigoProducto = Integer.parseInt(br.readLine());
                int cantidadProducto =Integer.parseInt(br.readLine());
                float precioProducto =Float.parseFloat(br.readLine());
                Producto productoAux = new Producto(codigoProducto,cantidadProducto,precioProducto,descripcionProducto);
                //despues de leer lineas del archivo,creamos Productos y procedemos a almacenar cada uno en la coleccion Inventario
                this.inventario.add(productoAux);
            }
            fr.close();
        }catch(Exception e){
            e.printStackTrace();JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!\nNo se a podido leer los ficheros");
            //si hay un error dentro de la lectura,se lanzara una excepcion
        }
     }
    }
    
    
    ///geter's and seter's
    public List<Producto> getLista() {
        return inventario;
    }

    public void setLista(List<Producto> lista) {
        this.inventario = inventario;
    }

    public float getPropinas() {
        return propinas;
    }

    public void setPropinas(float propinas) {
        this.propinas = propinas;
    }
}

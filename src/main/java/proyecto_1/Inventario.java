/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

import com.mysql.cj.xdevapi.DbDoc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    SQLCon database= new SQLCon();
    PreparedStatement ps=null;
    ResultSet rs=null;
    public Inventario(){
      
        {
        try{
           
            ps=database.getConect().prepareStatement("SELECT*FROM producto");
            rs=ps.executeQuery(); 
            while(rs.next()){
              int idProducto=rs.getInt("idProducto");
              int cantidad=rs.getInt("cantidad");
              float precio=rs.getFloat("precio");
              String descripcion=rs.getString("descripcion");
              boolean disponible=rs.getBoolean("disponible") ;
              Producto productoAux = new Producto(idProducto, cantidad, precio, descripcion);
              this.inventario.add(productoAux);
            }
            database.getConect().close();
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error al conectar la base de datos\n"+e.getMessage());
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
       
    public void addToDb(int id,int cant,float pre,String desc){
    
    }

}

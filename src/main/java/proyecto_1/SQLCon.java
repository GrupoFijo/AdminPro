/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 1.0-Importacion de librerias y creacion de los objetos a conectar
 */
public class SQLCon {
    Connection SQLconnetion;//objeto conexión
       PreparedStatement ps=null;
       ResultSet rs=null;
    public SQLCon() {//constructor
        //RUTA de la base de datos
       String host="localhost";
       String puerto="3306";
       String name="netsales";
        //Acceso URL
        String usuario="root";
        String pass="";
        //Controlador de acceso
        String driver="com.mysql.cj.jdbc.Driver";
        //Contruir URL
        String dataURL="jdbc:mysql://"+host+":"+puerto+"/"+name;
        try{
            Class.forName(driver);
            SQLconnetion=DriverManager.getConnection(dataURL,usuario,pass);
            /*
            ps=SQLconnetion.prepareStatement("SELECT*FROM producto");
            rs=ps.executeQuery();
          while(rs.next()){
              int idProducto=rs.getInt("idProducto");
              int cantidad=rs.getInt("cantidad");
              float precio=rs.getFloat("precio");
              String descripcion=rs.getString("descripcion");
              boolean disponible=rs.getBoolean("disponible") ;
              System.out.println("id:"+idProducto);  
              System.out.println("cant:"+cantidad);  
              System.out.println("pre:"+precio);  
              System.out.println("desc:"+descripcion);  
              System.out.println("dis:"+disponible);     
          }  */
        }catch(Exception e){
            System.out.println("Error al conectar "+e.getMessage());
        }
    }
    public Connection getConect(){
        return SQLconnetion;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_1;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 1.0-Importacion de librerias y creacion de los objetos a conectar
 */
public class SQLCon {
    Connection SQLconnetion;//objeto conexión

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
            System.out.println("Base de datos conectada");
            
        }catch(Exception e){
            System.out.println("Error al conectar "+e.getMessage());
        }
    }
    public Connection getConectar(){
        return SQLconnetion;
    }
    
    
}

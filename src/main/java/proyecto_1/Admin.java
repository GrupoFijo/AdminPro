/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class Admin {
      public List<Vendedor> vendedores= new ArrayList<Vendedor>();// se necesitara una Lista dinamica para almanecar a los vendedores
    
    public Admin(){   
        //el constructor de esta clase lee el archivo Vendedores
    File file=new File("Vendedores.txt");
        FileReader fr=null;
        BufferedReader br=null;
        if(!file.exists()){//si no existe entonces se creara un archivo nuevo
            try {
                file.createNewFile();
                fr=new FileReader(file);
                fr.close();
                JOptionPane.showMessageDialog(null,"No hay Usuarios registrados\nSolo el administrador debe acceder");
                //se da a conocer que el archivo esta vacio
            } catch (Exception e) {
            e.printStackTrace();JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!\nNo se a podido leer los ficheros");
            //en caso de un fallo en la lectura se lanzara una excepcion
            }
        }else//en caso de que el archivo exista se leera linea por linea y se almacenara en las variables
            {
            try {
                fr=new FileReader(file);
                br=new BufferedReader(fr);
                String aux=br.readLine();
                String code;
                while((code = br.readLine())!=null){//se leera hasta el final del archivo
                String name=br.readLine();
                String lastName=br.readLine();
                int age=Integer.parseInt(br.readLine());
                float salary=Float.parseFloat(br.readLine());
                int commision=Integer.parseInt(br.readLine());
                boolean activo=Boolean.parseBoolean(br.readLine());
                //pasamos las variables a al constructor de la clase vendedor para crear un nuevo vendedor en la memoria
                Vendedor vendedorAux=new Vendedor(salary,name,lastName,code,age,commision,activo);
                //y este se almacena en la coleccion vendedores
                vendedores.add(vendedorAux);
                }
                fr.close();//cerramos el archivo leido
            } catch (Exception e) {
                e.printStackTrace();JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!\nNo se a podido leer los ficheros");
                //en caso de un fallo en la lectura se lanzara una excepcion
            }
           
        }
    }
    
    public void ActualizarVendedores(){
         try{
           File file=new File("Vendedores.txt");//se buscara el archivo Vendedores y se eliminara
            file.delete();
        }catch(Exception e){
            e.printStackTrace();JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!\nNo se a podido Actualizar los ficheros");
            //en caso de un fallo en la lectura se lanzara una excepcion
            }
        try{
            PrintWriter archivo=new PrintWriter("Vendedores.txt");//luego de eliminarse crearemos uno nuevo
            archivo.print("Vendedores");
            // y en este imprimimos los vendedores con sus campos actualizados en la memoria 
            for(int i=0;i<vendedores.size();i++)
            {
            archivo.print(vendedores.get(i).toString());
            }
            archivo.close();//finalmente cerramos el archivo
        }catch(Exception e){
            e.printStackTrace();JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!\nNo se a podido Actualizar los ficheros");
            //en caso de un fallo en la lectura se lanzara una excepcion
        }
    }
    
    public String generaCodigos(){//funcion para crear un codigo de descuento AlfaNumerico, esta funcion devuelve una cadena de 6 caracteres
        String codigo="";
        int x;
        int suma;
        char aux;
        boolean band=false;
        while(!band){/*el bucle continua hasta que la generacion sea valida,la bandera debe ser verdadera,osea hasta que sea generado 
            un codigo que cumple con las condiciones*/
        //se inicializan las variables en 0 o vacias en caso de que el bucle continue
        codigo="";
        suma=0;
        aux=' ';
        //
        x=generaAleatorio(65,90);// se genera un valor entre 65 a 90 por que utilizaremos los codigos ASCII de A-Z
        aux=(char)x;//esto lo pasamos a un caracter 
        codigo=Character.toString(aux);//y se pasa a la variable que contendra el codigo codigo
        x-=60;//finalmente usamos la variable del codigo ASCII para operar, Ejemplo: A=5,B=6,C=7...
        suma=x;//el resultado se guarda en la variable suma
        
        ///se hace lo anterior operado en las siguientes lineas
        x=generaAleatorio(65,90);
        aux=(char)x;
        codigo+=Character.toString(aux);
        x-=60;
        suma+=x;
        //////
        for(int i=0;i<4;i++){//luego en los siguientes 4 espacios que usaremos para el codigo seran numericos
            x=generaAleatorio(0,9);//se genera un numero entre 0 a 9
            suma+=x;//este se adiciona a la variable suma
            codigo+=x;//y tambien se adiciona al codigo a generar
         }
        if(suma%30==1)//el codigo sera reconocido como correcto si la suma almacenada da como residuo 1 con un modulo de 30 
            band=true;//si es correcto la bandera sera activada, caso contrario no sera generado y el bucle continua
        }
        return codigo;//finalmente se retorna el codigo 
    }
    
    public boolean comparaCodigo(String codigo){//se comparar el codigo ingresado en esta funcion, si no existe el codigo,
        //en un fichero entonces sera almacenado
        File file=new File("Codigos_Descuento.txt");
        FileReader fr=null;
        BufferedReader br=null;
        boolean band=true;
        if(!file.exists()){//si el archivo no existe se creara uno nuevo
           try{ 
               file.createNewFile();
            PrintWriter archivo= new PrintWriter(file);
            archivo.print(codigo);//dentro del archivo se almacenara el codigo
            archivo.close();
           }catch(Exception e){
               e.printStackTrace();JOptionPane.showMessageDialog(null,"Algo ha salido mal \n"+e.toString());
                 //en caso de un fallo en la lectura se lanzara una excepcion
           }
        }else{//en caso de que el archivo ya exista se comparara si ese codigo ya ha sido generado
            try {
                fr=new FileReader(file);
                br=new BufferedReader(fr);
                String aux;
                while ((aux=br.readLine())!=null){//se leera linea por linea, hasta el final del archivo
                    if(aux.equals(codigo))//se compara si en la linea ya existe el codigo, entonces desactiva la bandera
                    band=false; //si la bandera se desactiva entonces ya no se guarda el codigo
                }
                if(band){//si la bandera esta activada, entonces se guardara el codigo
                    FileWriter fw=new FileWriter(file,true);
                    fw.append("\n"+codigo);//se da un salto de linea y se imprime el codigo
                    fw.close();
                    return true;//se cierra el archivo y retorna un valor verdadero
                }else return false;//caso contrario devuelve un valor falso
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Algo ha salido mal \n"+e.toString());
                  //en caso de un fallo en la lectura se lanzara una excepcion
            }
        }
          return true; //caso por defecto, verdadero
    }
    
    
////metodos geter's and seter's
    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
    private int generaAleatorio(int menor,int mayor){
        return (int )(Math.random()*(mayor-menor+1)+menor);
    }
}
////

package proyecto_1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Estadisticas {
 private String productoMV;
 private int cant;
 private float ventasTotales;
 private float ganacias;

 
/*esta clase se encarga de leer los datos de Estadisticas, Producto mas vendido
con su respectiva cantidad para hacer operaciones,tambien las ganancias totales y la cantidad de ventas realizadas
 */
    public Estadisticas() {
        productoMV="";
        cant=0;
        ventasTotales=0;
        ganacias=0;
        File archivo=new File("Estadisticas.txt");
        FileReader fr = null;
        if(!archivo.exists()){//si no existe el archivo, entonces sera creado
            try {
                archivo.createNewFile();
                fr=new FileReader(archivo);
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Algo ha salido mal \n"+e.toString());
                //en caso de un fallo en la lectura se lanzara una excepcion
            }
        }else //si el archivo existe entonces sera leido( la primera linea)
        {
            try {
                fr=new FileReader(archivo);
                BufferedReader br=new BufferedReader(fr);
                String linea;
                    linea=br.readLine();
                    String datos[]=linea.split("\\;");//el metodo split es utilizado para separar el texto segun ";"
                    //y cada dato sera almacenado en los siguientes atributos
                  this.cant=Integer.parseInt(datos[0]);
                  this.productoMV=(datos[1]);
                  this.ventasTotales=Float.parseFloat(datos[2]);
                  this.ganacias=Float.parseFloat(datos[3]);
                fr.close();//se cierra el archivo
            } catch (Exception e) {
                e.printStackTrace();JOptionPane.showMessageDialog(null,"Algo ha salido mal \n"+e.toString());
                //en caso de un fallo en la lectura se lanzara una excepcion
            }
        }
    }
    public void actualizarEstad(){
        File file=new File("Estadisticas.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
                PrintWriter pr=new PrintWriter(file);
                pr.print(toString());
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();JOptionPane.showMessageDialog(null,"Algo ha salido mal \n"+e.toString());
                //en caso de un fallo en la lectura se lanzara una excepcion
            }
        }else{
            try {
                file.delete();
                PrintWriter pr=new PrintWriter(file);
                pr.print(toString());
                pr.close();
            } catch (Exception e) {
                e.printStackTrace();JOptionPane.showMessageDialog(null,"Algo ha salido mal \n"+e.toString());
                //en caso de un fallo en la lectura se lanzara una excepcion
            }
        }
    }
   
    
    ///metodos Geter's y Seter's
    public String getProductoMV() {
        return productoMV;
    }

    public void setProductoMV(String productoMV) {
        this.productoMV = productoMV;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public float getVentasTotales() {
        return ventasTotales;
    }

    public void setVentasTotales(float ventasTotales) {
        this.ventasTotales += ventasTotales;
    }

    public float getGanacias() {
        return ganacias;
    }

    public void setGanacias(float ganacias) {
        this.ganacias += ganacias;
    }
    
    ///devolucion de los datos de la clase en String
    
    @Override
    public String toString() {
        return ""+(int)this.cant+';'+this.productoMV+';'+this.ventasTotales+';'+this.ganacias;
    }
 
}

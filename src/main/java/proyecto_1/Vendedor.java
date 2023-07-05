/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class Vendedor extends Usuario{//Usuario hereda a Vendedor
    private float sueldo;
    private int id;
    //nombre y edad extraidos de la clase usuario
    private String apellido;
    private String codigo;//contraseña
    private String usuario;
    private int comisiones;
    private boolean activo;
    private List<Producto>ListaProducto;
    static List<Integer>carrito;
    
    
    public Vendedor(int id,float sueldo, String nombre,String apellido,String usuario, String codigo, int edad,int comision,boolean activo) {
        super(nombre,codigo,edad);
        this.id=id;
        this.sueldo = sueldo;
        this.apellido=apellido;
        this.usuario=usuario;
        this.comisiones=comision;
        this.activo=activo;
        //Al iniciar el Inventario este sera lecturado del archivo
        Inventario inventario=new Inventario();
        ListaProducto=new ArrayList<Producto>();//se añade una Coleccion auxiliar ListaProducto
       for(int i=0;i<inventario.getLista().size();i++){
           ListaProducto.add(inventario.getLista().get(i));
            ///los datos obtenidos del Inventario se almacenan a ListaProducto para ser utilizado por el vendedor
       }
       if(this.sueldo<=1200&&this.comisiones>=25){//en caso de que el sueldo del vendedor no llega al record de 25 ventas y su sueldo es menor a 1200
           //entonces le llegara el bono de 500 soles
           this.sueldo+=500;
       }
        setPropina(inventario.getPropinas());//se añade la propina obtenida
    }
    public boolean codeOffSale(String code){
        File file=new File("Codigos_Descuento.txt");
        FileReader fr=null;
        BufferedReader br=null;
        boolean band=true;
        if(!file.exists()){//si el archivo no existe entonces este se creara y retornaremos un valor falso
            try {
                file.createNewFile();
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Algo ha salido mal \n"+e.toString());
                //en caso de un fallo en la lectura se lanzara una excepcion
            }
        }else{//si el archivo existe entonces se hace una lectura de este
        try {
                fr=new FileReader(file);
                br=new BufferedReader(fr);
                String aux;
                while ((aux=br.readLine())!=null){
                    if(aux.equals(codigo)){//se hace una comparacion secuencia
                    band=true; //si encuentra el codigo entonces la bandera sera activada, si esto pasa retornara a verdadero
                    break;
                    }
                }
                br.close();//se cierra el archivo
                if(band){
                    return true;
                }else return false;
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Algo ha salido mal \n"+e.toString());
                //en caso de un fallo en la lectura se lanzara una excepcion
            }
        }
        return false;//retornacion por defecto
    }
    
    public int buscarProducto(int codigoBuscado){//se utiliza una busqueda secuencial
        for(int i=0;ListaProducto.size()>i;i++){
            if(ListaProducto.get(i).getCodigo()==codigoBuscado)
            return i;//si se encuentra el codigo, este devolvera el indice de la posicion obtenida
        }
        return -1;//si no encuentra el codigo entonces este devolvera un valor de -1
    }

    public int lastIdProducto() {
      int last=ListaProducto.size();
      return last;
    };
    
    
    public void addProducto(Producto p) throws SQLException{
         SQLCon database= new SQLCon();
         
         PreparedStatement ps;
         ps=database.getConect().prepareStatement("INSERT INTO producto VALUES ('"+p.getCodigo()+"','"+p.getCantidad()+"','"+p.getPrecio()+"','"+p.getDescipcion()+"','1')");
         /*ps.setInt(1, p.getCantidad());
         ps.setFloat(2, p.getPrecio());
         ps.setString(3, p.getDescipcion());
         ps.setInt(4, 1);*/
         ps.executeUpdate();
        
         database.getConect().close();
    }
    
    
    
    
    ///Metodos Geter's y Seter's
   
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
       
    public List<Producto> getListaProducto() {
        return ListaProducto;
    }

    public void setListaProducto(List<Producto> ListaProducto) {
        this.ListaProducto = ListaProducto;
    }
    
    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }    

    public int getComisiones() {
        return comisiones;
    }

    public void setComisiones() {
        this.comisiones +=1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
       
    
    
    @Override
    public String toString() {
        return  "\n"+codigo+"\n"+nombre + "\n"+ apellido + "\n" +edad+"\n"+sueldo+"\n"+ comisiones+"\n"+activo;
    }

    
  
}

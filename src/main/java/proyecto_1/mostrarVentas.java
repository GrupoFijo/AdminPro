
package proyecto_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;


public class mostrarVentas extends javax.swing.JInternalFrame {

    /**
     * Creates new form mostrarVentas
     */
    static Estadisticas stad=new Estadisticas();//al inicializar se recolecta los datos del archivo Estadisticas
    
    public mostrarVentas() {
        initComponents();
        //al iniciar el Frame este escribe en el Area de texto los datos de Estadisticas
        this.mostrarResumen.setText("");
        String text=".:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.";
         File file=null;
         FileReader fr=null;
         BufferedReader br=null;
         text+="\nProducto mas vendido: "+stad.getProductoMV();
         text+="\nGanancias Totales:"+stad.getGanacias();
         text+="\nVentas totales realizadas:"+(int)stad.getVentasTotales();
         text+="\n:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:.:\n\n";
         //luego se lectura las Ventas y se añaden al Area de texto
        try{
            file=new File("Ventas.txt");
            fr=new FileReader(file);
            br=new BufferedReader(fr);
          String aux;
           while((aux=br.readLine())!=null){
               text+="\n"+aux+"\n"+br.readLine();
           }
           fr.close();//luego se cierra
        }catch(Exception e){
            e.printStackTrace();JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!");
            //si hay un error dentro de la lectura entonces se lanzara una excepxion
        }
        this.mostrarResumen.setText(text);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarResumen = new javax.swing.JTextArea();

        jButton1.setText("Aceptar");

        mostrarResumen.setEditable(false);
        mostrarResumen.setColumns(20);
        mostrarResumen.setRows(5);
        jScrollPane1.setViewportView(mostrarResumen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mostrarResumen;
    // End of variables declaration//GEN-END:variables
}

package proyecto_1;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class PanelResumenVentas extends javax.swing.JFrame {
    
    //en esta clase se lecturaran los datos del usuario quien esta operando actualmente y luego se agregara el texto completo de Ventas
    
       
    public PanelResumenVentas() {
        this.setLocationRelativeTo(null);
        int i=ingreso.index;

        
//        Admin admin=new Admin();
      initComponents();
        this.getContentPane().setBackground(Color.getHSBColor(0.6f, 0.3f, 1f));
//         String text="Datos del Usuario:\n"+admin.getVendedores().get(i).getNombre()+"\nComisiones realizadas:"+admin.getVendedores().get(i).getComisiones()
//                 +"\nPaga S/."+admin.getVendedores().get(i).getSueldo()
//                 +"\n\nRESUMEN DE LAS VENTAS\n********************************************\n";
//         File file=null;
//         FileReader fr=null;
//         BufferedReader br=null;
//        try{
//            file=new File("Ventas.txt");
//            fr=new FileReader(file);
//            br=new BufferedReader(fr);
//          String aux;
//           while((aux=br.readLine())!=null){
//               text+="\n"+aux+"\n"+br.readLine();
//           }
//        }catch(Exception e){
//            e.printStackTrace();JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!\nNo se pudo leer");
//            //si hay un error dentro de la lectura entonces se lanzara una excepxion;
//        }
      //  this.mostrarResumen.setText(text);//finalmente sera mostrado en Area de texto
        URL imageURL = getClass().getResource("/imagenes/aceptar.png");
        if (imageURL != null) {
            ImageIcon icon = new ImageIcon(imageURL);
            jButton1.setIcon(icon);
        } else {
            // Manejo del error si la URL de la imagen es nula
            System.out.println("La URL de la imagen es nula");
        }
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarResumen = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonBuscar = new javax.swing.JButton();
        cajaBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("*RESUMEN DE VENTAS*");
        setBackground(new java.awt.Color(0, 102, 255));

        mostrarResumen.setEditable(false);
        mostrarResumen.setColumns(20);
        mostrarResumen.setRows(5);
        jScrollPane1.setViewportView(mostrarResumen);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Atras");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingresar Número de venta:");

        buttonBuscar.setText("OK");
        buttonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonBuscarMouseClicked(evt);
            }
        });
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonBuscar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(buttonBuscar)
                    .addComponent(cajaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
     panelVentas a=new panelVentas();
     a.setVisible(true);
     dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed

    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void buttonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonBuscarMouseClicked
        SQLCon database= new SQLCon();
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        int idventa=Integer.parseInt(cajaBuscar.getText());
        try {
            String fecha;
            String cliente="";
            float total=0;
            int idTrabajador=0;
            String text="";
              ps=database.getConect().prepareStatement("SELECT * FROM venta WHERE idventa="+idventa);
              rs=ps.executeQuery();
              rs.next();
              if(rs.getInt("idVenta")==idventa){
                  JOptionPane.showMessageDialog(null,"Codigo encontrado");
                  fecha=rs.getDate("fecha").toString();
                  cliente=rs.getString("cliente");
                  total=rs.getFloat("total");
                  idTrabajador=rs.getInt("Trabajador_idTrabajador");
                  text+="\n\t\tFecha de emision:"+fecha.toString();
                  text+="\nAtencion Realizada por:"+new Admin().getVendedores().get(idTrabajador).getNombre();
                  text+="\n-Compra en tienda-\n";
                  text+="-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-\n";
                  text+="|Productos comprados:\n";
                  ps=database.getConect().prepareStatement("SELECT * ,precio_unit * cantidad AS total  FROM detalleventa WHERE idVenta="+idventa);
                  rs=ps.executeQuery();
                  text+="|Cantidad\t|Descripción\nid\nPrecio U.\t\tSubtotal\n";
                  while(rs.next()){
                   float cant=rs.getInt("cantidad");
                  float precio=rs.getFloat("precio_unit");
                  text+=cant+"\t";
                  text+=rs.getString("descripcion")+"\t";
                  text+=rs.getInt("idProd")+"\tS/.";
                  text+=precio+"\t\tS/.";
                  text+=rs.getFloat("total")+"\n";
                    }
                  text+="\n----------------Total=S/."+total;
                  text+="\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
                  text+="Cliente:"+cliente+"\n";
                  
                  this.mostrarResumen.setText(text);
              }
              else
                  JOptionPane.showMessageDialog(null,"codigo no encontrado");
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null,"Codigo no existente\n--"+e.toString());
        }
         
        
    }//GEN-LAST:event_buttonBuscarMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelResumenVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelResumenVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelResumenVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelResumenVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelResumenVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JTextField cajaBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mostrarResumen;
    // End of variables declaration//GEN-END:variables
}

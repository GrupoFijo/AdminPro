/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class panelDeImpresion extends javax.swing.JFrame {

    private int indice=ingreso.index;
   private String t;
    public panelDeImpresion() {
        //aqui se imprime los datos obtenidos de los paneles de PanelVenderProducto y FormularioVentas, ademas de los datos del vendedor
      Estadisticas estad=new Estadisticas();
        initComponents();
        this.setLocationRelativeTo(null);
        Date date=new Date();
        int cantAux,indexAux;float precioAux,total=0;//se genera la fecha actual
        t="Fecha:"+date.toString();//se imprime la fecha 
        //impresion de los datos del vendedor
        t+="\nAtencion Realizada por: ";
        t+=panelVenderProducto.admin.getVendedores().get(indice).getNombre()+"\n";
        t+="++++++++++++++++++++++++++++++++++++++++\n";
        t+=fomularioVentas.textFormulario+"\n";
        t+="++++++++++++++++++++++++++++++++++++++++++\n";
        t+="Producto\tCantidad\tPrecio\tSubTotal\n";
        //se imprimen los datos de los productos por medio del carrito
        for(int i=0;i<panelVenderProducto.carrito.size();i++){
         indexAux=panelVenderProducto.carrito.get(i);
        t+=panelVenderProducto.admin.getVendedores().get(indice).getListaProducto().get(indexAux).getDescipcion()+"  \t";
        cantAux=panelVenderProducto.cantidades.get(i);
        if(cantAux>estad.getCant()){
           estad.setCant(cantAux);
           estad.setProductoMV(panelVenderProducto.admin.getVendedores().get(indice).getListaProducto().get(indexAux).getDescipcion());
         };
        t+=cantAux;
        panelVenderProducto.admin.getVendedores().get(indice).getListaProducto().get(indexAux).setCantidad(panelVenderProducto.admin.getVendedores().
        get(indice).getListaProducto().get(indexAux).getCantidad()-cantAux);
        precioAux=panelVenderProducto.admin.getVendedores().get(indice).getListaProducto().get(indexAux).getPrecio();
        t+="\tS/."+precioAux+"\tS/."+((float)cantAux*precioAux)+"\n";   total+=(float)cantAux*precioAux;
        }
        //descuentos en caso de ingresos de codigo o compras mayores a montos de  250
        t+="-------------------------------------Total";
        if(total<250)
        total+=fomularioVentas.adicional;
       if(panelVenderProducto.bandera){
            t+="\n   -CODIGO POR DESCUENTO INGRESADO:10%";
            total=(float) (total-(total*0.1));
        }
        if(total>250){
        
            t+="\n    Descuento por compras mayores: libre de cargo de Delivery";
            t+="\n                              S/."+total;
        }else
        t+="                              S/."+total;
        cajaImpresion.setText(t);
        estad.setGanacias(total);
        estad.setVentasTotales(1);
        estad.actualizarEstad(); 
       panelVenderProducto.admin.getVendedores().get(indice).setComisiones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonFinalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajaImpresion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("*Impresion+");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BotonFinalizar.setText("FINALIZAR");
        BotonFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonFinalizarMouseClicked(evt);
            }
        });
        BotonFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinalizarActionPerformed(evt);
            }
        });

        cajaImpresion.setEditable(false);
        cajaImpresion.setColumns(20);
        cajaImpresion.setRows(5);
        jScrollPane1.setViewportView(cajaImpresion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonFinalizar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(BotonFinalizar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFinalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonFinalizarActionPerformed

    private void BotonFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonFinalizarMouseClicked
        JOptionPane.showMessageDialog(null,"Cambios guardados");
        panelVentas a=new panelVentas(); a.setVisible(true);
         
        dispose();
        panelVentas.x.dispose();
        panelVenderProducto.y.dispose();
       try {
           guardar(t);
       } catch (IOException ex) {
           ex.printStackTrace();JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!");
            //si hay un error dentro de la lectura entonces se lanzara una excepxion
       }
       panelVenderProducto.admin.ActualizarVendedores();
       panelVenderProducto.admin.getVendedores().get(indice).ActualizarInventario(panelVenderProducto.admin.getVendedores().get(indice).getListaProducto());
    }//GEN-LAST:event_BotonFinalizarMouseClicked
    
    private void guardar(String texto) throws IOException{
        File file=new File("Ventas.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
                FileWriter fw=new FileWriter(file,true);
                fw.append(texto);
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            try {
                FileWriter fw=new FileWriter(file,true);
                fw.append("\n");
                fw.append(texto);
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!");
            //si hay un error dentro de la lectura entonces se lanzara una excepxion
            }
        }
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(fomularioVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fomularioVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fomularioVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fomularioVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panelDeImpresion().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonFinalizar;
    private javax.swing.JTextArea cajaImpresion;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

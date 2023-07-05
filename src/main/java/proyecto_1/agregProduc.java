/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto_1;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class agregProduc extends javax.swing.JPanel {

    private Admin admin=new Admin();
    private int indice=ingreso.index;
    private Producto producto;
    public agregProduc() {
        this.setLocationRelativeTo(null);
        initComponents();
        this.botonActualizar.setEnabled(false);
        this.cajaCantidad.setText("");
        this.cajaPrecio.setText("");
        this.cajaProducto.setText("");
        mostrar();
    }

    private void mostrar(){//esta funcion crea una matriz a partir de los campos de los vendedores
    String matriz[][]=new String[admin.getVendedores().get(indice).getListaProducto().size()][4];
        for (int i = 0; i < admin.getVendedores().get(indice).getListaProducto().size(); i++) {
            matriz[i][0]=admin.getVendedores().get(indice).getListaProducto().get(i).getDescipcion();
            matriz[i][1]=Float.toString(admin.getVendedores().get(indice).getListaProducto().get(i).getPrecio());
            matriz[i][2]=Integer.toString(admin.getVendedores().get(indice).getListaProducto().get(i).getCantidad());
            matriz[i][3]=Integer.toString(admin.getVendedores().get(indice).getListaProducto().get(i).getCodigo());
        }
         tablaProductos.setModel(new javax.swing.table.DefaultTableModel(//la matriz se pasa a una tabla por defecto
            matriz,
            new String [] {
                "Producto", "Precio", "Cantidad", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };
            //hacer que la celda sea editable
            //public boolean isCellEditable(int rowIndex, int columnIndex) {
              //  return canEdit [columnIndex];
            //}
        });  
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cajaProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cajaPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajaCantidad = new javax.swing.JTextField();
        botonAñadir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        cancelar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();

        jLabel1.setText("Descripcion del Producto");

        cajaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaProductoActionPerformed(evt);
            }
        });

        jLabel2.setText(" Precio en Soles");

        cajaPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaPrecioActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad Inicial");

        botonAñadir.setText("Añadir");
        botonAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAñadirMouseClicked(evt);
            }
        });
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        jLabel5.setText("Productos Registrados");

        tablaProductos.setAutoCreateRowSorter(true);
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Precio", "Cantidad", "Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tablaProductos);

        cancelar.setText("Cancelar");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        botonActualizar.setText("Actualizar");
        botonActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonActualizarMouseClicked(evt);
            }
        });
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cajaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cajaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cajaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAñadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cajaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaProductoActionPerformed

    private void cajaPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaPrecioActionPerformed

    private void botonAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAñadirMouseClicked
        //al pulsar este botn se creara un espacio en la tabla y estos datos nuevos eran mostrados
        this.botonActualizar.setEnabled(true);
        int cantidad=Integer.parseInt(cajaCantidad.getText());

        float precio=Float.parseFloat(cajaPrecio.getText());
        //modificacion, producto necesitara un indice de la lista productos, este sera 1 mas del tamaño total
        producto=new Producto(admin.getVendedores().get(indice).lastIdProducto()+1000, cantidad, precio, this.cajaProducto.getText());
        try {
            admin.getVendedores().get(indice).addProducto(producto);
            admin.getVendedores().get(indice).getListaProducto().add(producto);
            JOptionPane.showMessageDialog(null,"Producto Nuevo Ingresado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de ingreso" +ex.getMessage());
        }
        mostrar();
    }//GEN-LAST:event_botonAñadirMouseClicked

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAñadirActionPerformed

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        //volvera al panel anterior
        panelVentas a=new panelVentas();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelarMouseClicked

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelarActionPerformed

    private void botonActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonActualizarMouseClicked
        //pulsando este boton se actualizara directamente los datos de los productos
        mostrar();
    }//GEN-LAST:event_botonActualizarMouseClicked

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAñadir;
    private javax.swing.JTextField cajaCantidad;
    private javax.swing.JTextField cajaPrecio;
    private javax.swing.JTextField cajaProducto;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

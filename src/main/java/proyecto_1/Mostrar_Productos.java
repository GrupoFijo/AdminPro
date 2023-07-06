/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_1;

import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class Mostrar_Productos extends javax.swing.JInternalFrame {
    private int indice=0;
    private Admin admin=new Admin();
    public Mostrar_Productos() {
        initComponents();
        mostrar();//al iniciar mostramos la tabla
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane5 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        ));
        jScrollPane5.setViewportView(tablaProductos);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\admin\\Nueva carpeta\\AdminPro\\src\\main\\resources\\imagenes\\actualizar-flecha.png")); // NOI18N
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("ADVERTENCIA:Si esta actualizando un campo, no cerrar esta ventana!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(438, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void mostrar(){
        String matriz[][]=new String[admin.getVendedores().get(indice).getListaProducto().size()][4];//la matriz sera creada a partir de
        //los atributos obtenidos de los productos
        for (int i = 0; i < admin.getVendedores().get(indice).getListaProducto().size(); i++) {
            matriz[i][0]=admin.getVendedores().get(indice).getListaProducto().get(i).getDescipcion();
            matriz[i][1]=Float.toString(admin.getVendedores().get(indice).getListaProducto().get(i).getPrecio());
            matriz[i][2]=Integer.toString(admin.getVendedores().get(indice).getListaProducto().get(i).getCantidad());
            matriz[i][3]=Integer.toString(admin.getVendedores().get(indice).getListaProducto().get(i).getCodigo());
        }
         tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "Producto", "Precio", "Cantidad", "Codigo","Check"
            }
        ));
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     //al pulsar este boton recolectaremos los datos de la tabla y estos se actualizaran a traves del metodo de la clase Vendedores
     //estos seran actualizables dentro de la tabla
     int auxcodigo,auxcantidad;
     String auxdecripcion;
     float auxprecio;
        try {
     for(int i=0;i<admin.getVendedores().get(indice).getListaProducto().size();i++){
           auxdecripcion=(String) tablaProductos.getValueAt(i, 0);
           auxprecio=Float.valueOf((String)tablaProductos.getValueAt(i, 1)) ;
           auxcantidad=Integer.valueOf((String)tablaProductos.getValueAt(i, 2)) ;
           auxcodigo=Integer.valueOf((String)tablaProductos.getValueAt(i, 3)) ;
       admin.getVendedores().get(indice).getListaProducto().get(i).setDescipcion(auxdecripcion);
       admin.getVendedores().get(indice).getListaProducto().get(i).setPrecio(auxprecio);
      admin.getVendedores().get(indice).getListaProducto().get(i).setCantidad(auxcantidad);
       admin.getVendedores().get(indice).getListaProducto().get(i).setCodigo(auxcodigo);
     }
        admin.getVendedores().get(indice).ActualizarInventario(admin.getVendedores().get(indice).getListaProducto());
      JOptionPane.showMessageDialog(null,"Datos actualizados");
      } catch (Exception e) {
          e.printStackTrace();JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!\nNo se a podido Actualizar, Revise los campos");
            //si hay un error dentro de la lectura entonces se lanzara una excepxion
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}

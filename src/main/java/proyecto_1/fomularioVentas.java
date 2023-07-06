package proyecto_1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class fomularioVentas extends javax.swing.JFrame {

  private int indice=ingreso.index;
    public static int adicional;
    public static String direccion;
    public static String textFormulario=new String();
    private SQLCon database= new SQLCon();
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    public fomularioVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
        cajaDir.setEnabled(false);
        cajaDir.setText("0");
        adicional=0;
        comboBox.setEnabled(false);
        this.cajaRUC.setEnabled(false);
        this.rbTienda.setSelected(true);
        this.rbEfectivo.setSelected(true);
        this.botonBoleta.setSelected(true);
        this.cajaRUC.setText(" ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoB_1 = new javax.swing.ButtonGroup();
        grupoB_2 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        grupoB_Facturacion = new javax.swing.ButtonGroup();
        cajaNombre = new javax.swing.JTextField();
        cajaDNI = new javax.swing.JTextField();
        cajaDir = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        rbDelivery = new javax.swing.JRadioButton();
        rbTienda = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbTarjeta = new javax.swing.JRadioButton();
        rbEfectivo = new javax.swing.JRadioButton();
        comboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        botonBoleta = new javax.swing.JRadioButton();
        botonFactura = new javax.swing.JRadioButton();
        cajaRUC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel5.setText("Agregar Propina (S/.1.50)");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Formulario");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        cajaDir.setEditable(false);
        cajaDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDirActionPerformed(evt);
            }
        });

        botonAceptar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\admin\\Nueva carpeta\\AdminPro\\src\\main\\resources\\imagenes\\finalizar-la-sesion (1).png")); // NOI18N
        botonAceptar.setText("Finalizar");
        botonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAceptarMouseClicked(evt);
            }
        });
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Desktop\\admin\\Nueva carpeta\\AdminPro\\src\\main\\resources\\imagenes\\cancelar.png")); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarMouseClicked(evt);
            }
        });

        grupoB_1.add(rbDelivery);
        rbDelivery.setText("Delivery");
        rbDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDeliveryActionPerformed(evt);
            }
        });

        grupoB_1.add(rbTienda);
        rbTienda.setText("Tienda");
        rbTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTiendaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre de Cliente");

        jLabel2.setText("DNI");

        jLabel3.setText("Direccion");

        jLabel4.setText("Medio De antencion");

        grupoB_2.add(rbTarjeta);
        rbTarjeta.setText("Tarjeta ");

        grupoB_2.add(rbEfectivo);
        rbEfectivo.setText("Efectivo");
        rbEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEfectivoActionPerformed(evt);
            }
        });

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-None-", "Los olivos", "Comas", "Independencia", "Lima", "San Miguel", "Puente Piedra", "Breña", "Jesus Maria", "Rimac", "San Juan de Lurigancho ", "La Victoria", "Otros" }));
        comboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxItemStateChanged(evt);
            }
        });
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        jLabel6.setText("Metodo de Pago");

        check.setText("Propina(S/.5.00)");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        jLabel7.setText("Facturacion");

        grupoB_Facturacion.add(botonBoleta);
        botonBoleta.setText("Boleta");
        botonBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBoletaActionPerformed(evt);
            }
        });

        grupoB_Facturacion.add(botonFactura);
        botonFactura.setText("Factura");
        botonFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFacturaActionPerformed(evt);
            }
        });

        cajaRUC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaRUCActionPerformed(evt);
            }
        });

        jLabel9.setText("R.U.C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(166, 166, 166))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cajaDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                                    .addComponent(cajaNombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addComponent(rbDelivery)
                                        .addGap(41, 41, 41)
                                        .addComponent(rbTienda))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel6))
                                                    .addGap(8, 8, 8))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel8)
                                                    .addGap(18, 18, 18)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cajaDir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(rbTarjeta)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(rbEfectivo)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(check))
                                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(botonBoleta)
                                                    .addGap(46, 46, 46)
                                                    .addComponent(botonFactura))
                                                .addComponent(cajaRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbDelivery)
                    .addComponent(rbTienda)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rbTarjeta)
                    .addComponent(rbEfectivo)
                    .addComponent(check))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(botonBoleta)
                    .addComponent(botonFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void rbEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEfectivoActionPerformed

    private void rbDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDeliveryActionPerformed
        // TODO add your handling code here:
        cajaDir.setEnabled(true);
        comboBox.setEnabled(true);
    }//GEN-LAST:event_rbDeliveryActionPerformed

    private void cajaDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDirActionPerformed
  
    }//GEN-LAST:event_cajaDirActionPerformed

    private void rbTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTiendaActionPerformed
      cajaDir.setText("0");
      adicional=0;
      cajaDir.setEnabled(false);
      comboBox.setEnabled(false);
    }//GEN-LAST:event_rbTiendaActionPerformed

    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        // TODO add your handling code here:
        fomularioVentas.this.setVisible(false);
    }//GEN-LAST:event_botonCancelarMouseClicked

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
   
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAceptarMouseClicked
         boolean metodopago;
        try {
            //al pulsar este boton se pasara los datos obtenidos y se agregan a la variable TextFormulario para pasar a la impresion
                
           if(rbTarjeta.isSelected()){
              metodopago=true;
           }else metodopago=false;
           if(rbTienda.isSelected())
               direccion="||En TIENDA||";
          Cliente cliente= new Cliente(this.cajaNombre.getText(), metodopago, this.cajaDNI.getText(),direccion);
          if(botonFactura.isSelected()){
              textFormulario="\n*******FACTURA*********\n";
        }else textFormulario="\n*******BOLETA DE VENTA*********\n";
        textFormulario+=cliente.toString();
          if(botonFactura.isSelected())
          {
        textFormulario+="R.U.C:"+cajaRUC.getText();
        }
        if(check.isSelected()){
            adicional+=5;
            textFormulario+="\n\nPropina agregada S/.1.50";
            }       
        //////////lo que se ira a la DB
        LocalDate fecha=LocalDate.now();
            ps=database.getConect().prepareStatement("INSERT INTO venta VALUES (null,?,?,?,?)");
            ps.setDate(1,java.sql.Date.valueOf(java.time.LocalDate.now()));
            ps.setString(2, cliente.getNombre());
            ps.setFloat(3, panelVenderProducto.subtotal+adicional);//total
            ps.setInt(4, panelVenderProducto.admin.getVendedores().get(indice).getId());//id
            ps.executeUpdate();
            ps.close();
         insertarDetalleVenta();
         database.getConect().close();
        panelDeImpresion c=new panelDeImpresion();
        c.setVisible(true);
                   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Algo ha salido mal con la venta. \nError:"+ex.toString());
        }
       
    }//GEN-LAST:event_botonAceptarMouseClicked

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed

    }//GEN-LAST:event_comboBoxActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkActionPerformed

    private void comboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxItemStateChanged
      String selected=(String)comboBox.getSelectedItem();//segun la seleccion sera cambiado el precio del envio
      switch(selected){
          case "Los olivos":cajaDir.setText("S/5");adicional=5;
              break;
          case "Comas":cajaDir.setText("S/5");adicional=5;
              break;
          case "Independencia":cajaDir.setText("S/8");adicional=8;
              break;
          case "Lima":cajaDir.setText("S/10");adicional=10;
              break;
          case "San Miguel":cajaDir.setText("S/12");adicional=12;
              break;
          case "Puente Piedra":cajaDir.setText("S/12");adicional=12;
              break;
          case "Breña":cajaDir.setText("S/15");adicional=15;
              break;
          case "Jesus Maria":cajaDir.setText("S/17");adicional=17;
              break;
          case "Rimac":cajaDir.setText("S/11");adicional=11;
              break;
          case "San Juan de Lurigancho":cajaDir.setText("S/11");adicional=11;
              break;
          case "La Victoria":cajaDir.setText("S/18");adicional=18;
              break;
          case "Otros":cajaDir.setText("S/22");adicional=22;
              break;
          default: cajaDir.setText(""); break;
      }
      direccion=selected+"  "+cajaDir.getText();//segun la direccion, esta sera almacenara para mostrar en la boleta
    }//GEN-LAST:event_comboBoxItemStateChanged

    private void cajaRUCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaRUCActionPerformed
;
    }//GEN-LAST:event_cajaRUCActionPerformed

    private void botonFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacturaActionPerformed
   this.cajaRUC.setEnabled(true);
    }//GEN-LAST:event_botonFacturaActionPerformed

    private void botonBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBoletaActionPerformed
    this.cajaRUC.setEnabled(false);
    this.cajaRUC.setText("");
    }//GEN-LAST:event_botonBoletaActionPerformed
    

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
                new fomularioVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JRadioButton botonBoleta;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JRadioButton botonFactura;
    private javax.swing.JTextField cajaDNI;
    private javax.swing.JTextField cajaDir;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaRUC;
    private javax.swing.JCheckBox check;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.ButtonGroup grupoB_1;
    private javax.swing.ButtonGroup grupoB_2;
    private javax.swing.ButtonGroup grupoB_Facturacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbDelivery;
    private javax.swing.JRadioButton rbEfectivo;
    private javax.swing.JRadioButton rbTarjeta;
    private javax.swing.JRadioButton rbTienda;
    // End of variables declaration//GEN-END:variables

    private void insertarDetalleVenta() {
     try {
          int indexAux=0,cantAux=0,idVenta;
          PreparedStatement ps_iV=database.getConect().prepareStatement("SELECT * FROM venta ORDER BY idVenta DESC");
          ResultSet rs=ps_iV.executeQuery();
          rs.next();
          System.out.println(rs.getInt("idVenta"));
          idVenta=rs.getInt("idVenta");
          JOptionPane.showMessageDialog(null,"rs listo: id->");
          rs.close();
          ps_iV.close();
            
                                                                                  //id,preU,descr,cant,idPro,idVenta                                                       
          PreparedStatement ps_=database.getConect().prepareStatement("INSERT INTO detalleventa VALUES(null,?,?,?,?,?)");
          for(int i=0;i<panelVenderProducto.carrito.size();i++){                               
          indexAux=panelVenderProducto.carrito.get(i);  
          cantAux=panelVenderProducto.cantidades.get(i);
            ps_.setFloat(1, panelVenderProducto.admin.getVendedores().get(indice).getListaProducto().get(indexAux).getPrecio());
            ps_.setString(2, panelVenderProducto.admin.getVendedores().get(indice).getListaProducto().get(indexAux).getDescipcion());
            ps_.setInt(3, cantAux);
            ps_.setInt(4, panelVenderProducto.admin.getVendedores().get(indice).getListaProducto().get(indexAux).getCodigo());
            ps_.setInt(5, idVenta); 
            ps_.executeUpdate();
            }
          
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Algo ha salido mal en el formulario \nError:"+ex.toString());
      }
      
    }
}

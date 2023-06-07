
package proyecto_1;

import javax.swing.JOptionPane;


public class registrarNuevoVendedor extends javax.swing.JInternalFrame {
    private String codigo="";
    public registrarNuevoVendedor() {
        initComponents();
        this.cajaNombre.setText("");
        this.cajaEdad.setText("");
        this.cajaSueldo.setText("");
        this.cajaApellido.setText("");
        this.cajaCodigo.setText("");
        this.botonAceptar.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cajaSueldo = new javax.swing.JTextField();
        cajaNombre = new javax.swing.JTextField();
        cajaEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cajaApellido = new javax.swing.JTextField();
        botonGenera = new javax.swing.JButton();
        cajaCodigo = new javax.swing.JLabel();

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        botonAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonAceptarKeyPressed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Edad");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Sueldo");

        cajaEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaEdadActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido");

        botonGenera.setText("Generar Contraseña");
        botonGenera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGeneraActionPerformed(evt);
            }
        });
        botonGenera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonGeneraKeyPressed(evt);
            }
        });

        cajaCodigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)
                        .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cajaEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                                    .addComponent(cajaApellido)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajaSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonGenera))))))
                .addContainerGap(128, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAceptar)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAceptar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cajaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cajaSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(botonGenera, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cajaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonAceptarKeyPressed

    }//GEN-LAST:event_botonAceptarKeyPressed

    private void cajaEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaEdadActionPerformed
     this.cajaCodigo.setText(codigo);
    }//GEN-LAST:event_cajaEdadActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        try {
            //este boton obtiene los datos de las cajas de texto
       JOptionPane.showMessageDialog(null,"Vendedor Ingresado");        
       Admin admin=new Admin();
       String nombre=cajaNombre.getText();
       String apellido=cajaApellido.getText();
       int edad=Integer.parseInt(cajaEdad.getText());
       float sueldo=Float.parseFloat(cajaSueldo.getText());
       Vendedor vendedorAux=new Vendedor(sueldo, nombre, apellido, cajaCodigo.getText(), edad,0,true);//y esta sera creadas en la clase de Vendedor
       admin.vendedores.add(vendedorAux);//estas se añadiran a la coleccion vendedores
       admin.ActualizarVendedores(); //y finalmente se actualizan directamente a travez de la funcion 
        } catch (Exception e) {
             e.printStackTrace(); JOptionPane.showMessageDialog(null,"ERROR:"+e.toString()+"\nRellenar Correctamente los campos");
        }       
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonGeneraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonGeneraKeyPressed

    }//GEN-LAST:event_botonGeneraKeyPressed

    private void botonGeneraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGeneraActionPerformed
      //el codigo del usuario sera generado de la siguiente manera
        try{
        this.botonAceptar.setEnabled(true);
      this.cajaCodigo.setText("");
      char[] nombre=this.cajaNombre.getText().toCharArray();
      char[] apellido=this.cajaApellido.getText().toCharArray();
      //dos primeros caracteres del nombre
        codigo+=nombre[0];
      codigo+=nombre[1];
      //dos primeros caracteres del apellido
      codigo+=apellido[0];
      codigo+=apellido[1];
      codigo=codigo.toLowerCase();//estos se vuelven a minisculas
      codigo+=Integer.parseInt(this.cajaEdad.getText());//y se le añade su edad
      this.cajaCodigo.setText(codigo);//finalmete sera mostrado en la caja de texto
      } catch (Exception e) {
         e.printStackTrace(); JOptionPane.showMessageDialog(null,"ERROR:"+e.toString()+"\nRellenar Correctamente los campos");
      }
      
    }//GEN-LAST:event_botonGeneraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonGenera;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JLabel cajaCodigo;
    private javax.swing.JTextField cajaEdad;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaSueldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

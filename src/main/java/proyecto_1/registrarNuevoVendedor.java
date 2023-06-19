
package proyecto_1;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class registrarNuevoVendedor extends javax.swing.JInternalFrame {
    private String codigo="";
    private Admin admin=new Admin();
    
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
        jLabel6 = new javax.swing.JLabel();
        cajaUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cajaComision = new javax.swing.JTextField();

        getContentPane().setLayout(null);

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
        getContentPane().add(botonAceptar);
        botonAceptar.setBounds(330, 410, 72, 23);

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 44, 16);

        jLabel2.setText("Edad");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 113, 26, 16);

        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 410, 60, 16);

        jLabel4.setText("Comision");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 230, 60, 16);

        cajaSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaSueldoActionPerformed(evt);
            }
        });
        getContentPane().add(cajaSueldo);
        cajaSueldo.setBounds(70, 150, 351, 22);
        getContentPane().add(cajaNombre);
        cajaNombre.setBounds(67, 30, 354, 22);

        cajaEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaEdadActionPerformed(evt);
            }
        });
        getContentPane().add(cajaEdad);
        cajaEdad.setBounds(70, 110, 354, 22);

        jLabel5.setText("Apellido");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 73, 44, 16);
        getContentPane().add(cajaApellido);
        cajaApellido.setBounds(70, 70, 354, 22);

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
        getContentPane().add(botonGenera);
        botonGenera.setBounds(70, 280, 134, 53);

        cajaCodigo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(cajaCodigo);
        cajaCodigo.setBounds(100, 390, 143, 64);

        jLabel6.setText("Sueldo");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(13, 153, 36, 16);
        getContentPane().add(cajaUsuario);
        cajaUsuario.setBounds(70, 190, 351, 22);

        jLabel7.setText("Usuario");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 190, 40, 16);
        getContentPane().add(cajaComision);
        cajaComision.setBounds(70, 230, 351, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonAceptarKeyPressed

    }//GEN-LAST:event_botonAceptarKeyPressed

    private void cajaEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaEdadActionPerformed
     this.cajaCodigo.setText(codigo);
    }//GEN-LAST:event_cajaEdadActionPerformed
        SQLCon database= new SQLCon();
        PreparedStatement ps=null;
        ResultSet rs=null; 
        
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        /*try {
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
        }  */
       
        
       String nombre=cajaNombre.getText();
       String apellido=cajaApellido.getText();
       String usuario=cajaUsuario.getText();
       int comi=Integer.parseInt(cajaComision.getText());
       int edad=Integer.parseInt(cajaEdad.getText());
       float sueldo=Float.parseFloat(cajaSueldo.getText());
       
        Vendedor v = new Vendedor(sueldo, nombre, apellido, usuario, cajaCodigo.getText(), edad,comi,true);
        try {
        admin.addVendedor(v);
        System.out.println("Trabajador registrado correctamente.");
        }catch (SQLException e){
        System.out.println("Error al registrar el Trabajador: " + e.getMessage());
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

    private void cajaSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaSueldoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonGenera;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JLabel cajaCodigo;
    private javax.swing.JTextField cajaComision;
    private javax.swing.JTextField cajaEdad;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaSueldo;
    private javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}

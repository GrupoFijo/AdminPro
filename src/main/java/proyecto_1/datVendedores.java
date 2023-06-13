
package proyecto_1;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class datVendedores extends javax.swing.JInternalFrame {
    private Admin admin=new Admin();
    public datVendedores() throws SQLException {
        initComponents();
        mostrar();
    }
     
    
    public void mostrar() throws SQLException{
        
        SQLCon database= new SQLCon();
        PreparedStatement ps=null;
        ResultSet rs=null; 
        
        try{
    
        ps=database.getConect().prepareStatement("SELECT*FROM trabajador");
        rs=ps.executeQuery();
        
        /*String matriz[][]=new String[admin.getVendedores().size()][7];
        float aux1,aux2;
        String tetxAux="\n";
        for(int i=0;i<admin.getVendedores().size();i++){//matriz sera creada a partir de los atributos de vada vendedor
            //solo los campos de sueldo y actividad pueden ser modificables
            if(admin.getVendedores().get(i).getComisiones()<25)
            tetxAux+=admin.getVendedores().get(i).getNombre()+" "+admin.getVendedores().get(i).getApellido();
            tetxAux+="\n";
            
            matriz[i][0]=admin.getVendedores().get(i).getNombre();
            matriz[i][1]=admin.getVendedores().get(i).getApellido();
            matriz[i][2]=Integer.toString(admin.getVendedores().get(i).getEdad());
            matriz[i][3]=Float.toString(admin.getVendedores().get(i).getSueldo());
            aux1=admin.getVendedores().get(i).getSueldo();
            matriz[i][4]=Integer.toString(admin.getVendedores().get(i).getComisiones());
            aux2=admin.getVendedores().get(i).getComisiones();
            matriz[i][5]=Float.toString(aux1+(aux2*10));
            matriz[i][6]=Boolean.toString(admin.getVendedores().get(i).isActivo());*/
        
       int numRows = 0;
        while (rs.next()) {//avanza en la puntero, pero solo en el while
            numRows++;
        }
     
      rs=ps.executeQuery();
        String matriz[][] = new String[numRows][7];
        int row = 0;
        float aux1,aux2;
        String tetxAux="\n";
        
        while (rs.next()) {
            matriz[row][0] = rs.getString("nombre");
            matriz[row][1] = rs.getString("apellido");
            matriz[row][2] = Integer.toString(rs.getInt("edad"));
            matriz[row][3] = Float.toString(rs.getFloat("sueldo"));
            matriz[row][4] = Integer.toString(rs.getInt("comision"));
            aux1 = rs.getFloat("sueldo");
            aux2 = rs.getInt("comision");
            float total = aux1 + (aux2 * 10);
            matriz[row][5] = Float.toString(total);
            matriz[row][6] = Boolean.toString(rs.getBoolean("activo"));
            row++;
        }
           
        this.cajaComision.setText(tetxAux);
        tabla.setModel(new javax.swing.table.DefaultTableModel(//la matriz sera agregada a una tabla por defecto
            matriz,
            new String [] {
                "Nombre", "Apellido", "Edad", "Sueldo", "Comisiones", "Total", "Activo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, true
            };
     
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
            }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos\n"+e.getLocalizedMessage());    
        }
        
      }
        
        

        
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        boton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cajaComision = new javax.swing.JTextArea();
        label2 = new javax.swing.JLabel();

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Edad", "Sueldo", "Comisiones", "Total", "Activo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setToolTipText("");
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setText("ADVERTENCIA: Si esta actualizando un campo, no cerrar esta Ventana!");

        boton.setText("Actualizar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        boton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botonKeyPressed(evt);
            }
        });

        cajaComision.setEditable(false);
        cajaComision.setColumns(20);
        cajaComision.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cajaComision.setForeground(new java.awt.Color(255, 51, 51));
        cajaComision.setRows(5);
        jScrollPane2.setViewportView(cajaComision);

        label2.setText("Usuarios con comisiones menores al record(25):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(boton)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActionPerformed

    private void botonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonKeyPressed
     boolean auxActivo;
     float auxSueldo;
     //obtiene los datos actualizados de los campos de sueldo y activo, y seran actualizados directamente
        try {
     for(int i=0;i<admin.getVendedores().size();i++){
         auxSueldo=Float.valueOf((String)tabla.getValueAt(i, 3));
         auxActivo=Boolean.valueOf((String)tabla.getValueAt(i, 6));
         admin.getVendedores().get(i).setActivo(auxActivo);
         admin.getVendedores().get(i).setSueldo(auxSueldo);
     }
        admin.ActualizarVendedores();
        } catch (Exception e) {
             e.printStackTrace();JOptionPane.showMessageDialog(null, "oh!, Algo ha salido mal!\nNo se a podido Actualizar, Revise los campos");
            //si hay un error dentro de la lectura entonces se lanzara una excepxion
        }
    }//GEN-LAST:event_botonKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JTextArea cajaComision;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}

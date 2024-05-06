/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfas.de.gestion.de.pasajes;

import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Luis Llamas
 */
public class Resgistro extends javax.swing.JFrame {

    /**
     * Creates new form Resgistro
     */
    public Resgistro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Registro3 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        jSeparator49 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        jSeparator50 = new javax.swing.JSeparator();
        jLabel65 = new javax.swing.JLabel();
        campoApellido = new javax.swing.JTextField();
        jSeparator51 = new javax.swing.JSeparator();
        jLabel66 = new javax.swing.JLabel();
        campoSexo = new javax.swing.JComboBox<>();
        jSeparator52 = new javax.swing.JSeparator();
        jLabel67 = new javax.swing.JLabel();
        jSeparator53 = new javax.swing.JSeparator();
        jLabel68 = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        jSeparator54 = new javax.swing.JSeparator();
        jLabel69 = new javax.swing.JLabel();
        jSeparator55 = new javax.swing.JSeparator();
        jLabel70 = new javax.swing.JLabel();
        jSeparator56 = new javax.swing.JSeparator();
        btnCrearCuenta = new javax.swing.JButton();
        selectorFecha = new com.toedter.calendar.JDateChooser();
        campoContraseña = new javax.swing.JPasswordField();
        campoRepetirContraseña = new javax.swing.JPasswordField();
        campoNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        btnRegresar.setBackground(new java.awt.Color(153, 204, 255));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/esquema-de-boton-circular-de-flecha-hacia-atras-izquierda.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Registro3.setBackground(new java.awt.Color(204, 204, 255));
        Registro3.setForeground(new java.awt.Color(51, 51, 51));

        jLabel61.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel61.setText("Registro de usuarios");

        jLabel63.setText("Cedula de identidad");

        campoCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCedulacampoCedulaActionPerformed(evt);
            }
        });

        jLabel64.setText("Nombres");

        jLabel65.setText("Apellidos");

        campoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoApellidocampoApellidoActionPerformed(evt);
            }
        });

        jLabel66.setText("Sexo");

        campoSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ejile un Sexo...", "Hombre", "Mujer" }));
        campoSexo.setToolTipText("");
        campoSexo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                campoSexocampoSexoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        campoSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSexocampoSexoActionPerformed(evt);
            }
        });

        jLabel67.setText("Fecha de nacimiento");

        jLabel68.setText("Correo");

        campoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorreoActionPerformed(evt);
            }
        });

        jLabel69.setText("Contraseña");

        jLabel70.setText("Repita su contraseña");

        btnCrearCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCrearCuenta.setText("Crear cuenta");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentabtnCrearCuentaActionPerformed(evt);
            }
        });

        campoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContraseñaActionPerformed(evt);
            }
        });

        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombrecampoNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Registro3Layout = new javax.swing.GroupLayout(Registro3);
        Registro3.setLayout(Registro3Layout);
        Registro3Layout.setHorizontalGroup(
            Registro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator50, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator51, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator49)
            .addComponent(jSeparator56, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator52, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator53, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator54, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Registro3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Registro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70)
                    .addComponent(campoRepetirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(291, 291, 291)
                .addComponent(jSeparator55, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE))
            .addGroup(Registro3Layout.createSequentialGroup()
                .addGroup(Registro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Registro3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel62))
                    .addGroup(Registro3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Registro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65)
                            .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67)
                            .addComponent(selectorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69)))
                    .addGroup(Registro3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Registro3Layout.setVerticalGroup(
            Registro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registro3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel61)
                .addGap(18, 18, 18)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator49, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator51, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator50, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Registro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jLabel66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator52, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectorFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator53, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator54, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addGroup(Registro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Registro3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jSeparator55, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Registro3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoRepetirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(jSeparator56, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(Registro3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(504, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCedulacampoCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCedulacampoCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCedulacampoCedulaActionPerformed

    private void campoNombrecampoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombrecampoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombrecampoNombreActionPerformed

    private void campoApellidocampoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoApellidocampoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoApellidocampoApellidoActionPerformed

    private void campoSexocampoSexoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_campoSexocampoSexoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSexocampoSexoAncestorAdded

    private void campoSexocampoSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSexocampoSexoActionPerformed
        
    }//GEN-LAST:event_campoSexocampoSexoActionPerformed

    private void btnCrearCuentabtnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentabtnCrearCuentaActionPerformed
        if(!validarCampoVacios(campoCedula,"La cedula es requerida")){
        
        return;
        } if(!validarCampoVacios(campoNombre,"El nombre es requerido")){
        
        return;}
        
         if(!validarCampoVacios(campoApellido,"El apellido es requerido")){
        
        return;}
        
         if(!validarCampoVacios(campoCorreo,"El campo correo es requerido")){
        
        return;}
        
         if(!validarCampoVacios(campoContraseña,"La contraseña es requerida")){
        
        return;}
         if(!validarCampoVacios(campoRepetirContraseña,"el campo repetir contraseña es requerido")){
        
        return;}
         char [] pass =  campoContraseña.getPassword();
         String clave1 = String.valueOf(pass);
         pass = campoRepetirContraseña.getPassword();
         String clave2 = String.valueOf(pass);
         if(!clave1.equals(clave2)){
             JOptionPane.showMessageDialog(this,"La Contraseña que ingreso debe ser la misma en el campo de repita contraseña ");
             
         }
         
       
        
      Date fechaNacimiento = selectorFecha.getDate();
      Date fechaActual = new Date();
      if(fechaNacimiento.compareTo(fechaActual)>= 0){
          JOptionPane.showMessageDialog(this,"La fecha escogida debe ser menor a la fecha actual");
          
      }
      
      int generPosicion= campoSexo.getSelectedIndex();
      if(generPosicion== 0){
         JOptionPane.showMessageDialog(this,"Debe escoger un genero");
          return;
      }
       
      
    }//GEN-LAST:event_btnCrearCuentabtnCrearCuentaActionPerformed

    private void campoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCorreoActionPerformed

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked

    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        InterfazDeGestionDePasajes mostrar = new InterfazDeGestionDePasajes();

        mostrar.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void campoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Resgistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resgistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resgistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resgistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resgistro().setVisible(true);
                return;
            }
        });
    }
    
    private boolean validarCampoVacios(JTextField campo, String mensaje){
        String dato = campo.getText();
        dato = dato.trim();
        if(dato.isEmpty()){
            JOptionPane.showMessageDialog(this,mensaje,"Validar",JOptionPane.ERROR_MESSAGE);
               return false;

        }
        return true;
    }
    
    
  
      
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Registro3;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JPasswordField campoContraseña;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JPasswordField campoRepetirContraseña;
    private javax.swing.JComboBox<String> campoSexo;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JSeparator jSeparator51;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JSeparator jSeparator54;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JSeparator jSeparator56;
    private com.toedter.calendar.JDateChooser selectorFecha;
    // End of variables declaration//GEN-END:variables

 
}

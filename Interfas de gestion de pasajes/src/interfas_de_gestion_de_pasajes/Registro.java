/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfas_de_gestion_de_pasajes;
import java.io.BufferedReader;
import java.io.File; 
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField; 

/**
 *
 * @author Luis Llamas
 */
public class Registro extends javax.swing.JFrame {


    /**
     * Creates new form Resgistro
     */
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void crear(){

  Clientes cliente = new Clientes();
        cliente.tarjetaIdentidad = campoTarjetaIdentidad.getText().trim();
        cliente.apellido = campoNombre.getText().trim();
        cliente.nombre = campoApellido.getText().trim();
        cliente.sexo = ""+campoSexo.getSelectedItem();
        cliente.fechaDeNacimiento = campoFechaDeNacimiento.getDate();
        cliente.email = campoCorreo.getText().trim();
        cliente.contraseña =  campoContraseña.getText().trim();
        String archivoCSV = "clientes.txt";
        String variableAComprobar = cliente.tarjetaIdentidad; 

        boolean existe = false;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(","); 

               
                if (datos.length > 0 && datos[0].equals(variableAComprobar)) {
                    existe = true;
                    break; 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (existe) {
        JOptionPane.showMessageDialog(this,"La tarjeta de indentidad ya se encuentra registrada"
                + "\n por favor ingrese inicie sesion o ingrese una distinte");
        } else {
            try {
                PrintWriter writer = new PrintWriter(new FileWriter("clientes.txt", true));
                // Escribir los datos en formato CSV
                writer.printf("%s,%s,%s,%s,%s,%s,%s%n",
                        cliente.tarjetaIdentidad,
                        cliente.nombre,
                        cliente.apellido,
                        cliente.sexo,
                        cliente.fechaDeNacimiento,
                        cliente.email,
                        cliente.contraseña); 
                writer.close();
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
                System.out.println("Datos guardados correctamente.");
            } catch (IOException ex) {
                System.err.println("Error al guardar los datos: " + ex.getMessage());
            }

        }
        
    }
    

    
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
        campoTarjetaIdentidad = new javax.swing.JTextField();
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
        campoFechaDeNacimiento = new com.toedter.calendar.JDateChooser();
        campoContraseña = new javax.swing.JPasswordField();
        campoRepetirContraseña = new javax.swing.JPasswordField();
        campoNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        btnRegresar.setBackground(new java.awt.Color(102, 102, 102));
        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
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

        Registro3.setBackground(new java.awt.Color(255, 255, 255));
        Registro3.setForeground(new java.awt.Color(51, 51, 51));

        jLabel61.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(102, 102, 102));
        jLabel61.setText("Registro de usuarios");

        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("Tarjeta de identidad:");

        campoTarjetaIdentidad.setBackground(new java.awt.Color(255, 255, 255));
        campoTarjetaIdentidad.setBorder(null);
        campoTarjetaIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTarjetaIdentidadcampoCedulaActionPerformed(evt);
            }
        });
        campoTarjetaIdentidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoTarjetaIdentidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTarjetaIdentidadKeyTyped(evt);
            }
        });

        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Nombres:");

        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("Apellidos:");

        campoApellido.setBackground(new java.awt.Color(255, 255, 255));
        campoApellido.setForeground(new java.awt.Color(0, 0, 0));
        campoApellido.setBorder(null);
        campoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoApellidocampoApellidoActionPerformed(evt);
            }
        });

        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("Sexo:");

        campoSexo.setBackground(new java.awt.Color(255, 255, 255));
        campoSexo.setForeground(new java.awt.Color(0, 0, 0));
        campoSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ejile un Sexo...", "Hombre", "Mujer" }));
        campoSexo.setToolTipText("");
        campoSexo.setBorder(new javax.swing.border.MatteBorder(null));
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

        jLabel67.setBackground(new java.awt.Color(255, 255, 255));
        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText("Fecha de nacimiento:");

        jLabel68.setForeground(new java.awt.Color(0, 0, 0));
        jLabel68.setText("Correo:");

        campoCorreo.setBackground(new java.awt.Color(255, 255, 255));
        campoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        campoCorreo.setBorder(null);
        campoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorreoActionPerformed(evt);
            }
        });

        jLabel69.setBackground(new java.awt.Color(255, 255, 255));
        jLabel69.setForeground(new java.awt.Color(0, 0, 0));
        jLabel69.setText("Contraseña:");

        jLabel70.setForeground(new java.awt.Color(0, 0, 0));
        jLabel70.setText("Repita su contraseña");

        btnCrearCuenta.setBackground(new java.awt.Color(255, 153, 51));
        btnCrearCuenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setText("Crear cuenta");
        btnCrearCuenta.setBorder(null);
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentabtnCrearCuentaActionPerformed(evt);
            }
        });

        campoFechaDeNacimiento.setBackground(new java.awt.Color(255, 255, 255));
        campoFechaDeNacimiento.setForeground(new java.awt.Color(0, 0, 0));

        campoContraseña.setBackground(new java.awt.Color(255, 255, 255));
        campoContraseña.setForeground(new java.awt.Color(0, 0, 0));
        campoContraseña.setBorder(null);
        campoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContraseñaActionPerformed(evt);
            }
        });

        campoRepetirContraseña.setBackground(new java.awt.Color(255, 255, 255));
        campoRepetirContraseña.setBorder(null);
        campoRepetirContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRepetirContraseñaActionPerformed(evt);
            }
        });

        campoNombre.setBackground(new java.awt.Color(255, 255, 255));
        campoNombre.setForeground(new java.awt.Color(0, 0, 0));
        campoNombre.setBorder(null);
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombrecampoNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Registro3Layout = new javax.swing.GroupLayout(Registro3);
        Registro3.setLayout(Registro3Layout);
        Registro3Layout.setHorizontalGroup(
            Registro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator54)
            .addComponent(jSeparator51)
            .addComponent(jSeparator50)
            .addComponent(jSeparator52)
            .addComponent(jSeparator53)
            .addGroup(Registro3Layout.createSequentialGroup()
                .addGroup(Registro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addComponent(jSeparator56, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Registro3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Registro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Registro3Layout.createSequentialGroup()
                                .addGroup(Registro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68)
                                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel69)
                                    .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel70)
                                    .addComponent(campoRepetirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel62))
                            .addComponent(jLabel61)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65)
                            .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67)
                            .addComponent(campoFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66))
                        .addGap(0, 277, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator49)
            .addGroup(Registro3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Registro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoTarjetaIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(campoTarjetaIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator54, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator51, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator50, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator52, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator53, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator49, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator55, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoRepetirContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator56, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addGap(29, 29, 29)
                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
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
                .addContainerGap(461, Short.MAX_VALUE))
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

    private void campoTarjetaIdentidadcampoCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTarjetaIdentidadcampoCedulaActionPerformed
        
    }//GEN-LAST:event_campoTarjetaIdentidadcampoCedulaActionPerformed

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
       
        if(!validarCampoVacios(campoTarjetaIdentidad,"La cedula es requerida")){
        
        return;}
        
        if(!validarCampoVacios(campoNombre,"El nombre es requerido")){
        
        return;}
        
        if(!validarCampoVacios(campoApellido,"El apellido es requerido")){
        
        return;}
        
         if(!validarCampoVacios(campoCorreo,"El campo correo es requerido")){
        
        return;}
         
        if(!validarCampoVacios(campoContraseña,"La contraseña es requerida")){
        
        return;}
        
         if(!validarCampoVacios(campoRepetirContraseña,"el campo repetir contraseña es requerido")){
       
        return;}
          int generPosicion= campoSexo.getSelectedIndex();
      if(generPosicion== 0){
         JOptionPane.showMessageDialog(this,"Debe escoger un genero");
          return;}
         
         char [] pass =  campoContraseña.getPassword();
         String clave1 = String.valueOf(pass);
         pass = campoRepetirContraseña.getPassword();
         String clave2 = String.valueOf(pass);
         if(!clave1.equals(clave2)){
             JOptionPane.showMessageDialog(this,"La Contraseña que ingreso debe ser la misma en el campo de repita contraseña ");
             return;}
         
         if(validarEmail(campoCorreo.getText())){
             return;}
   
         Date fechaNacimiento = campoFechaDeNacimiento.getDate();
Date fechaActual = new Date();

// Verificar si la fecha de nacimiento es posterior a la fecha actual
if (fechaNacimiento.compareTo(fechaActual) >= 0) {
    JOptionPane.showMessageDialog(this, "La fecha escogida debe ser menor a la fecha actual");
    return;
}

// Calcular la edad
long diferenciaEnMillisegundos = Math.abs(fechaActual.getTime() - fechaNacimiento.getTime());
long diferenciaEnAnios = diferenciaEnMillisegundos / (1000L * 60 * 60 * 24 * 365); // Aproximado

// Verificar si es mayor de 10 años
if (diferenciaEnAnios >= 10) {
    // Registrar al usuario (tu código existente)
} else {
    JOptionPane.showMessageDialog(this, "Debes ser mayor de 10 años para registrarte");
      return;
}

         
     /* Date fechaNacimiento = campoFechaDeNacimiento.getDate();
      Date fechaActual = new Date();
      if(fechaNacimiento.compareTo(fechaActual)>= 0){
          JOptionPane.showMessageDialog(this,"La fecha escogida debe ser menor a la fecha actual");
                    return;}*/
      
      
     
      
      
      crear();
         
        
      
     
      
      
      
      
       
      
    }//GEN-LAST:event_btnCrearCuentabtnCrearCuentaActionPerformed

    private void campoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCorreoActionPerformed

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked

    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        interfaz_Principal mostrar = new interfaz_Principal();

        mostrar.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void campoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContraseñaActionPerformed

    private void campoTarjetaIdentidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTarjetaIdentidadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTarjetaIdentidadKeyPressed


    private void campoTarjetaIdentidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTarjetaIdentidadKeyTyped
char tecla = evt.getKeyChar();

    // Permitir la tecla de retroceso (borrar)
    if (tecla == '\b') { // Código ASCII de la tecla de retroceso
        return; // No hacer nada, permitir borrar
    }

    if (!Character.isDigit(tecla)) {
        evt.consume();
        JOptionPane.showMessageDialog(this, "Solo puede ingresar números");
    }
    }//GEN-LAST:event_campoTarjetaIdentidadKeyTyped

    private void campoRepetirContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRepetirContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRepetirContraseñaActionPerformed

    /**
     * @param args the command line arguments
     */
      
    private boolean validarCampoVacios(JTextField campo, String mensaje){
        String dato = campo.getText();
        dato = dato.trim();
        if(dato.isEmpty()){
            JOptionPane.showMessageDialog(this,mensaje,"Validar",JOptionPane.ERROR_MESSAGE);
               return false;

        }
        return true;
    }
 private boolean validarEmail(String email) {
    // Expresión regular para validar el formato del email y los dominios permitidos
    String regex = "^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+\\.)*(com|co)$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);

    if (!matcher.matches()) {
        JOptionPane.showMessageDialog(this, "El email esta incorrecto al menos debe tener solo una arroba y terminar con .com .");
        return false;
    }

    // Validaciones adicionales (opcional)
    if (email.endsWith(".")) {
        JOptionPane.showMessageDialog(this, "El email no puede terminar en punto.");
        return false;
    }

    if (email.contains("..")) {
        JOptionPane.showMessageDialog(this, "El email no puede contener puntos consecutivos.");
        return false;
    }

    return true; // El email es válido
}


   /* private boolean validarEmail(String email){
         int cuentaArroba= 0;
        for(int i = 0 ;i < email.length();i++){
            char caracter = email.charAt(i);
            if(Character.isSpaceChar(caracter)){
                JOptionPane.showMessageDialog(this,"");
                        return false;
            } 
           
          
           
            if((caracter >= 33 && caracter <= 44)||(caracter == 47) || (caracter >= 58 && caracter <= 63)
                    || (caracter >= 58 && caracter <= 63) ||(caracter >= 91 && caracter <= 94)
                    || caracter == 96 || (caracter >= 123)){
                String mensaje = "letras, numeros, _ . @";
                JOptionPane.showMessageDialog(this,"El email solo puede tene "+ mensaje);
           return false;
            }
            
            if(email.startsWith("@") || email.endsWith("@") ){
                JOptionPane.showMessageDialog(this,"El email solo puede empezar "
                        + "o terminar con @");
                return false;
            }
              if (caracter == ('@')){
                ++ cuentaArroba;     
               return false;
            }
         
        }
         if (cuentaArroba < 1 || cuentaArroba > 1){
              
                JOptionPane.showMessageDialog(this,"El email solo puede tener un arroba");
                return false;
            }
        return true;
    }
  */
  
      
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Registro3;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JPasswordField campoContraseña;
    private javax.swing.JTextField campoCorreo;
    private com.toedter.calendar.JDateChooser campoFechaDeNacimiento;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JPasswordField campoRepetirContraseña;
    private javax.swing.JComboBox<String> campoSexo;
    private javax.swing.JTextField campoTarjetaIdentidad;
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
    // End of variables declaration//GEN-END:variables

 
}

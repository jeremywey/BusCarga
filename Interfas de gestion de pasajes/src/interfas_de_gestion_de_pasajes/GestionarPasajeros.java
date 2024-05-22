
package interfas_de_gestion_de_pasajes;
import java.io.BufferedWriter;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class GestionarPasajeros extends javax.swing.JFrame {
    int filas;
   DefaultTableModel modelo=new DefaultTableModel();
   DefaultTableModel mdlTabla;
    public GestionarPasajeros() {
        initComponents();
        
        modelo.addColumn("Cedula");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Nombre");
        modelo.addColumn("Genero");
        modelo.addColumn("Fecha_N");
        modelo.addColumn("Correo");
        refrescarLista();
    }
    
    public void refrescarLista(){
        tblusuarios2.setModel(modelo);
         File file = new File("clientes.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
               modelo.addRow(parts);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
}

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEtiquetas = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelClientes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblusuarios2 = new javax.swing.JTable();
        txt1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt6 = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panelBotones = new javax.swing.JPanel();
        btnAgregarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setText("Digita la cedula o Tarjeta de identidad del Usuario");

        javax.swing.GroupLayout panelEtiquetasLayout = new javax.swing.GroupLayout(panelEtiquetas);
        panelEtiquetas.setLayout(panelEtiquetasLayout);
        panelEtiquetasLayout.setHorizontalGroup(
            panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiquetasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelEtiquetasLayout.setVerticalGroup(
            panelEtiquetasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiquetasLayout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        tblusuarios2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Telefono", "id Tarjeta Virtual", "Saldo", "Email"
            }
        ));
        tblusuarios2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblusuarios2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblusuarios2);

        txt1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("Lista de Clientes");

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClientesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedula)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClientesLayout.createSequentialGroup()
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClientesLayout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 136, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelBotones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.red, java.awt.Color.red));
        panelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarCliente.setText("Agregar...");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        panelBotones.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        btnEditarCliente.setText("Editar...");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });
        panelBotones.add(btnEditarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        btnEliminarCliente.setText("Eliminar...");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        panelBotones.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
            .addComponent(panelEtiquetas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEtiquetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        Registro mostrar = new Registro();

        mostrar.setVisible(true);
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
       int a=JOptionPane.showConfirmDialog(this,"Deseas eliminar este Usurio?");
        if(a==0){
      this.modelo=(DefaultTableModel)tblusuarios2.getModel();
      modelo.removeRow(tblusuarios2.getSelectedRow());
      try{
          String archivo="Clientes.txt";
          BufferedWriter bw=new BufferedWriter(new FileWriter(archivo));
          for(int i=0; i<tblusuarios2.getRowCount();i++){
          for(int j=0;j<tblusuarios2.getColumnCount();j++){
              bw.write((String)(tblusuarios2.getValueAt(i,j)));
              if(j<tblusuarios2.getColumnCount()-1){
              bw.write(",");
              }
          }
          bw.newLine();
          }
          bw.close();
          JOptionPane.showMessageDialog(this,"Usuario eliminado con exito");
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      }
        }else if(a==1){
     
      JOptionPane.showMessageDialog(this,"Este Usuario no se elimino");
        }else{
        JOptionPane.showMessageDialog(this,"Cancelaste la operacion");
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void tblusuarios2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblusuarios2MouseClicked
      this.mdlTabla = (DefaultTableModel) tblusuarios2.getModel();
        int seleccion = tblusuarios2.getSelectedRow();
        txt1.setText(tblusuarios2.getValueAt(seleccion, 0).toString());
        txt2.setText(tblusuarios2.getValueAt(seleccion, 1).toString());
        txt3.setText(tblusuarios2.getValueAt(seleccion, 2).toString());
        txt4.setText(tblusuarios2.getValueAt(seleccion, 3).toString());
        txt5.setText(tblusuarios2.getValueAt(seleccion, 4).toString());
        txt6.setText(tblusuarios2.getValueAt(seleccion, 5).toString());
        filas = seleccion;

    }//GEN-LAST:event_tblusuarios2MouseClicked

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
    int a = JOptionPane.showConfirmDialog(this, "Deseas actualizar este Usuaario?");
        if (a == 0) {
            String[] datos = new String[6];
            datos[0] = txt1.getText();
            datos[1] = txt2.getText();
            datos[2] = txt3.getText();
            datos[3] = txt4.getText();
            datos[4] = txt5.getText();
            datos[5] = txt6.getText();
            if (datos[0].isEmpty() && datos[1].isEmpty() && datos[2].isEmpty() && datos[3].isEmpty() && datos[4].isEmpty() && datos[5].isEmpty() || datos[0].isEmpty() || datos[1].isEmpty() || datos[2].isEmpty() || datos[3].isEmpty() || datos[4].isEmpty() || datos[5].isEmpty()) {
                JOptionPane.showMessageDialog(null, "Datos insuficientes");
            } else {
                for (int k = 0; k < tblusuarios2.getColumnCount(); k++) {
                    tblusuarios2.setValueAt(datos[k], filas, k);
                }
                try {
                    String archivo = "Clientes.txt";
                    BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
                    for (int i = 0; i < tblusuarios2.getRowCount(); i++) {
                        for (int j = 0; j < tblusuarios2.getColumnCount(); j++) {

                            bw.write((String) (tblusuarios2.getValueAt(i, j)));
                            if (j < tblusuarios2.getColumnCount() - 1) {
                                bw.write(",");
                            }
                        }
                        bw.newLine();

                    }
                    bw.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                txt5.setText("");
                txt6.setText("");
            }
        } else if (a == 1) {

            JOptionPane.showMessageDialog(this, "Este Usuario no se actualizo");
        } else {
            JOptionPane.showMessageDialog(this, "Cancelaste la operacion");
        }

    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
         buscarCliente(txtCedula.getText());
    }//GEN-LAST:event_txtCedulaKeyReleased

 public void buscarCliente(String buscar){
        Metodos metodo = new Metodos();
        
        DefaultTableModel modelo = metodo.buscarClientes(buscar);
        tblusuarios2.setModel(modelo);
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionarPasajeros().setVisible(true);
            }
        });
    }
    
    
    
    public void habilitarBotones(boolean habilitar){
       
        btnEliminarCliente.setEnabled(habilitar);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelEtiquetas;
    public javax.swing.JTable tblusuarios2;
    private javax.swing.JLabel txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}

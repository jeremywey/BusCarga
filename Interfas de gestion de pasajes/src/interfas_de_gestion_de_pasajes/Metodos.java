/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfas_de_gestion_de_pasajes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nadir
 */
public class Metodos {
    public DefaultTableModel buscarClientes(String buscar) {
        DefaultTableModel modelo = new DefaultTableModel(null, new String[]{"Cedula", "Nombre", "Apellidos", "Direccion", "Correo", "Telefono"});

        String archivoCSV = "clientes.txt"; 
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivoCSV))) {
            String linea;
            while ((linea = br.readLine()) != null) {
             String[] datos = linea.split(",");

             
               if (Stream.of(datos).anyMatch(dato -> dato.toLowerCase().contains(buscar.toLowerCase()))) {
                  modelo.addRow(datos);
                }
            }
       } catch (IOException e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, "Error al leer el archivo CSV: " + e.getMessage());
        }

     return modelo;
    }
}

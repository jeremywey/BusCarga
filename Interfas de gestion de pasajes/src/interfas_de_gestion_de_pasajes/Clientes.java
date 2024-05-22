/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfas_de_gestion_de_pasajes;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author JEREMY
 */
public class Clientes {
public static String tarjetaIdentidad;
public String nombre;
public String apellido;
public String sexo;
public Date fechaDeNacimiento;
public String email;
public static String contraseña;

public static HashMap<String, Clientes> clientesbd;

public String getTarjetaIdentidad(){
return tarjetaIdentidad;
}

public String getContraseña(){
return contraseña;
}

    
}




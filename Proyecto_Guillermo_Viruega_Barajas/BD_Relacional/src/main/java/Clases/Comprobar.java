/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import BD.Conexion;
import static BD.Conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

/**
 *
 * @author willy
 */
public class Comprobar {
    Connection conexion1 =  getConexion();
            public  static  boolean     comprobarUsuario (String dni ,String nombre, String apellidos , String calle  ) throws Exception {
         int verificar =0 ;
      Pattern comprobardni = Pattern.compile("(/^[0-9]+([.][0-9]+)?$/)"); 
           Pattern comprobarnombre = Pattern.compile("[a-zA-Z]{5,10}");
                Pattern comprobarapellido = Pattern.compile("[a-zA-Z]{5,10}");
                if (comprobardni.equals(dni) && comprobarapellido.equals(apellidos) && comprobarnombre.equals(nombre)) {
                    return true;
                          
                  
                }
                else {
                throw new Exception("los patrones son incorrectos vuelve a meterlos ");
                    
                }
           
                        
    }
      public   static boolean   buscarUsuario(Connection conexion , String dni){
          
      PreparedStatement ps;
      ResultSet rs;
      Boolean dniEncontrado = false;
          try {
              String SQL = "SELECT * FROM usuario WHERE dni =?;";
              ps=(PreparedStatement) conexion.prepareStatement(SQL, ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
              ps.setString(1, dni );
              rs = ps.executeQuery();
           
              if (dniEncontrado) {
                       return dniEncontrado=true;
                  
                 
              }
             
          } catch (Exception e) {
              
          }
          return dniEncontrado;
      }}
      

      
      
   


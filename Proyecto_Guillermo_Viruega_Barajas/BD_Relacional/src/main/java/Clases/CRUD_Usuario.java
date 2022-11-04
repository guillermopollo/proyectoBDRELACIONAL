/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import static BD.Conexion.getConexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;



/**
 *
 * @author willy
 */
public class CRUD_Usuario {
    
    public static void insertarUsuario(Connection con, Persona p1)  {
     PreparedStatement ps;  
     String sql;
     
     try {
             sql = "insert into Persona(dni, nombre, apellidos , calle) values(?, ?, ?,?)";
             ps = con.prepareStatement(sql);
         
            ps.setString(1,p1.getDni());
            ps.setString(2, p1.getNombre());
            ps.setString(3, p1.getApellidos());
             ps.setString(3, p1.getCalle());
            ps.executeUpdate();
           
            
        } catch (SQLException e) {
            System.out.print("ERROR AL INSERTAR");
        }}
    public static void insertarPrenda(Connection con, Prenda p1)  {
     PreparedStatement ps;  
     String sql;
     
     try {
             sql = "insert into Persona(TipoPrenda , Talla , Codigo , dni) values(?, ?, ?)";
             ps = con.prepareStatement(sql);
         
            ps.setString(1,p1.getTipoPrenda());
            ps.setString(2, p1.getTalla());
            ps.setString(3, p1.getCodigo());
              ps.setString(3, p1.getDni());

            ps.executeUpdate();
           
            
        } catch (SQLException e) {
            System.out.print("ERROR AL INSERTAR");
        }}
    public static ObservableList<Prenda> getPrenda(String dni) {
        Connection con;
        con=getConexion();
        ObservableList <Prenda> listaTabla;
        listaTabla = FXCollections.observableArrayList();

        try {
            PreparedStatement ps = con.prepareStatement("SELECT * from prenda WHERE dni "   +dni);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                listaTabla.add(new Prenda(rs.getString("dni"), rs.getString("tipoprenda")));

            }
        } catch (SQLException ex) {
          
        }
        
        return listaTabla;
    }
    
}

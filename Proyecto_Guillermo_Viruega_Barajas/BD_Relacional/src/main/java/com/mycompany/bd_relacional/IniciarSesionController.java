/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.bd_relacional;

import static BD.Conexion.getConexion;
import Clases.Comprobar;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author willy
 */
public class IniciarSesionController implements Initializable {
 @FXML
    private Button volver;
      @FXML
    private Button iniciarsesion;

      @FXML
      private TextField Dni;

        Connection conexion1 =  getConexion();
      @FXML
       private void   IniciarSesion() throws IOException, Exception { 
       
             if ( Comprobar.buscarUsuario(conexion1, Dni.getText()) == true){
                 VariablesLogin.setDni(Dni.getText());
                Stage stage = new Stage();
         Parent root = FXMLLoader.load(getClass().getResource("secondary.fxml"));
        Scene scene = new Scene(root);
        stage = new Stage(StageStyle.DECORATED);
        stage.setScene(scene);
        stage.show();
        

        Stage loginStage = (Stage) this.iniciarsesion.getScene().getWindow();
        loginStage.close();}
             else {
              throw new Exception("el usuario no se ha encontrado ");
             }
   
    }
        @FXML
       private void   Volver() throws IOException, Exception { 
       

                Stage stage = new Stage();
         Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        Scene scene = new Scene(root);
        stage = new Stage(StageStyle.DECORATED);
        stage.setScene(scene);
        stage.show();
        

        Stage loginStage = (Stage) this.volver.getScene().getWindow();
        loginStage.close();}

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
   
    }

    
    


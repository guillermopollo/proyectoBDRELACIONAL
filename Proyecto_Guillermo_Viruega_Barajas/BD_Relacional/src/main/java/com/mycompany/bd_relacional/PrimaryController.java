package com.mycompany.bd_relacional;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class PrimaryController {
    @FXML
    private Button Registrarse ;
      @FXML
    private Button Iniciarsesion;
    
    @FXML
    private void Registrar() throws IOException { 
        Stage stage = new Stage();
         Parent root = FXMLLoader.load(getClass().getResource("RegistrarUsuario.fxml"));
        Scene scene = new Scene(root);
        stage = new Stage(StageStyle.DECORATED);
        stage.setScene(scene);
        stage.show();
        
        //Para cerrar el login
        Stage loginStage = (Stage) this.Registrarse.getScene().getWindow();
        loginStage.close();
    }
    
     @FXML
    private void InicioSesion() throws IOException { 
        Stage stage = new Stage();
         Parent root = FXMLLoader.load(getClass().getResource("IniciarSesion.fxml"));
        Scene scene = new Scene(root);
        stage = new Stage(StageStyle.DECORATED);
        stage.setScene(scene);
        stage.show();
        
        //Para cerrar el login
        Stage loginStage = (Stage) this. Iniciarsesion.getScene().getWindow();
        loginStage.close();
    }
}

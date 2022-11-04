package com.mycompany.bd_relacional;


import static BD.Conexion.getConexion;
import Clases.CRUD_Usuario;
import Clases.Comprobar;
import Clases.Persona;
import Clases.Prenda;
import java.io.IOException;
import java.sql.Connection;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SecondaryController {
     Connection conexion1 =  getConexion();
  @FXML
      private TextField CodigoPrenda;
          @FXML
      private TextField TallaPrenda;
            @FXML
      private TextField TipoPrenda ;
            @FXML
    private Button guardarprenda;
      @FXML
    private Button consultarprendas;
       @FXML
    private Button salirsesion;
       
@FXML
    public    void    GuardarPrenda() throws IOException { 
        

      Prenda p2 = new Prenda(CodigoPrenda.getText(),TallaPrenda.getText(),TipoPrenda.getText(),VariablesLogin.getDni());
      CRUD_Usuario.insertarPrenda(conexion1, p2);

       
        
        
    }
    @FXML
    public    void    ConsultarPrendas() throws IOException { 
   
        Stage stage = new Stage();
         Parent root = FXMLLoader.load(getClass().getResource("consultarprendas.fxml"));
        Scene scene = new Scene(root);
        stage = new Stage(StageStyle.DECORATED);
        stage.setScene(scene);
        stage.show();
           Stage loginStage = (Stage) this.consultarprendas.getScene().getWindow();
        loginStage.close();    
    }
     @FXML
    private void SalirSesion () throws IOException { 
        Stage stage = new Stage();
         Parent root = FXMLLoader.load(getClass().getResource("IniciarSesion.fxml"));
        Scene scene = new Scene(root);
        stage = new Stage(StageStyle.DECORATED);
        stage.setScene(scene);
        stage.show();
        
        //Para cerrar el login
        Stage loginStage = (Stage) this.salirsesion.getScene().getWindow();
        loginStage.close();
    }
    }

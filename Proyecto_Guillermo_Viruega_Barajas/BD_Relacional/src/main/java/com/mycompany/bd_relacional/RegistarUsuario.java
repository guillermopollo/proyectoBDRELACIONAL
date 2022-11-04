package com.mycompany.bd_relacional;
import static BD.Conexion.getConexion;
import Clases.CRUD_Usuario;
import Clases.Comprobar;
import Clases.Persona;
import java.io.IOException;
import java.sql.Connection;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RegistarUsuario {
    @FXML
    private Button RegistrarGuardar;
      @FXML
    private Button RegistarBorrar;
        @FXML
    private Button SALIR;
      @FXML
    private Button Iniciarsesion;
      @FXML
      private TextField DNI;
        @FXML
      private TextField Nombre;
          @FXML
      private TextField Apellidos;
            @FXML
      private TextField Calle;
      
    Connection conexion1 =  getConexion();
    @FXML
    public    void    RegistrarGuardar() throws IOException {    
        try {
          
              if (  Comprobar.comprobarUsuario(DNI.getText(),Nombre.getText(),Apellidos.getText(),Calle.getText() )){
              Persona p1 = new Persona(DNI.getText(),Nombre.getText(),Apellidos.getText(),Calle.getText());
              CRUD_Usuario.insertarUsuario(conexion1, p1);
              }
                
                
                
           
        } catch (Exception e) {
        }
       
        
        //Para cerrar el login
        Stage loginStage = (Stage) this.Iniciarsesion.getScene().getWindow();
        loginStage.close();
    }
      @FXML
    public    void   RegistrarBorrar () throws IOException {    
       DNI.setText(null);
       Apellidos.setText(null);
       Nombre.setText(null);
       Calle.setText(null);
       
    }
    @FXML
    public    void   Salir () throws IOException {    
 Stage stage = new Stage();
         Parent root = FXMLLoader.load(getClass().getResource("primary.fxml"));
        Scene scene = new Scene(root);
        stage = new Stage(StageStyle.DECORATED);
        stage.setScene(scene);
        stage.show();
        
     
        Stage loginStage = (Stage) this.SALIR.getScene().getWindow();
        loginStage.close();
       
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.bd_relacional;

import Clases.CRUD_Usuario;
import Clases.Prenda;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author willy
 */
public class ConsultarprendasController implements Initializable {
       @FXML
    private Button volveratras;
      @FXML
    private TableView <Prenda> tablaprenda;
       @FXML
    private TableColumn <Prenda,String> col1;
        private TableColumn <Prenda,String> col2;
        
     @FXML
    private void VolverAtras () throws IOException { 
        Stage stage = new Stage();
         Parent root = FXMLLoader.load(getClass().getResource("secondary.fxml"));
        Scene scene = new Scene(root);
        stage = new Stage(StageStyle.DECORATED);
        stage.setScene(scene);
        stage.show();
        
        //Para cerrar el login
        Stage loginStage = (Stage) this.volveratras.getScene().getWindow();
        loginStage.close();
    }
    @Override
    
    public void initialize(URL url, ResourceBundle rb) {
        String dni = VariablesLogin.getDni();
        tablaprenda.setItems(CRUD_Usuario.getPrenda(dni));
         col1.setCellValueFactory(new PropertyValueFactory<Prenda ,String> ("dni"));
         col2.setCellValueFactory(new PropertyValueFactory<Prenda ,String> ("tipoprenda"));
         
         
         
    }    
     
    
}

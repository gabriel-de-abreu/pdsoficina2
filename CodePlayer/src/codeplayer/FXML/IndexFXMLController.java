/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeplayer.FXML;

import XMLGenerator.SpectrumXML;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author noda2
 */
public class IndexFXMLController implements Initializable {
    
    @FXML
    ChoiceBox perfExistente;
    @FXML
    Button go;
    @FXML
    Button save;
    @FXML
    TextField newName;
    @FXML
    Pane newUser;
    @FXML
    Pane login;
    
    @FXML
    public void criaUsuario(){
        new File("User"+newName.getText()).mkdir();
    }
    @FXML
    public void go(){
        
    }
    public void carregaPerfis(){
      ArrayList<String> aux= SpectrumXML.procuraArquivosXML("User");
      ObservableList<String> oal=FXCollections.observableArrayList();
      for(int i=0;i<aux.size();i++){
          
      }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

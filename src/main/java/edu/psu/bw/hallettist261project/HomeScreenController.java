/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.bw.hallettist261project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Andrew
 */
public class HomeScreenController implements Initializable {
    
    
    @FXML
    public void noteButtonPushed(ActionEvent event) throws IOException {
        
        Parent noteScreenParent = FXMLLoader.load(getClass().getResource("Notes1.fxml"));
        
        Scene noteScreenScene = new Scene(noteScreenParent);
        
        Stage noteScreenStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        
        noteScreenStage.setScene(noteScreenScene);
        
        noteScreenStage.show();   
    }
    
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.bw.hallettist261project;

import java.io.FileNotFoundException;
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Andrew
 */
public class LoginController implements Initializable {
    @FXML
    TextField userBox;

    @FXML
    TextField passBox;

    @FXML
    Button loginButton;

    @FXML
    Label invalidLogin;


    @FXML
    public void loginButtonPushed(ActionEvent event) throws IOException {
        //System.out.println("-----LOGIN BUTTON PRESSED-----");
        Parent homeScreenParent = FXMLLoader.load(getClass().getResource("/fxml/HomeScreen.fxml"));
        Scene homeScreenScene = new Scene(homeScreenParent);
        //Getting stage information 
        Stage homeScreenStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        
        homeScreenStage.setScene(homeScreenScene);
        
        homeScreenStage.show();
        
   
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

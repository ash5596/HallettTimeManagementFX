/*
 * Name: Andrew Hallett
 * Class: IST 261
 * Project: HallettIst261Project
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
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
    Pane mainPane;
    
    @FXML
    private ImageView loginImage;
    

    @FXML
    public void handleLoginButtonOnAction(ActionEvent event) throws IOException {
        //Checking if the username and password are correct
        if(userBox.getText().equals("Andrew") && passBox.getText().equals("pass")) {
        System.out.println("----------LOGIN BUTTON PRESSED----------");
        //Loading the new screen once the login button is pressed
        Parent homeScreenParent = FXMLLoader.load(getClass().getResource("/fxml/HomeScreen.fxml"));
        Scene homeScreenScene = new Scene(homeScreenParent);
        //Getting stage information 
        Stage homeScreenStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        homeScreenStage.setScene(homeScreenScene);
        homeScreenStage.show();
        }
        else {
            invalidLogin.setText("LOGIN FAILED, TRY AGAIN.");
        }

   
    }
    
    @FXML
    //Method to clear the username and password text fields when clear button clicked
    void handleClearLoginButton(ActionEvent event) {
        userBox.clear();
        passBox.clear();

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //this.loginImage = new ImageView("Images/calendar-image-png-3.jpg");
    }    
        
}
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
    Button createUserButton;

    @FXML
    Scene newUserScene;

    @FXML
    Stage newUserStage;

    @FXML
    Parent homeScreenParent;

    @FXML
    Scene homeScreenScene;

    @FXML
    Stage homeScreenStage;

    @FXML
    Button returnFromNewUser;
    
    @FXML
    public void handleLoginButtonOnAction(ActionEvent event) throws IOException {
        //Checking if the username and password are correct
        if (userBox.getText().equals("Andrew") && passBox.getText().equals("pass")) {
            System.out.println("----------LOGIN BUTTON PRESSED----------");
            //Loading the new screen once the login button is pressed
            Parent homeScreenParent = FXMLLoader.load(getClass().getResource("/fxml/HomeScreen.fxml"));
            Scene homeScreenScene = new Scene(homeScreenParent);
            //Getting stage information 
            Stage homeScreenStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            //Showing the scene
            homeScreenStage.setScene(homeScreenScene);
            homeScreenStage.show();
            //Setting scene to display in center of screen
            homeScreenStage.centerOnScreen();
            //Disabling resizable
            homeScreenStage.resizableProperty().setValue(Boolean.FALSE);
        } else {
            invalidLogin.setText("LOGIN FAILED, TRY AGAIN.");
        }
    }

    @FXML
    //Method to clear the username and password text fields when clear button clicked
    void handleClearLoginButton(ActionEvent event) {
        userBox.clear();
        passBox.clear();

    }

    @FXML
    //Method to handle the user click action when create new user button is clicked on login screne
    //Clicking button will take them to a new scene -- to create new username and password
    public void handleCreateUserButton(ActionEvent event) throws IOException {
        Parent newUserParent = FXMLLoader.load(getClass().getResource("/fxml/NewUserScene.fxml"));
        Scene newUserScene = new Scene(newUserParent);
        //Getting stage information
        Stage newUserStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //Showing the scene
        newUserStage.setScene(newUserScene);
        newUserStage.show();
        //Setting scene to display in the center of screen
        newUserStage.centerOnScreen();
        //Disabling resizable
        newUserStage.resizableProperty().setValue(Boolean.FALSE);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //this.loginImage = new ImageView("Images/calendar-image-png-3.jpg");
    }

}

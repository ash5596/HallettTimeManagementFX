/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.psu.bw.hallettist261project;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Andrew
 */
public class NewUserController {

    @FXML
    private AnchorPane newUserLogin;

    @FXML
    private TextField newUserNameText;

    @FXML
    private TextField newPasswordText;

    @FXML
    private Button createNewUserButton;

    @FXML
    private Button returnFromNewUser;

    @FXML
    Stage newUserStage;

    @FXML
    Scene newUserScene;

    @FXML
    Parent homeScreenParent;

    @FXML
    Scene homeScreenScene;

    @FXML
    Stage homeScreenStage;

    @FXML
    private Button returnNewUserButton;

    @FXML
    void handleCreateNewUserButton(ActionEvent event) {

    }

    @FXML
    void handleReturnButtonOnAction(ActionEvent event) throws IOException {
        System.out.println("----------LOGIN BUTTON PRESSED----------");
        //Loading the new screen once the login button is pressed
        Parent newUserParent = FXMLLoader.load(getClass().getResource("/fxml/LoginScene.fxml"));
        Scene newUserScene = new Scene(newUserParent);
        //Getting stage information 
        Stage newUserStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //Showing the scene
        newUserStage.setScene(newUserScene);
        newUserStage.show();
        //Setting scene to display in center of screen
        newUserStage.centerOnScreen();
        //Disabling resizable
        newUserStage.resizableProperty().setValue(Boolean.FALSE);

    }
}

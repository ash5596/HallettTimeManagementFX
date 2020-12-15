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
    void handleCreateNewUserButton(ActionEvent event) {

    }

    @FXML
    void handleReturnNewUserOnAction(ActionEvent event) throws IOException {
        //Testing
        System.out.println("---------RETURN (CREATE NEW USER) BUTTON PRESSED----------");
        Parent newUserRoot = FXMLLoader.load(getClass().getResource("/fxml/LoginScene.fxml"));  //root of class path -- everytime load fxml
        //Creating scene
        Scene loginScene = new Scene(newUserRoot);
        //Creating stage
        Stage newUserStage = new Stage();
        //Setting title
        newUserStage.setTitle("Login Scene -- Andrew Hallett IST 261 Project");
        //Not allowing resizable
        newUserStage.resizableProperty().setValue(Boolean.FALSE);
        //Displaing scene
        newUserStage.setScene(loginScene);
        //Setting scene to display in center of screen
        newUserStage.centerOnScreen();
        newUserStage.show();
    }
}

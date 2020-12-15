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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Andrew
 */
public class ReadMeController {

    @FXML
    private AnchorPane readMeAnchor;

    @FXML
    private Button returnReadMe;

    @FXML
    void handleReturnReadMeButtonOnAction(ActionEvent event) throws IOException {
        Parent readMeRoot = FXMLLoader.load(getClass().getResource("/fxml/LoginScene.fxml"));  //root of class path -- everytime load fxml
        //Creating scene
        Scene readMeScene = new Scene(readMeRoot);
        //Setting title
        Stage readMeStage = new Stage();
        readMeStage.setTitle("Login Scene -- Andrew Hallett IST 261 Project");
        //Not allowing resizable
        readMeStage.resizableProperty().setValue(Boolean.FALSE);
        //Displaing scene
        readMeStage.setScene(readMeScene);
        //Setting scene to display in center of screen
        readMeStage.centerOnScreen();
        readMeStage.show();

    }

}

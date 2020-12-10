/*
 * Name: Andrew Hallett
 * Class: IST 261
 * Project: HallettIst261Project
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
public class LogoutController {

    @FXML
    private AnchorPane logoutAnchorPane;

    @FXML
    private Button logoutButton;

    @FXML
    void handleLogoutButtonAction(ActionEvent event) throws IOException {
        System.out.println("---------LOGOUT BUTTON PRESSED----------");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/LogoutScene.fxml"));  //root of class path -- everytime load fxml
        
        Scene scene = new Scene(root);
        Stage testStage =  new Stage();
        testStage.setTitle("Logout Scene -- Andrew Hallett IST 261 Project");
        
        testStage.setScene(scene);
        testStage.show();

    }

    }




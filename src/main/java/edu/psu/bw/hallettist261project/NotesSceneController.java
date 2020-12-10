package edu.psu.bw.hallettist261project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Andrew
 */


public class NotesSceneController {

    @FXML
    private AnchorPane noteAnchorPane;

    @FXML
    private Button notesHomeButton;

    @FXML
    void handleNotesHomeButtonAction(ActionEvent event) throws IOException {
        System.out.println("---------RETURN BUTTON PRESSED----------");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/notesScene.fxml"));  //root of class path -- everytime load fxml
        
        Scene scene = new Scene(root);
        Stage testStage =  new Stage();
        testStage.setTitle("Andrew Hallett IST 261 Project");
        
        testStage.setScene(scene);
        testStage.show();

    }

    }



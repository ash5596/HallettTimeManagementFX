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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Andrew
 */
public class WeekSceneController {

    @FXML
    private AnchorPane weekAnchorPane;
    @FXML
    private Button weekReturnButton;
    
    @FXML
    private Label mondayLabelOne;

    @FXML
    private Label mondayLabelTwo;

    @FXML
    private Label mondayLabelThree;
    
    @FXML
    TextField createEventTextField;
    
    @FXML
    TextField nameOfEvent;

    @FXML
    void handleNoteButtonAction(ActionEvent event) throws IOException {
        //Testing
        System.out.println("---------NOTE BUTTON PRESSED----------");
        //Getting fxml file for scene
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/weekScene.fxml"));  //root of class path -- everytime load fxml
        //Creating scene
        Scene weekScene = new Scene(root);
        Stage weekStage = new Stage();
        //Title
        weekStage.setTitle("Week Scene -- Andrew Hallett IST 261 Project");
        //Displaying the weekstage
        weekStage.setScene(weekScene);
        //Setting scene to display in center of screen
        weekStage.centerOnScreen();
        weekStage.show();

    }

    @FXML
    //Method to close the week scene and bring user back to home screen when button is clicked 
    void handleWeekReturnHomeButton(ActionEvent event) {
        //Testing
        System.out.println("---------RETURN BUTTON PRESSED----------");
        Stage stage = (Stage) weekReturnButton.getScene().getWindow();
        //closing the scene
        stage.close();
    }
}

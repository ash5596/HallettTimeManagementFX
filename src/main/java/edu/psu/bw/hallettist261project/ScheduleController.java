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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Andrew
 */
public class ScheduleController {

    @FXML
    private AnchorPane scheduleAnchorPane;

    @FXML
    private Button testReturnButton;

    @FXML
    TextField createEventTextField;

    @FXML
    private Button mondayScheduleButton;

    @FXML
    private Button tuesdayScheduleButton;

    @FXML
    private Button wednesdayScheduleButton;

    @FXML
    private Button thursdayScheduleButton;

    @FXML
    private Button fridayScheduleButton;

    @FXML
    private Button saturdayScheduleButton;

    @FXML
    private Button sundayScheduleButton;
    
    @FXML
    private Button readMeButton;

    @FXML
    //Method to change close the scheduler scene and bring user back to home screen
    void testReturnButtonHandleOnAction(ActionEvent event) throws IOException {
        //Testing
        System.out.println("---------RETURN (SCHEDULE SCENE) BUTTON PRESSED----------");
        Stage scheduleStage = (Stage) testReturnButton.getScene().getWindow();
        //Disabaling resize
        scheduleStage.resizableProperty().setValue(Boolean.FALSE);
        //Setting scene to display in center of screen
        scheduleStage.centerOnScreen();
        //closing scene
        scheduleStage.close();
    }
    
    @FXML
    //Method to display the readMe scene 
    void handleReadMeButtonOnAction(ActionEvent event) throws IOException {
        System.out.println("----------READ ME BUTTON PRESSED----------");
        //Loading the new screen once the login button is pressed
        Parent readMeRoot = FXMLLoader.load(getClass().getResource("/fxml/ReadMeScheduler.fxml"));

        Scene readMeScene = new Scene(readMeRoot);
        //Getting stage information 
        Stage readMeStage = new Stage();
        readMeStage.setTitle("Schedule Scene (in theory) -- Andrew Hallett IST 261 Project");
        readMeStage.resizableProperty().setValue(Boolean.FALSE);
        readMeStage.setScene(readMeScene);
        readMeStage.show();

    }

    @FXML
    void handleMondayButtonOnAction(ActionEvent event) {

    }

    @FXML
    void handleTuesdayButtonOnAction(ActionEvent event) {

    }

    @FXML
    void handleWednesdayButtonOnAction(ActionEvent event) {

    }

    @FXML
    void handleThursdayButtonOnAction(ActionEvent event) {

    }

    @FXML
    void handleFridayButtonOnAction(ActionEvent event) {

    }

    @FXML
    void handleSaturdayButtonOnAction(ActionEvent event) {

    }

    @FXML
    void handleSundayButtonOnAction(ActionEvent event) {

    }
    

}

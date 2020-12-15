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
 * FXML Controller class
 *
 * @author Andrew
 */
public class HomeScreenController {

    @FXML
    AnchorPane homeScreenAnchorPane;

    @FXML
    private Button scheduleButton;

    @FXML
    private Button weekButton;

    @FXML
    private Button monthButton;

    @FXML
    private Button noteButton;

    @FXML
    private Button logoutButton;

    @FXML
    //Method that will close the application when the logout button is clicked
    void handleLogoutButtonAction(ActionEvent event) throws IOException {
        System.out.println("---------LOGOUT BUTTON PRESSED----------GOODBYE----------");
        Stage logoutStage = (Stage) logoutButton.getScene().getWindow();
        logoutStage.close();
    }

    @FXML
    //Method that will display the month scene when the month button is clicked 
    void handlePrototypeSchedulerButtonAction(ActionEvent event) throws IOException {
        System.out.println("---------NEW SCHEDULER BUTTON PRESSED----------");
        Parent prototypeRoot = FXMLLoader.load(getClass().getResource("/fxml/PrototypeSchedulerNew.fxml"));  //root of class path -- everytime load fxml

        Scene prototypeScene = new Scene(prototypeRoot);
        Stage prototypeStage = new Stage();
        prototypeStage.setTitle("New Scheduler Scene -- Andrew Hallett IST 261 Project");
        prototypeStage.resizableProperty().setValue(Boolean.FALSE);
        prototypeStage.setScene(prototypeScene);
        prototypeStage.show();

    }

    @FXML
    //Method that will display the note scene when the note button is clicked 
    void handleNoteButtonAction(ActionEvent event) throws IOException {
        System.out.println("---------NOTE BUTTON PRESSED----------");
        Parent noteRoot = FXMLLoader.load(getClass().getResource("/fxml/notesScene.fxml"));  //root of class path -- everytime load fxml

        Scene noteScene = new Scene(noteRoot);
        Stage noteStage = new Stage();
        noteStage.setTitle("Note Scene -- Andrew Hallett IST 261 Project");
        noteStage.resizableProperty().setValue(Boolean.FALSE);
        noteStage.setScene(noteScene);
        noteStage.show();

    }

    @FXML
    //Method that will load the schedule scene when the schedule button is clciked 
    void handleScheduleButtonAction(ActionEvent event) throws IOException {
        System.out.println("----------SCHEDULE (MAINSCREEN) BUTTON PRESSED----------");
        //Loading the new screen once the login button is pressed
        Parent scheduleRoot = FXMLLoader.load(getClass().getResource("/fxml/ScheduleScene.fxml"));

        Scene scheduleScene = new Scene(scheduleRoot);
        //Getting stage information 
        Stage scheduleStage = new Stage();
        scheduleStage.setTitle("Schedule Scene (in theory) -- Andrew Hallett IST 261 Project");
        scheduleStage.resizableProperty().setValue(Boolean.FALSE);
        scheduleStage.setScene(scheduleScene);
        scheduleStage.show();

    }

    @FXML
    //Method that will load the week scene when the note button is clicked 
    void handleWeekButtonAction(ActionEvent event) throws IOException {
        //testing
        System.out.println("---------WEEK BUTTON PRESSED----------");
        //Getting scene
        Parent weekRoot = FXMLLoader.load(getClass().getResource("/fxml/weekScene.fxml"));  //root of class path -- everytime load fxml
        Scene weekScene = new Scene(weekRoot);
        Stage weekStage = new Stage();
        //Title of scene
        weekStage.setTitle("Week Scene -- Andrew Hallett IST 261 Project");
        //Not allowing resizing of window
        weekStage.resizableProperty().setValue(Boolean.FALSE);
        //Dispaying
        weekStage.setScene(weekScene);
        //Setting scene to display in center of screen
        weekStage.centerOnScreen();
        weekStage.show();

    }

}

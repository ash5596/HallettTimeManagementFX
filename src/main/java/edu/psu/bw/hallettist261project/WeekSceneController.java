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
    private TextField mondayTextOne, mondayTextTwo, mondayTextThree, tuesdayTextOne, tuesdayTextTwo, tuesdayTextThree;
    @FXML
    private TextField wednesdayTextOne, wednesdayTextTwo, wednesdayTextThree, thursdayTextOne, thursdayTextTwo, thursdayTextThree;
    @FXML
    private TextField fridayTextOne, fridayTextTwo,fridayTextThree, saturdayTextOne,saturdayTextTwo, saturdayTextThree, sundayTextOne, sundayTextTwo, sundayTextThree;


    
    @FXML
    void handleNoteButtonAction(ActionEvent event) throws IOException {
        System.out.println("---------NOTE BUTTON PRESSED----------");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/weekScene.fxml"));  //root of class path -- everytime load fxml
        
        Scene scene = new Scene(root);
        Stage testStage =  new Stage();
        testStage.setTitle("Week Scene -- Andrew Hallett IST 261 Project");
        
        testStage.setScene(scene);
        testStage.show();

    }
    
    @FXML
    void handleWeekReturnHomeButton(ActionEvent event) {
        System.out.println("---------RETURN BUTTON PRESSED----------");
        Stage stage  =(Stage) weekReturnButton.getScene().getWindow();
        stage.close();
    }   
}

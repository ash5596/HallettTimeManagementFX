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
import javafx.scene.image.ImageView;
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
    void testReturnButtonHandleOnAction(ActionEvent event) throws IOException {
        System.out.println("---------RETURN (SCHEDULE SCENE) BUTTON PRESSED----------");
        Stage stage  =(Stage) testReturnButton.getScene().getWindow();
        stage.close();
    }
}
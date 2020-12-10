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




public class ScheduleController {

    @FXML
    private AnchorPane scheduleAnchorPane;

    @FXML
    private Button testReturnButton;


    
    @FXML
    void testReturnButtonHandleOnAction(ActionEvent event) throws IOException {
        System.out.println("---------RETURN BUTTON PRESSED----------");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/HomeScreen.fxml"));  //root of class path -- everytime load fxml
        
        Scene scene = new Scene(root);
        Stage testStage =  new Stage();
        testStage.setTitle("Schedule Scene -- Andrew Hallett IST 261 Project");
        
        testStage.setScene(scene);
        testStage.show();

    }
    
}
        
   
    


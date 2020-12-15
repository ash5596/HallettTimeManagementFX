/*
 * Name: Andrew Hallett
 * Class: IST 261
 * Project: HallettIst261Project
 */
package edu.psu.bw.hallettist261project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Andrew
 */
public class PrototypeSchedulerController {
    
    @FXML
    private AnchorPane portotypeSchedulerAnchorPane;
    
    @FXML
    private Button prototypeReturn;

    
    @FXML
    void handleReturnPrototypeButtonOnAction(ActionEvent event) {
        //Testing
        //System.out.println("---------RETURN (NOTESCENE) BUTTON PRESSED----------");
        //Stage prototypeStage = (Stage) prototypeReturn.getScene().getWindow();
        //Disabling resizing
        //prototypeStage.resizableProperty().setValue(Boolean.FALSE);
        //Setting scene to display in center of screen
        //prototypeStage.centerOnScreen();
        //prototypeStage.close();

    }
    
}

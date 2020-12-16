/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class PopulatedWeekController {

    @FXML
    private AnchorPane populatedWeekAnchorPane;

    @FXML
    private Button weekReturnButton;

    @FXML
    void handleWeekReturnHomeButton(ActionEvent event) {
        //Testing
        System.out.println("---------RETURN (POPULATED WEEK SCENE) BUTTON PRESSED----------");
        Stage weekStagePopulated = (Stage) weekReturnButton.getScene().getWindow();
        //Disabling resizing
        weekStagePopulated.resizableProperty().setValue(Boolean.FALSE);
        //Setting scene to display in center of screen
        weekStagePopulated.centerOnScreen();
        weekStagePopulated.close();
    }

    

}


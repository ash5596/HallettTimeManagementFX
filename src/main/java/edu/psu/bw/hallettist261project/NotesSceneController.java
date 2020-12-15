/*
 * Name: Andrew Hallett
 * Class: IST 261
 * Project: HallettIst261Project
 */
package edu.psu.bw.hallettist261project;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
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
    private TextField notesTextOne;

    @FXML
    private Button notesHomeButton;

    @FXML
    private TextField notesTextTwo;

    @FXML
    private TextField notesTextThree;

    @FXML
    private TextField notesTextFour;

    @FXML
    private TextField notesTextFive;

    @FXML
    private TextField notesTextSix;

    @FXML
    void handleNotesHomeButtonAction(ActionEvent event) throws IOException {
        //Testing
        System.out.println("---------RETURN (NOTESCENE) BUTTON PRESSED----------");
        Stage noteStage = (Stage) notesHomeButton.getScene().getWindow();
        //Disabling resizing
        noteStage.resizableProperty().setValue(Boolean.FALSE);
        //Setting scene to display in center of screen
        noteStage.centerOnScreen();
        noteStage.close();
    }

}

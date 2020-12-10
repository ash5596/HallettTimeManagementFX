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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Andrew
 */

public class HomeScreenController {

    @FXML
    private AnchorPane homeScreenAnchorPane;

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
    void handleLogoutButtonAction(ActionEvent event) throws IOException {
        System.out.println("---------RETURN BUTTON PRESSED----------");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/LogoutScene.fxml"));  //root of class path -- everytime load fxml
        
        Scene scene = new Scene(root);
        Stage testStage =  new Stage();
        testStage.setTitle("Logout Scene -- Andrew Hallett IST 261 Project");
        
        testStage.setScene(scene);
        testStage.show();

    }

    @FXML
    void handleMonthButtonAction(ActionEvent event) throws IOException {
        System.out.println("---------MONTH BUTTON PRESSED----------");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/MonthScene.fxml"));  //root of class path -- everytime load fxml
        
        Scene scene = new Scene(root);
        Stage testStage =  new Stage();
        testStage.setTitle("Month Scene -- Andrew Hallett IST 261 Project");
        
        testStage.setScene(scene);
        testStage.show();

    }

    @FXML
    void handleNoteButtonAction(ActionEvent event) throws IOException {
        System.out.println("---------NOTE BUTTON PRESSED----------");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/notesScene.fxml"));  //root of class path -- everytime load fxml
        
        Scene scene = new Scene(root);
        Stage testStage =  new Stage();
        testStage.setTitle("Note Scene -- Andrew Hallett IST 261 Project");
        
        testStage.setScene(scene);
        testStage.show();

    }

    @FXML
    void handleScheduleButtonAction(ActionEvent event) throws IOException {
        System.out.println("----------SCHEDULE BUTTON PRESSED----------");
        //Loading the new screen once the login button is pressed
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/ScheduleScene.fxml"));
        Scene scene = new Scene(root);
        //Getting stage information 
        Stage testStage = new Stage();
        testStage.setTitle("Schedule Scene -- Andrew Hallett IST 261 Project");
       
        testStage.setScene(scene);
        testStage.show();

    }

    @FXML
    void handleWeekButtonAction(ActionEvent event) throws IOException {
        System.out.println("---------WEEK BUTTON PRESSED----------");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/weekScene.fxml"));  //root of class path -- everytime load fxml
        
        Scene scene = new Scene(root);
        Stage testStage =  new Stage();
        testStage.setTitle("Week Scene -- Andrew Hallett IST 261 Project");
        
        testStage.setScene(scene);
        testStage.show();

    }

}
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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Andrew
 */
public class HomeScreenController implements Initializable {
   
    
    @FXML
    Button notesButton;
    
    @FXML
    Button weekButton;
    
    @FXML
    Button monthButton;
    
    @FXML
    Button scheduleButton;
    
    @FXML
    Button exitButton;

    
    @FXML BorderPane mainPane;


    
    @FXML
    public void handleNoteButtonAction(ActionEvent event) throws FileNotFoundException {
        System.out.println("The NOTE button was clicked");
        PageLoader object = new PageLoader();
        Pane view = object.getScreen("notesScene");
        mainPane.setCenter(view);       
   
    }
    
    @FXML 
    public void handleWeekButtonAction(ActionEvent event) throws FileNotFoundException {
        System.out.println("The WEEK button was clicked");
        PageLoader object = new PageLoader();
        Pane view = object.getScreen("weekScene");
        mainPane.setCenter(view);
        
    }
    
    @FXML 
    public void handleMonthButtonAction(ActionEvent event) throws FileNotFoundException {
        System.out.println("The MONTH button was clicked");
        PageLoader object = new PageLoader();
        Pane view = object.getScreen("monthScene");
        mainPane.setCenter(view);
        
    }
    
    @FXML 
    public void handleScheduleButtonAction(ActionEvent event) throws FileNotFoundException {
        System.out.println("The SCHEDULE button was clicked");
        PageLoader object = new PageLoader();
        Pane view = object.getScreen("scheduleScene");
        mainPane.setCenter(view);
        
    }
    
    @FXML 
    public void handleLogoutButtonAction(ActionEvent event) throws FileNotFoundException {
        System.out.println("The EXIT button was clicked");
        PageLoader object = new PageLoader();
        Pane view = object.getScreen("exitScene");
        mainPane.setCenter(view);
        
    }

            @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}

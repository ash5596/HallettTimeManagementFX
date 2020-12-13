/*
 * Name: Andrew Hallett
 * Class: IST 261
 * Project: HallettIst261Project
 */
package edu.psu.bw.hallettist261project;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TimeManagement extends Application {
    
    @FXML 
    Button loginButton;
               
    @Override
    //Method to display the first screen the user will see when loging in
    public void start(Stage loginStage) throws Exception{
        Parent loginRoot = FXMLLoader.load(getClass().getResource("/fxml/LoginScene.fxml"));  //root of class path -- everytime load fxml
        //Creatin scene
        Scene loginScene = new Scene(loginRoot);
        //Setting title
        loginStage.setTitle("Login Scene -- Andrew Hallett IST 261 Project");
        //Not allowing resizable
        loginStage.resizableProperty().setValue(Boolean.FALSE);
        //Displaing scene
        loginStage.setScene(loginScene);
        //Setting scene to display in center of screen
        loginStage.centerOnScreen();
        loginStage.show();
        
          
    }
    //Main method 
    public static void main(String[] args) {
        launch();
    }

}
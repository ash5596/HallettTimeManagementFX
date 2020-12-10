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
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/LoginScene.fxml"));  //root of class path -- everytime load fxml
        
        Scene scene = new Scene(root);
        stage.setTitle("Login Scene -- Andrew Hallett IST 261 Project");
        
        stage.setScene(scene);
        stage.show();
        
          
    }
       
    public static void main(String[] args) {
        launch();
    }

}
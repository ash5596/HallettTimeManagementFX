/*
 * Name: Andrew Hallett
 * Class: IST 261
 * Project: HallettIst261Project
 */
package edu.psu.bw.hallettist261project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

public class FinalNewSchedulerController implements Initializable{

    //Setting up table variables
    @FXML
    private TableView<Events> eventTable;
    @FXML
    private TableColumn<Events, String> eventNameColumn;
    @FXML
    private TableColumn<Events, String> eventDayColumn;
    @FXML
    private TableColumn<Events, String> eventTimeColumn;
    @FXML
    private TableColumn<Events, String> eventTypeColumn;

    @FXML
    private Button readMeAgainButton;
    @FXML
    private Button homeButton;
    @FXML
    private TextField addEventNameField;

    @FXML
    private TextField addEventDayField;

    @FXML
    private TextField addEventTimeField;

    @FXML
    private TextField addEventTypeField;

    @FXML
    private Button addButton;

    //Initializing the scene
    public void initialize(URL url, ResourceBundle rb) {
        eventNameColumn.setCellValueFactory(new PropertyValueFactory<Events, String>("EventName"));
        eventDayColumn.setCellValueFactory(new PropertyValueFactory<Events, String>("EventDay"));
        eventTimeColumn.setCellValueFactory(new PropertyValueFactory<Events, String>("EventTime"));
        eventTypeColumn.setCellValueFactory(new PropertyValueFactory<Events, String>("EventColumn"));

        //Loading test data
        eventTable.setItems(getEvents());

    }

    //Creating an Observalbe list and adding data for the inside of the table
    public ObservableList<Events> getEvents() {

        ObservableList<Events> eventsList = FXCollections.observableArrayList();
        eventsList.add(new Events("Dr. Apointment", "Monday", "11 AM", "Apointment"));
        eventsList.add(new Events("Car Service", "Wednesday", "3 PM", "Car Service"));
        eventsList.add(new Events("Mail Package", "Saturday", "Anytime", "Self Errand"));

        return eventsList;
    }

    @FXML
    //Method that will take the user to the week view to see where the evnets they have made got populated to 
    void handleScheduleButtonOnAction(ActionEvent event) throws IOException {
        Parent newScheduleViewParent = FXMLLoader.load(getClass().getResource("/fxml/PopulatedWeekScene.fxml"));
        Scene newScheduleScene = new Scene(newScheduleViewParent);
        Stage newScheduleWindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        newScheduleWindow.setScene(newScheduleScene);
        newScheduleWindow.show();

    }

    @FXML
    //Method to handle the read me button 
    void handleReadMeAgainButtonOnAction(ActionEvent event) throws IOException {
        System.out.println("----------READ ME AGAIN BUTTON PRESSED----------");
        //Loading the new screen once the login button is pressed
        Parent readMeAgainRoot = FXMLLoader.load(getClass().getResource("/fxml/ReadMeAgain.fxml"));

        Scene readMeAgainScene = new Scene(readMeAgainRoot);
        //Getting stage information 
        Stage readMeAgainStage = new Stage();
        readMeAgainStage.setTitle("Schedule Scene (somewhat working) -- Andrew Hallett IST 261 Project");
        readMeAgainStage.resizableProperty().setValue(Boolean.FALSE);
        readMeAgainStage.setScene(readMeAgainScene);
        readMeAgainStage.show();

    }

    @FXML
    //Method to handle the homeButton when clicked
    void handleHomeButtonOnAction(ActionEvent event) {
        //Testing
        System.out.println("---------RETURN (NOTESCENE) BUTTON PRESSED----------");
        Stage noteStage = (Stage) homeButton.getScene().getWindow();
        //Disabling resizing
        noteStage.resizableProperty().setValue(Boolean.FALSE);
        //Setting scene to display in center of screen
        noteStage.centerOnScreen();
        noteStage.close();

    }
    
    @FXML
    void handleAddButtonOnAction(ActionEvent event) {

    }

}

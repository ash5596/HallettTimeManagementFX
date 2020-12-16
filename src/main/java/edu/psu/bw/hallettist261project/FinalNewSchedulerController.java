/*
 * Name: Andrew Hallett
 * Class: IST 261
 * Project: HallettIst261Project
 */
package edu.psu.bw.hallettist261project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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

public class FinalNewSchedulerController {

//    //Setting up table variables
//    @FXML
//    private TableView<Events> tableView;
//    @FXML
//    private TableColumn<Events, String> eventNameColumn;
//    @FXML
//    private TableColumn<Events, String> eventDayColumn;
//    @FXML
//    private TableColumn<Events, String> eventTimeColumn;
//    @FXML
//    private TableColumn<Events, String> eventTypeColumn;
//
//    //Instance variables to create event objects
//    @FXML
//    private TextField eventNameTextField;
//    @FXML
//    private TextField eventDayTextField;
//    @FXML
//    private TextField eventTimeTextField;
//    @FXML
//    private TextField eventTypeTextField;
//    @FXML
//    private Button scheduleButton;
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

//
//    //Method will let user click on the cell in the table to edit information 
//    @FXML
//    public void editEventNameCell(CellEditEvent edittedCell) {
//        Events selectedEvent = tableView.getSelectionModel().getSelectedItem();
//        selectedEvent.setEventDay(edittedCell.getNewValue().toString());
//    }
//
//    //Method will let user click on the cell in the table to edit information 
//    @FXML
//    public void editEventDayCell(CellEditEvent edittedCell) {
//        Events selectedEvent = tableView.getSelectionModel().getSelectedItem();
//        selectedEvent.setEventDay(edittedCell.getNewValue().toString());
//    }
//
//    //Method will let user click on the cell in the table to edit information 
//    @FXML
//    public void editEventTimeCell(CellEditEvent edittedCell) {
//        Events selectedEvent = tableView.getSelectionModel().getSelectedItem();
//        selectedEvent.setEventDay(edittedCell.getNewValue().toString());
//    }
//
//    //Method will let user click on the cell in the table to edit information 
//    @FXML
//    public void editEventTypeCell(CellEditEvent edittedCell) {
//        Events selectedEvent = tableView.getSelectionModel().getSelectedItem();
//        selectedEvent.setEventDay(edittedCell.getNewValue().toString());
//    }

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
    
//    @Override
//    //Initializing the controller class
//    public void initialize(URL url, ResourceBundle rb) {
//        eventNameColumn.setCellValueFactory(new PropertyValueFactory<Events, String>("Event Name"));
//        eventDayColumn.setCellValueFactory(new PropertyValueFactory<Events, String>("Event Day"));
//        eventTimeColumn.setCellValueFactory(new PropertyValueFactory<Events, String>("Event Time"));
//        eventTypeColumn.setCellValueFactory(new PropertyValueFactory<Events, String>("Event Column"));
//        
//        //Loading test data
//        //tableView.setItems(getEvents());
//        
//        //Being able to update the table
//        tableView.setEditable(true);
//        eventNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());
//        eventDayColumn.setCellFactory(TextFieldTableCell.forTableColumn());
//        eventTimeColumn.setCellFactory(TextFieldTableCell.forTableColumn());
//        eventTypeColumn.setCellFactory(TextFieldTableCell.forTableColumn());
//        
//        //Being able to chose more than one row at a time
//        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
//        
//        //Get rid of being able to go to week view until there is a row that is selected
//        this.scheduleButton.setDisable(true);
//    }
//    
//    
//
//    @FXML
//    //Method will delete the rows that are selected by the user -- remove from table
//    void handleDeleteButtonOnAction(ActionEvent event) {
//        ObservableList<Events> selectedRows, allEvents;
//        allEvents = tableView.getItems();
//        
//        //Handling the rows that were selcted by the user
//        selectedRows = tableView.getSelectionModel().getSelectedItems();
//        
//        //For loop that will select rows and take away the event objects out of the table
//        for (Events events: selectedRows) {
//            allEvents.remove(events);
//        }
//
//    }
//    
}

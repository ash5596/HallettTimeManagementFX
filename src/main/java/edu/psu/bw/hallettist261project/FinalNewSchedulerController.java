/*
 * Name: Andrew Hallett
 * Class: IST 261
 * Project: HallettIst261Project
 */
package edu.psu.bw.hallettist261project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FinalNewSchedulerController implements Initializable {

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
    private TextField addEventNameText;

    @FXML
    private TextField addEventDayText;

    @FXML
    private TextField addEventTimeText;

    @FXML
    private TextField addEventTypeText;

    @FXML
    private Button deleteButton;

    @FXML
    private VBox mondayVBoxOne, tuesdayVBoxOne, wednesdayVBoxOne, thursdayVBoxOne, fridayVBoxOne, saturdayVBoxOne, sundayVBoxOne;

    @FXML
    private Label mondayLabelOne, mondayLabelTwo, mondayLabelThree, mondayLabelFour;

    @FXML
    private Label tuesdayLabelOne, tuesdayLabelTwo, tuesdayLabelThree, tuesdayLabelFour;

    @FXML
    private Label wednesdayLabelOne, wednesdayLabelTwo, wednesdayLabelThree, wednesdayLabelFour;

    @FXML
    private Label thursdayLabelOne, thursdayLabelTwo, thursdayLabelThree, thursdayLabelFour;

    @FXML
    private Label fridayLabelOne, fridayLabelTwo, fridayLabelThree, fridayLabelFour;

    @FXML
    private Label saturdayLabelOne, saturdayLabelTwo, saturdayLabelThree, saturdayLabelFour;

    @FXML
    private Label sundayLabelOne, sundayLabelTwo, sundayLabelThree, sundayLabelFour;

    //Initializing the scene
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        eventNameColumn.setCellValueFactory(new PropertyValueFactory<>("EventName"));
        eventDayColumn.setCellValueFactory(new PropertyValueFactory<>("EventDay"));
        eventTimeColumn.setCellValueFactory(new PropertyValueFactory<>("EventTime"));
        eventTypeColumn.setCellValueFactory(new PropertyValueFactory<>("EventType"));

        //Loading test data
        eventTable.setItems(getEvents());

    }

    //Creating an Observalbe list and adding data for the inside of the table
    public ObservableList<Events> getEvents() {

        ObservableList<Events> eventsList = FXCollections.observableArrayList();
        eventsList.add(new Events("Dr. Apointment", "Monday", "11 AM", "Apointment"));
        eventsList.add(new Events("Oil Change", "Wednesday", "3 PM", "Car Service"));
        eventsList.add(new Events("Mail Package", "Saturday", "1 PM", "Self Errand"));

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
        //Listners add to table view if Monday
        eventTable.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (addEventDayText.getText() == "Monday") {
                if (newVal != null) {
                    mondayLabelOne.setText(newVal.getEventName());
                    mondayLabelTwo.setText(newVal.getEventDay());
                    mondayLabelThree.setText(newVal.getEventTime());
                    mondayLabelFour.setText(newVal.getEventType());

                }
            }
        });
        //Listners add to table view if Tuesday
        eventTable.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (addEventDayText.getText() == "Tuesday") {
                if (newVal != null) {
                    tuesdayLabelOne.setText(newVal.getEventName());
                    tuesdayLabelTwo.setText(newVal.getEventDay());
                    tuesdayLabelThree.setText(newVal.getEventTime());
                    tuesdayLabelFour.setText(newVal.getEventType());

                }
            }
        });
        //Listners add to table view if Wednesday
        eventTable.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (addEventDayText.getText() == "Wednesday") {
                if (newVal != null) {
                    mondayLabelOne.setText(newVal.getEventName());
                    mondayLabelTwo.setText(newVal.getEventDay());
                    mondayLabelThree.setText(newVal.getEventTime());
                    mondayLabelFour.setText(newVal.getEventType());

                }
            }
        });
        //Listners add to table view if Thursday
        eventTable.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (addEventDayText.getText() == "Thursday") {
                if (newVal != null) {
                    mondayLabelOne.setText(newVal.getEventName());
                    mondayLabelTwo.setText(newVal.getEventDay());
                    mondayLabelThree.setText(newVal.getEventTime());
                    mondayLabelFour.setText(newVal.getEventType());

                }
            }
        });
        //Listners add to table view if Friday
        eventTable.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (addEventDayText.getText() == "Friday") {
                if (newVal != null) {
                    mondayLabelOne.setText(newVal.getEventName());
                    mondayLabelTwo.setText(newVal.getEventDay());
                    mondayLabelThree.setText(newVal.getEventTime());
                    mondayLabelFour.setText(newVal.getEventType());

                }
            }
        });
        //Listners add to table view if Saturday
        eventTable.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (addEventDayText.getText() == "Saturday") {
                if (newVal != null) {
                    mondayLabelOne.setText(newVal.getEventName());
                    mondayLabelTwo.setText(newVal.getEventDay());
                    mondayLabelThree.setText(newVal.getEventTime());
                    mondayLabelFour.setText(newVal.getEventType());

                }
            }
        });
        //Listners add to table view if Sunday
        eventTable.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (addEventDayText.getText() == "Sunday") {
                if (newVal != null) {
                    mondayLabelOne.setText(newVal.getEventName());
                    mondayLabelTwo.setText(newVal.getEventDay());
                    mondayLabelThree.setText(newVal.getEventTime());
                    mondayLabelFour.setText(newVal.getEventType());

                }
            }
        });

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
    //Method will allow the user to populate the text fields and add an event with the add button 
    public void handleAddButtonOnAction(ActionEvent event) {
        Events newEvents = new Events(addEventNameText.getText(),
                addEventDayText.getText(),
                addEventTimeText.getText(),
                addEventTypeText.getText());

        //Get the data from the 
        eventTable.getItems().add(newEvents);

        //Clearing the text from the textfields that was already entered into the table
        //Allows clean text field for user to type next event into 
        addEventNameText.clear();
        addEventDayText.clear();
        addEventTimeText.clear();
        addEventTypeText.clear();

    }

    @FXML
    //Method will delete the selected row from the table -- based on the user selection
    void handleDeleteButtonOnAction(ActionEvent event) {
        ObservableList<Events> selectedRows, allEvents;
        allEvents = eventTable.getItems();
        //Will specify the rows that are selected by the user 
        selectedRows = eventTable.getSelectionModel().getSelectedItems();
        //Loop that will go through the rows and take away the event objects from the table
        for (Events events : selectedRows) {
            allEvents.remove(events);
        }

    }

}

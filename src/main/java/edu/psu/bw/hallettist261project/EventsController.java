/*
 * Name: Andrew Hallett
 * Class: IST 261
 * Project: HallettIst261Project
 */
package edu.psu.bw.hallettist261project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Andrew
 */
public class EventsController implements Initializable {

    @FXML
    private TableView eventTable;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TableColumn eventName = new TableColumn("Event Name");
        TableColumn eventDay = new TableColumn("Event Day");
        TableColumn eventTime = new TableColumn("Event Time");
        TableColumn eventType = new TableColumn("Event Type");
        eventTable.getColumns().addAll(eventName, eventDay, eventTime, eventType);

        //Creating an Observalbe list and adding data for the inside of the table
        final ObservableList<Events> eventData = FXCollections.observableArrayList(
                new Events("Dr. Apointment", "Monday", "11 AM", "Apointment"),
                new Events("Car Service", "Wednesday", "3 PM", "Car Service"),
                new Events("Mail Package", "Saturday", "Anytime", "Self Errand")
        );

        //Connecting data to the columns in the table 
        eventName.setCellValueFactory(new PropertyValueFactory<Events, String>("Event Name"));
        eventDay.setCellValueFactory(new PropertyValueFactory<Events, String>("Event Day"));
        eventTime.setCellValueFactory(new PropertyValueFactory<Events, String>("Event Time"));
        eventType.setCellValueFactory(new PropertyValueFactory<Events, String>("Event Type"));

        //Adding data within the table  -- from the observable list
        eventTable.setItems(eventData);

    }
}

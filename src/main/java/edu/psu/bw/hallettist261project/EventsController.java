///*
// * Name: Andrew Hallett
// * Class: IST 261
// * Project: HallettIst261Project
// */
//package edu.psu.bw.hallettist261project;
//
//import java.net.URL;
//import java.util.ResourceBundle;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.Label;
//
///**
// *
// * @author Andrew
// */
//public class EventsController implements Initializable {
//
//    private Events selectedEvent;
//
//    @FXML
//    private Label eventNameLabel;
//    @FXML
//    private Label eventDayLabel;
//    @FXML
//    private Label eventTimeLabel;
//    @FXML
//    private Label eventTypeLabel;
//
//    //Method will handle passing event data into week view
//    public void pasData(Events events) {
//        selectedEvent = events;
//        eventNameLabel.setText(selectedEvent.getEventName());
//        eventDayLabel.setText(selectedEvent.getEventDay());
//        eventTimeLabel.setText(selectedEvent.getEventTime());
//        eventTypeLabel.setText(selectedEvent.getEventType());
//
//    }
//
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//}

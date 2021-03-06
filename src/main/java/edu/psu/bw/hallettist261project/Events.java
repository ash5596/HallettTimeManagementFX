/*
 * Name: Andrew Hallett
 * Class: IST 261
 * Project: HallettIst261Project
 */
package edu.psu.bw.hallettist261project;

import javafx.beans.property.SimpleStringProperty;

public class Events {

    //SimpleStringProperty is like string but has listeners built into ti
    private SimpleStringProperty eventName;
    private SimpleStringProperty eventDay;
    private SimpleStringProperty eventTime;
    private SimpleStringProperty eventType;

    //Constructor
    public Events(String eventName, String eventDay, String eventTime, String eventType) {
        //Converting strings into simplestrings 
        this.eventName = new SimpleStringProperty(eventName);
        this.eventDay = new SimpleStringProperty(eventDay);
        this.eventTime = new SimpleStringProperty(eventTime);
        this.eventType = new SimpleStringProperty(eventType);

    }

    //Gets and Sets methods
    public String getEventName() {
        return eventName.get();
    }

    public void setEventName(String eventName) {
        this.eventName = new SimpleStringProperty(eventName);
    }

    public String getEventDay() {
        return eventDay.get();
    }

    public void setEventDay(String eventDay) {
        this.eventDay = new SimpleStringProperty(eventDay);
    }

    public String getEventTime() {
        return eventTime.get();
    }

    public void setEventTime(String eventTime) {
        this.eventTime = new SimpleStringProperty(eventTime);
    }

    public String getEventType() {
        return eventType.get();
    }

    public void setEventType(String eventType) {
        this.eventType = new SimpleStringProperty(eventType);
    }

}

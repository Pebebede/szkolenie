package com.bujaxcs.passengerService.repository.delayedPassenger;

import java.io.Serializable;

public class Passenger implements Serializable {


    private String passengerName;
    private String flightStatus;
    private String scheduledArrival;
    private String flightNo;
    private String contactData;
    private String ticketID;
    private String bookRef;

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getScheduledArrival() {
        return scheduledArrival;
    }

    public void setScheduledArrival(String scheduledArrival) {
        this.scheduledArrival = scheduledArrival;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getContactData() {
        return contactData;
    }

    public void setContactData(String contactData) {
        this.contactData = contactData;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getBookRef() {
        return bookRef;
    }

    public void setBookRef(String bookRef) {
        this.bookRef = bookRef;
    }

    public Passenger() {
    }

    public Passenger(String passengerName, String flightStatus, String scheduledArrival, String flightNo, String contactData, String bookRef, String ticketID) {
        this.passengerName = passengerName;
        this.flightStatus = flightStatus;
        this.scheduledArrival = scheduledArrival;
        this.flightNo = flightNo;
        this.contactData = contactData;
        this.ticketID = ticketID;
        this.bookRef = bookRef;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerName='" + passengerName + '\'' +
                ", flightStatus='" + flightStatus + '\'' +
                ", scheduledArrival='" + scheduledArrival + '\'' +
                ", flightNo='" + flightNo + '\'' +
                ", contactData='" + contactData + '\'' +
                ", ticketID='" + ticketID + '\'' +
                ", bookRef='" + bookRef + '\'' +
                '}';
    }
}

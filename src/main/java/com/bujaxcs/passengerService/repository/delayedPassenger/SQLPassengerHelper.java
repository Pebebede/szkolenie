package com.bujaxcs.passengerService.repository.delayedPassenger;

import com.bujaxcs.passengerService.repository.JavaPostgreSqlVersion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class SQLPassengerHelper {

    private String url;
    private String user;
    private String password;

    protected SQLPassengerHelper(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }


    protected List<Passenger> get() {
        String searchCriteria = "select t2.passenger_name, f2.status, f2.scheduled_arrival, f2.flight_no, t2.contact_data,t2.book_ref\n" +
                "from tickets t2  join ticket_flights tf using(ticket_no)\n" +
                "right join flights f2 using(flight_id)\n" +
                "where  t2.passenger_name is not null;";
        List<Passenger> result = new ArrayList<>();


        try (
                Connection con = DriverManager.getConnection(url, user, password);
                Statement st = con.createStatement();

                ResultSet rs = st.executeQuery(searchCriteria)) {

            while (rs.next()) {
                String ticketID = rs.getString("book_ref");
                String passengerName = rs.getString("passenger_name");
                String flightStatus = rs.getString("status");
                String scheduledArrival = rs.getString("scheduled_arrival");
                String flightNo = rs.getString("flight_no");
                String contactData = rs.getString("contact_data");
                String bookRef = rs.getString("book_ref");
                Passenger base = new Passenger(passengerName, flightStatus, scheduledArrival, flightNo, contactData, bookRef, ticketID);
                result.add(base);
            }

        } catch (
                SQLException ex) {

            Logger lgr = Logger.getLogger(JavaPostgreSqlVersion.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return result;

    }

    protected List<Passenger> getByStatus(String[] status) {
        System.out.println(status);
//        status.add("flightStatus_On Time");
//        status.add("timeStamp_2017-01-01");

        String setFlightStatus = "Delayed";// Domyślnie wszystkie! Ale to wymaga edycji kryteriów na ogolne, z delayed
        String timeStamp = "0000-00-00";

        //1. zrobienie defaultowych wartosci do statusów
        //2. oifowanie ew. zmiany, if List<> status, zawiera wartość> zmień wartość na wartość z status
        //  -rozbij wpis stringa , wartość statusu weź z wartości po przecinku, np. status,Delayed /timestamp,2017-08-14
        //!
        for (String check : status) {
            if (check.contains("flightStatus")) {
                setFlightStatus = check;
                String[] split = setFlightStatus.split("_");
                setFlightStatus = split[1];
            }
            if (check.contains("timeStamp")) {
                timeStamp = check;
                String[] split = timeStamp.split("_");
                timeStamp = split[1];
            }
        }
        String searchCriteria = "select t2.passenger_name, f2.status, f2.scheduled_arrival, f2.flight_no, t2.contact_data,t2.book_ref\n" +
                "from tickets t2  join ticket_flights tf using(ticket_no)\n" +
                "right join flights f2 using(flight_id)\n" +
                "where  t2.passenger_name is not null and f2.status='" + setFlightStatus + "' and f2.scheduled_arrival >= '" + timeStamp + " 00:00:00'::timestamp; ";
        List<Passenger> result = new ArrayList<>();


        try (
                Connection con = DriverManager.getConnection(url, user, password);
                Statement st = con.createStatement();

                ResultSet rs = st.executeQuery(searchCriteria)) {

            while (rs.next()) {
                String ticketID = rs.getString("book_ref");
                String passengerName = rs.getString("passenger_name");
                String flightStatus = rs.getString("status");
                String scheduledArrival = rs.getString("scheduled_arrival");
                String flightNo = rs.getString("flight_no");
                String contactData = rs.getString("contact_data");
                String bookRef = rs.getString("book_ref");
                Passenger base = new Passenger(passengerName, flightStatus, scheduledArrival, flightNo, contactData, bookRef, ticketID);
                result.add(base);
            }

        } catch (
                SQLException ex) {

            Logger lgr = Logger.getLogger(JavaPostgreSqlVersion.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return result;
    }

}

package com.bujaxcs.passengerService.repository.delayedPassenger;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
class SQLPassengerProvider implements PassengerRepository {

    private String url = "jdbc:postgresql://localhost:5432/demo";
    private String user = "pebe";
    private String password = "qqq";
    private SQLPassengerHelper helper = new SQLPassengerHelper(url, user, password);


    @Override
    public List<Passenger> findAll() {
        return helper.get();
    }

    @Override
    public List<Passenger> findByStatus(String[] status) {
        return helper.getByStatus(status);
    }

    @Override
    public List<Passenger> findByDate(String date) {
        return null;
    }
}

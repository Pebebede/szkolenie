package com.bujaxcs.passengerService.repository.delayedPassenger;

import java.util.List;

public interface PassengerRepository {

    List<Passenger> findAll();

    List<Passenger> findByStatus(String[] status);

    List<Passenger> findByDate(String date);

}



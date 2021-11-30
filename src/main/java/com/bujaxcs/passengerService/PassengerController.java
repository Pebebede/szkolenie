package com.bujaxcs.passengerService;

import com.bujaxcs.passengerService.repository.delayedPassenger.Passenger;
import com.bujaxcs.passengerService.repository.delayedPassenger.PassengerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassengerController {
    private PassengerRepository repository;

    public PassengerController(PassengerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("passengersStatus")
    public List<Passenger> getByStatus(String[] status) {
        return repository.findByStatus(status);
    }

    @GetMapping("passengers")
    public List<Passenger> get() {
        return repository.findAll();
    }


}

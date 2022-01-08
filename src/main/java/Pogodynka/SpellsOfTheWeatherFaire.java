package Pogodynka;

import java.time.LocalDate;

public class SpellsOfTheWeatherFaire {

    private final WeatherFairy forecaster = new WeatherFairy();


    public String createForecast() {

        String day = LocalDate.now().getDayOfWeek().name();

        String weatherForecast = forecaster.makeIt();
        int temperatureForecast = forecaster.makeAForecast();

        return ("dzis tj." + day + ": " + weatherForecast + " " + temperatureForecast + " stopni Celcjusza");
    }
}



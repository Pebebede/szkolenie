package Pogodynka;

import java.time.LocalDate;

public class SpellsOfTheWeatherFaire {

    private WeatherFairy forecaster = new WeatherFairy();
    private String weather;

    public String createForecast() {
//.
        String day = LocalDate.now().getDayOfWeek().name();

        String weatherForecast = forecaster.forecast();
        int temperatureForecast = forecaster.makeAForecast();

        weather = ("dzis tj." + day + ": " + weatherForecast + " " + temperatureForecast + " stopni Celcjusza");

        return weather;
    }
}



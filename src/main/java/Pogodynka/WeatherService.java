package Pogodynka;

public class WeatherService {
    SpellsOfTheWeatherFaire weatherFaire = new SpellsOfTheWeatherFaire();

    public WeatherService() {

    }

    public void checkActualWeather(NotifyManager event) {

        WeatherNotification actualWeather = new WeatherNotification(weatherFaire.createForecast());
        event.notifier(actualWeather);
    }
}

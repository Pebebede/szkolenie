package Pogodynka;

public class WeatherService {


    public WeatherService() {

    }

    public void checkActualWeather(NotifyManager event) {

        WeatherNotification actualWeather = new WeatherNotification(new SpellsOfTheWeatherFaire().createForecast());
        event.notifier(actualWeather);
    }
}

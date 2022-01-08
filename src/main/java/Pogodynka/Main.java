package Pogodynka;

public class Main {


    public static void main(String[] args) {

        NotifyManager notifyManager = new NotifyManager();
        notifyManager.subscribe(new WeatherNotificationListener("Piotr", "test@test.pl"));
        notifyManager.subscribe(new WeatherNotificationListener("Basia", "buziaczek@test.pl"));
        notifyManager.subscribe(new WeatherNotificationListener("Piotr", "Master@m@upa.pl"));
        notifyManager.subscribe(new WeatherNotificationListener("", ""));

        new WeatherService().checkActualWeather(notifyManager);

    }
}

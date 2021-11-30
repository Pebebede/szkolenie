package Pogodynka;

public class WeatherNotification {
    private String value;

    @Override
    public String toString() {
        return "'" + value + '\'' +
                '}';
    }

    public WeatherNotification(String value) {
        this.value = value;


    }


}

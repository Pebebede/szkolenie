package Pogodynka;

public class WeatherNotificationListener implements Subscriber {
    private String userData;


    private String userContact;

    private String getUserData() {
        return userData;
    }

    private String getUserContact() {
        return userContact;
    }

    public WeatherNotificationListener(String userData, String userContact) {
        this.userData = userData;
        this.userContact = userContact;
    }

    @Override
    public void update(WeatherNotification weatherNotification) {
        System.out.println("wysłano wiadomośc do: " + getUserContact());
        System.out.println("Drogi " + getUserData() + " pogoda na dziś to:" + weatherNotification);
    }
}

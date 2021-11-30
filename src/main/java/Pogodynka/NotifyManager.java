package Pogodynka;

import java.util.ArrayList;

public class NotifyManager {

    ArrayList<Subscriber> listeners = new ArrayList<>();


    public void subscribe(Subscriber subscriber) {

        this.listeners.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber) {
        this.listeners.remove(subscriber);
    }

    public void notifier(WeatherNotification weatherNotification) {

        for (Subscriber subscriber : listeners) {
            subscriber.update(weatherNotification);
        }

    }
}



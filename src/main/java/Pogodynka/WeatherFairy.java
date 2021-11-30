package Pogodynka;

import java.util.Random;

public class WeatherFairy {

    private Random random;

    public WeatherFairy() {
        this.random = new Random();
    }

    public String forecast() {
        double propability = this.random.nextDouble();

        if (propability <= 0.1) {
            return "Bedzie padac";
        } else if (propability <= 0.4) { // 0.1 + 0.3
            return "Bedzie sypac snieg!";
        } else { // rest, 1.0 - 0.4 = 0.6
            return "Bedzie slonecznie";
        }
    }

    public int makeAForecast() {
        return (int) (4 * this.random.nextGaussian() - 3);
    }
}



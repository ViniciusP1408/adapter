package AdapterClima;

import java.util.Random;

public class ApiAFahrenheit {
    private final Random random = new Random();

    public double getTemperatureF(String cidade) {
        return 32 + random.nextDouble() * 72;
    }
}

package AdapterClima;

import java.util.Random;

public class ApiBKelvin {
    private final Random random = new Random();

    public double getTemperatureK(String cidade) {
        return 273.15 + random.nextDouble() * 40.0;
    }
}

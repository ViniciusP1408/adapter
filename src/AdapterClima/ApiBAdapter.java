package AdapterClima;

public class ApiBAdapter implements ClimaService {
    private final ApiBKelvin apiB;

    public ApiBAdapter(ApiBKelvin apiB) {
        this.apiB = apiB;
    }

    @Override
    public double obterTemperaturaCelsius(String cidade) {
        double k = apiB.getTemperatureK(cidade);
    return k - 273.15;
    }
}

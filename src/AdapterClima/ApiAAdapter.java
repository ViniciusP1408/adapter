package AdapterClima;

public class ApiAAdapter implements ClimaService {
    private final ApiAFahrenheit apiA;

    public ApiAAdapter(ApiAFahrenheit apiA) {
        this.apiA = apiA;
    }

    @Override
    public double obterTemperaturaCelsius(String cidade) {
        double f = apiA.getTemperatureF(cidade);
    return (f - 32) * 5.0 / 9.0;
    }
}

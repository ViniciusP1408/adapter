package AdapterClima;

public class AppClima {
    public static void main(String[] args) {
        ClimaService climaA = new ApiAAdapter(new ApiAFahrenheit());
        ClimaService climaB = new ApiBAdapter(new ApiBKelvin());

        String cidade = "São Paulo";
        System.out.printf("API A (->Celsius) em %s: %.2f°C%n", cidade, climaA.obterTemperaturaCelsius(cidade));
        System.out.printf("API B (->Celsius) em %s: %.2f°C%n", cidade, climaB.obterTemperaturaCelsius(cidade));
    }
}

package AdapterTomadas;

public class AppTomadas {
    public static void main(String[] args) {
        SecadorAmericano secador = new SecadorAmericano();
        TomadaBrasileira tomadaAdaptada = new AdaptadorSecadorAmericano(secador);
        tomadaAdaptada.ligarNaTomada();
    }
}

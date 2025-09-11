package AdapterTomadas;

public class AdaptadorSecadorAmericano implements TomadaBrasileira {
    private final SecadorAmericano secadorAmericano;

    public AdaptadorSecadorAmericano(SecadorAmericano secadorAmericano) {
        this.secadorAmericano = secadorAmericano;
    }

    @Override
    public void ligarNaTomada() {
        System.out.println("Usando adaptador EUA->BR");
        secadorAmericano.plugInFlatPlug();
    }
}

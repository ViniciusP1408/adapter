package Adapter;

public class AdaptadorEuropeuParaBrasileiro implements TomadaBrasileiro{
    private TomadaEuropeia tomadaEuropeia;

    public AdaptadorEuropeuParaBrasileiro(TomadaEuropeia tomadaEuropeia){
        this.tomadaEuropeia = tomadaEuropeia;
    }
    @Override
    public void conectarTomadaBrasileira() {
        System.out.println("Usando adpatador");
        tomadaEuropeia.plugueEuropeu();
    }
}

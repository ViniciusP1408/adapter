package Adapter;

public class App {
    public static void main(String[] args) {
        TomadaEuropeia tomadaE =  new TomadaEuropeia();
        TomadaBrasileiro adaptador =  new AdaptadorEuropeuParaBrasileiro(tomadaE);
    }
}

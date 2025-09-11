package AdapterImpressoras;

public class AppImpressoras {
    public static void main(String[] args) {
        ImpressoraAntiga legacy = new ImpressoraAntiga();
        NovaImpressora nova = new ImpressoraAntigaAdapter(legacy);
        nova.imprimirDocumento("Relatório de vendas 2025");
    }
}

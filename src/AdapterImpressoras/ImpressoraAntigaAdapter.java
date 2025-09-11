package AdapterImpressoras;

public class ImpressoraAntigaAdapter implements NovaImpressora {
    private final ImpressoraAntiga impressoraAntiga;

    public ImpressoraAntigaAdapter(ImpressoraAntiga impressoraAntiga) {
        this.impressoraAntiga = impressoraAntiga;
    }

    @Override
    public void imprimirDocumento(String doc) {
        System.out.println("Usando adapter NovaImpressora -> ImpressoraAntiga");
        impressoraAntiga.printar(doc);
    }
}

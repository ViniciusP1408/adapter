package AdapterCartoes;

public class LeitorTarjaAdapter implements LeitorCartao {
    private final LeitorCartaoAntigo leitor;

    public LeitorTarjaAdapter(LeitorCartaoAntigo leitor) {
        this.leitor = leitor;
    }

    @Override
    public String lerDados(String dados) {
        return leitor.lerTarjaMagnetica(dados);
    }
}

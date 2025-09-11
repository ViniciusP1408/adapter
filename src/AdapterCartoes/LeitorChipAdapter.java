package AdapterCartoes;

public class LeitorChipAdapter implements LeitorCartao {
    private final LeitorCartaoChip leitor;

    public LeitorChipAdapter(LeitorCartaoChip leitor) {
        this.leitor = leitor;
    }

    @Override
    public String lerDados(String dados) {
        return leitor.lerChip(dados);
    }
}

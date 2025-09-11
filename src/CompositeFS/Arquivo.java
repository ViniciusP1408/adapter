package CompositeFS;

public class Arquivo implements ItemSistema {
    private final String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "- " + nome);
    }
}

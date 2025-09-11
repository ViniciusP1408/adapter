package CompositeFS;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ItemSistema {
    private final String nome;
    private final List<ItemSistema> itens = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(ItemSistema item) {
        itens.add(item);
    }

    public void remover(ItemSistema item) {
        itens.remove(item);
    }

    @Override
    public void exibir(String prefixo) {
        System.out.println(prefixo + "+ " + nome);
        for (ItemSistema item : itens) {
            item.exibir(prefixo + "  ");
        }
    }
}

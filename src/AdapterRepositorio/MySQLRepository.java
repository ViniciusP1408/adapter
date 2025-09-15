package AdapterRepositorio;

import java.util.HashMap;
import java.util.Map;

public class MySQLRepository<T> implements Repositorio<T> {
    private final Map<String, T> banco = new HashMap<>();

    @Override
    public void salvar(T entidade) {
        String id = gerarId(entidade);
        banco.put(id, entidade);
        System.out.println("[MySQL] Salvo id=" + id + ": " + entidade);
    }

    @Override
    public T buscar(String id) {
        System.out.println("[MySQL] Buscando id=" + id);
        return banco.get(id);
    }

    private String gerarId(T entidade) {
        return Integer.toHexString(entidade.hashCode());
    }
}

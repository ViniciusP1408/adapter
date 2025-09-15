package AdapterRepositorio;

import java.util.HashMap;
import java.util.Map;

public class MongoAdapter<T> implements Repositorio<T> {
    private final MongoDBRepository<T> mongo;
    private final Map<String, String> ultimoIdPorEntidade = new HashMap<>();

    public MongoAdapter(MongoDBRepository<T> mongo) {
        this.mongo = mongo;
    }

    @Override
    public void salvar(T entidade) {
        String id = mongo.insert(entidade);
        ultimoIdPorEntidade.put(Integer.toHexString(entidade.hashCode()), id);
    }

    @Override
    public T buscar(String id) {
        String mongoId = ultimoIdPorEntidade.getOrDefault(id, id);
        return mongo.findById(mongoId);
    }
}

package AdapterRepositorio;

public interface Repositorio<T> {
    void salvar(T entidade);
    T buscar(String id);
}

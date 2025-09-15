package AdapterRepositorio;

public class AppRepositorio {
    public static void main(String[] args) {
        Usuario u = new Usuario("Ana");

        Repositorio<Usuario> repoMySQL = new MySQLRepository<>();
        repoMySQL.salvar(u);
        String idHash = Integer.toHexString(u.hashCode());
        System.out.println("Buscando via MySQL com idHash: " + idHash);
        System.out.println("Resultado: " + repoMySQL.buscar(idHash));

        MongoDBRepository<Usuario> mongo = new MongoDBRepository<>();
        Repositorio<Usuario> repoMongo = new MongoAdapter<>(mongo);
        repoMongo.salvar(u);
        System.out.println("Buscando via MongoAdapter com idHash: " + idHash);
        System.out.println("Resultado: " + repoMongo.buscar(idHash));
    }
}

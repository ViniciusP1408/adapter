package AdapterRepositorio;

import java.util.HashMap;
import java.util.Map;

public class MongoDBRepository<T> {
    private final Map<String, T> collection = new HashMap<>();

    public String insert(T doc) {
        String id = ObjectIdGenerator.next();
        collection.put(id, doc);
        System.out.println("[MongoDB] insert _id=" + id + ": " + doc);
        return id;
    }

    public T findById(String id) {
        System.out.println("[MongoDB] findById _id=" + id);
        return collection.get(id);
    }
}

class ObjectIdGenerator {
    private static int seq = 0;
    static String next() {
        return "64f" + (seq++);
    }
}

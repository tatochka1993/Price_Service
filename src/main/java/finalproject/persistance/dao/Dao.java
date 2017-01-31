package finalproject.persistance.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao<T, I extends Serializable> {

    default List<T> getAll() {
        throw new UnsupportedOperationException();
    }

    default T getById(I id) {
        throw new UnsupportedOperationException();
    }

    default void create(T entity) {
        throw new UnsupportedOperationException();
    }

}

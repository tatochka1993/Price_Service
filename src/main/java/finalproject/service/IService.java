package finalproject.service;

import java.io.Serializable;
import java.util.List;

public interface IService<T, I extends Serializable> {

    default List<T> getAll() {
        throw new UnsupportedOperationException();
    }

    default T getById(I id) {
        throw new UnsupportedOperationException();
    }

}


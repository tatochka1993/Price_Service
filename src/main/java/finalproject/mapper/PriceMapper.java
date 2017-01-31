package finalproject.mapper;

import java.util.List;
import java.util.stream.Collectors;

public interface PriceMapper<T, U> {

    default List<U> modelsToDto(List<T> models) {
        if (models == null) {
            throw new IllegalArgumentException();
        }
        System.out.println(models);
        return models.stream().map(this::modelToDto)
                .collect(Collectors.toList());
    }

    T dtoToModel(U dto);

    U modelToDto(T model);
}

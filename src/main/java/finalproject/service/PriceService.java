package finalproject.service;

import com.finalproject.model.Price;

public interface PriceService extends IService<Price, Long > {

    double getCostById(int id);

    void update(int productId, double cost);

    void delete(int productId);

    void create(int productId, double cost);

}

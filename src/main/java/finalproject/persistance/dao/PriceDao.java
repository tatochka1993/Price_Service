package finalproject.persistance.dao;

import finalproject.model.Price;

public interface PriceDao extends Dao<Price, Long> {

    double getCostById(int id);

    void update(int productId, double cost);

    void delete(int productId);

    void create(int productId, double cost);
}

package finalproject.persistance.dao.impl;

import finalproject.model.Price;
import finalproject.persistance.dao.PriceDao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@SuppressWarnings("unchecked")
public class PriceDaoImpl implements PriceDao {
    private static final String GET_ALL_PRICES = "FROM Price";
    private static final String COUNT_ALL_PRICES = "SELECT COUNT(*) FROM Price";

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public double getCostById(int id) {
        return (Double) sessionFactory.getCurrentSession()
                .createQuery("SELECT cost FROM Price Where idProduct = " + id).uniqueResult();
    }

    @Override
    public void update(int productId, double cost) {
        Query query = sessionFactory.getCurrentSession()
                .createQuery("update Price set cost = :cost" + " where idProduct = :idProduct");
        query.setParameter("cost", cost);
        query.setParameter("idProduct", productId);
        query.executeUpdate();
    }

    @Override
    public void delete(int productId) {
        Query query = sessionFactory.getCurrentSession()
                .createQuery("delete Price where idProduct = :idProduct");
        query.setParameter("idProduct", productId);
        query.executeUpdate();
    }

    @Override
    public void create(int productId, double cost) {

        Price price = new Price();
        price.setIdProduct(productId);
        price.setCost(cost);
        sessionFactory.getCurrentSession()
                .save(price);
    }

    public List<Price> getAll() {
        return sessionFactory.getCurrentSession()
                .createQuery(GET_ALL_PRICES).list();
    }
}

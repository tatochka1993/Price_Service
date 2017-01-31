package finalproject.service.impl;

import com.finalproject.model.Price;
import com.finalproject.persistance.dao.PriceDao;
import com.finalproject.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PriceServiceImpl implements PriceService {
    @Autowired
    private PriceDao priceDao;

    @Override
    public List<Price> getAll() {
        return priceDao.getAll();
    }

    @Override
    public double getCostById(int id) {
        return priceDao.getCostById(id);
    }

    public void update(int productId, double cost) {
        priceDao.update(productId, cost);
    }

    @Override
    public void delete(int productId) {
        priceDao.delete(productId);
    }

    @Override
    public void create(int productId, double cost) {
        priceDao.create(productId, cost);
    }

}

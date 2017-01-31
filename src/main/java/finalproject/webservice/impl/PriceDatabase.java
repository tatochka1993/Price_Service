package finalproject.webservice.impl;

import com.finalproject.dto.PriceDto;
import com.finalproject.mapper.PriceMapper;
import com.finalproject.model.Price;
import com.finalproject.service.PriceService;
import com.finalproject.webservice.IPriceDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;

@Service
@WebService(endpointInterface = "" +
		"" +
		"")
public class PriceDatabase implements IPriceDatabase {

	@Autowired
	private PriceService priceService;
	@Autowired
	private PriceMapper<Price, PriceDto> priceMapper;

	@Override
	public List<PriceDto> getAllPrices() {
		return priceMapper.modelsToDto(priceService.getAll());
	}

	@Override
	public double getCostById(int id) {
		return priceService.getCostById(id);
	}

	@Override
	public void update(int productId, double cost) {
		priceService.update(productId, cost);
	}

	@Override
	public void delete(int productId) {
		priceService.delete(productId);
	}

	@Override
	public void create(int productId, double cost) {
		priceService.create(productId, cost);
	}
}

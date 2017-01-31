package finalproject.mapper.impl;

import com.finalproject.dto.PriceDto;
import com.finalproject.mapper.PriceMapper;
import com.finalproject.model.Price;
import org.springframework.stereotype.Component;

@Component
public class PriceMapperImpl implements PriceMapper<Price, PriceDto> {

	@Override
	public Price dtoToModel(PriceDto priceDto) {
		final Price price = new Price();
		price.setId(priceDto.getId());
		price.setIdProduct(priceDto.getIdProduct());
		price.setCost(priceDto.getCost());
		return price;
	}

	@Override
	public PriceDto modelToDto(Price price) {
		final PriceDto priceDto = new PriceDto();
		priceDto.setId(price.getId());
		priceDto.setIdProduct(price.getIdProduct());
		priceDto.setCost(price.getCost());
		return priceDto;
	}

}

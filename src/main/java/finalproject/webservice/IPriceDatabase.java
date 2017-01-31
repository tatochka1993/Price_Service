package finalproject.webservice;

import com.finalproject.dto.PriceDto;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import java.util.List;

@Component
@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface IPriceDatabase {

	@WebMethod
	List<PriceDto> getAllPrices();

	@WebMethod
	double getCostById(int id);

	@WebMethod
	void update(int productId, double cost);

	@WebMethod
	void delete(int productId);

	@WebMethod
	void create(int productId, double cost);
}

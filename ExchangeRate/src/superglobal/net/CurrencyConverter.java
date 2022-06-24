package superglobal.net;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CurrencyConverter {
	
	private final double EXCHANGE_RATE_USD_ZAR = 0.89F;
	
	@WebMethod
	public double usdtoZar(double usd){
		return usd * EXCHANGE_RATE_USD_ZAR;
	}
}

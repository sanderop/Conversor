package conversor;

public class Conversor {

	public Double convertirMoneda(double moneda, double cantidad) {
		double calculoFinal = cantidad * moneda;
		return calculoFinal;
	}
	
	public Double convertirTempF(double temperatura) {
		double calculoFinal = (temperatura*1.8)+32 ;
		return calculoFinal;
	}

	public Double convertirTempC(double temperatura) {
		double calculoFinal = (temperatura-32)/1.8 ;
		return calculoFinal;
	}
}

package conversor;

public class Temperatura {
	
	Conversor conversorTemp = new Conversor();
	
	public Double convertirAFahrenheit(Double temperatura) {
		Double resultado = conversorTemp.convertirTempF(temperatura);
		return resultado;
	}
	
	public Double convertirACelsius(Double temperatura) {
		Double resultado = conversorTemp.convertirTempC(temperatura);
		return resultado;
	}
	
	
	
}

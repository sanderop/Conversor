package conversor;

public class SelectorTemperatura {

	private String temperatura;
	
	public String getTemperatura() {
		return temperatura;
	}
	
	Temperatura cambioTemperatura = new Temperatura();
	
	public Double elegirCambio(String opcionElegida, Double temperatura) {
		Double resultado = 0.0;
		switch (opcionElegida) {
			case "Celsius a Fahrenheit":
				resultado = cambioTemperatura.convertirAFahrenheit(temperatura);
				this.temperatura = "Grados Fahrenheit";
				break;
				
			case "Fahrenheit a Celsius":
				resultado = cambioTemperatura.convertirACelsius(temperatura);
				this.temperatura = "Grados Celsius";
				break;
			default: break;
		}
		return resultado;
	}
}

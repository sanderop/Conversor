package conversor;

public class SelectorMoneda {
	
	private String moneda;
	
	Colombia COP = new Colombia();
	
	public String getMoneda() {
		return moneda;
	}
	
	public Double elegirCambio(String opcionElegida, Double cantidadMoneda) {
	Double resultado = 0.0;
	switch (opcionElegida) {
		case "COP a Dólar":
			COP.setValor(COP.getUSD());
			resultado = COP.convertir(cantidadMoneda);
			this.moneda = "Dolares";
			break;
		
		case "COP a Euros":
			COP.setValor(COP.getEUR());
			resultado = COP.convertir(cantidadMoneda);
			this.moneda = "Euros";
			break;
			
		case "COP a Libras Esterlinas":
			COP.setValor(COP.getGBP());
			resultado = COP.convertir(cantidadMoneda);
			moneda = "Libras Esterlinas";
			break;
			
		case "COP a Yen Japonés":
			COP.setValor(COP.getJPY());
			resultado = COP.convertir(cantidadMoneda);
			moneda = "Yenes Japonés";
			break;
			
		case "COP a Won sul-coreano":
			COP.setValor(COP.getKRW());
			resultado = COP.convertir(cantidadMoneda);
			moneda = "Wones sul-coreano";
			break;
			
		case "Dólar a COP":
			COP.setValor(COP.getCOPUSD());
			resultado = COP.convertir(cantidadMoneda);
			moneda = "Pesos Colombianos";
			break;
			
		case "Euros a COP":
			COP.setValor(COP.getCOPEUR());
			resultado = COP.convertir(cantidadMoneda);
			moneda = "Pesos Colombianos";
			break;
			
		case "Libras Esterlinas a COP":
			COP.setValor(COP.getCOPGBP());
			resultado = COP.convertir(cantidadMoneda);
			moneda = "Pesos Colombianos";
			break;
			
		case "Yen Japonés a COP":
			COP.setValor(COP.getCOPJPY());
			resultado = COP.convertir(cantidadMoneda);
			moneda = "Pesos Colombianos";
			break;
		
		case "Won sul-coreano a COP":
			COP.setValor(COP.getCOPKRW());
			resultado = COP.convertir(cantidadMoneda);
			moneda = "Pesos Colombianos";
			break;
	
		default:
			break;
		}
	
		return resultado;
	}
}

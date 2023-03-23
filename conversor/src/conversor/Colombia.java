package conversor;

public class Colombia extends Moneda{
	
	private Double USD = 0.000209;
	private Double EUR = 0.000177;
	private Double GBP = 0.000151;
	private Double JPY = 0.023;
	private Double KRW = 0.238;
	private Double COPUSD = 4713.33;
	private Double COPEUR = 5015.74;
	private Double COPGBP = 6589.71;
	private Double COPJPY = 34.90;
	
	
	public Colombia() {
		setNombre("COP");
	}
	
	public Double getCOPUSD() {
		return COPUSD;
	}

	public void setCOPUSD(Double cOPUSD) {
		COPUSD = cOPUSD;
	}

	public Double getCOPEUR() {
		return COPEUR;
	}

	public void setCOPEUR(Double cOPEUR) {
		COPEUR = cOPEUR;
	}

	public Double getCOPGBP() {
		return COPGBP;
	}

	public void setCOPGBP(Double cOPGBP) {
		COPGBP = cOPGBP;
	}

	public Double getCOPJPY() {
		return COPJPY;
	}

	public void setCOPJPY(Double cOPJPY) {
		COPJPY = cOPJPY;
	}

	public Double getCOPKRW() {
		return COPKRW;
	}

	public void setCOPKRW(Double cOPKRW) {
		COPKRW = cOPKRW;
	}

	private Double COPKRW = 2.86;

	public Double getUSD() {
		return USD;
	}

	public void setUSD(Double uSD) {
		USD = uSD;
	}

	public Double getEUR() {
		return EUR;
	}

	public void setEUR(Double eUR) {
		EUR = eUR;
	}

	public Double getGBP() {
		return GBP;
	}

	public void setGBP(Double gBP) {
		GBP = gBP;
	}

	public Double getJPY() {
		return JPY;
	}

	public void setJPY(Double jPY) {
		JPY = jPY;
	}

	public Double getKRW() {
		return KRW;
	}

	public void setKRW(Double kRW) {
		KRW = kRW;
	}
	
	Conversor conversorMoneda = new Conversor();
	
	public Double convertir(Double cantidad) {
		Double resultado = conversorMoneda.convertirMoneda(this.getValor(), cantidad);
		return resultado;
	}
	
	
}

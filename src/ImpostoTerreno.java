public class ImpostoTerreno {
	double areaTotal;
	double areaConstruida;

	public ImpostoTerreno(double areaTotal, double areaConstruida){
		this.areaTotal = areaTotal;
		this.areaConstruida = areaConstruida;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

	public void setAreaConstruida(double areaConstruida) {
		this.areaConstruida = areaConstruida;
	}

	public double calculoImposto(){
		return (areaTotal * 5 - areaConstruida) + (areaConstruida * 3.5);
	}
}

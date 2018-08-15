public class CalculoImposto {
	private double areaTotal;
	private double areaConstruida;
	private String nomeImovel;

	public CalculoImposto(double areaTotal, double areaConstruida){
		this.areaTotal = areaTotal;
		this.areaConstruida = areaConstruida;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

	public void setAreaConstruida(double areaConstruida) {
		this.areaConstruida = areaConstruida;
	}

	public void setNomeImovel(String nomeImovel) {
		this.nomeImovel = nomeImovel;
	}

	public String getNomeImovel() {
		return nomeImovel;
	}

	public double apuraImposto(){
		return (areaTotal * 5 - areaConstruida) + (areaConstruida * 3.8);
	}

}

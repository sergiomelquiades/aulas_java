public class AzulejoParede {
	//Propriedades da parede
	private double alturaParede;
	private double larguraParede;

	//Propriedades do azulejo
	private double alturaAzulejo;
	private double larguraAzulejo;

	private String nomeParede;
	private String nomeAzulejo;

	//Construtor
	public AzulejoParede(double alturaParede, double larguraParede, double alturaAzulejo, double larguraAzulejo){
		this.alturaParede = alturaParede;
		this.larguraParede = larguraParede;
		this.alturaAzulejo = alturaAzulejo;
		this.larguraAzulejo = larguraAzulejo;
	}

	//Getters e Setters
	public void setAlturaParede(double alturaParede){
		this.alturaParede = alturaParede;
	}

	public void setLarguraParede(double larguraParede){
		this.larguraParede = larguraParede;
	}

	public void setAlturaAzulejo(double alturaAzulejo){
		this.alturaAzulejo = alturaAzulejo;
	}

	public void setLarguraAzulejo(double larguraAzulejo){
		this.larguraAzulejo = larguraAzulejo;
	}

	public void setNomeParede(String nomeParede){
		this.nomeParede = nomeParede;
	}

	public String getNomeParede(){
		return nomeParede;
	}

	public void setNomeAzulejo(String nomeAzulejo) {
		this.nomeAzulejo = nomeAzulejo;
	}

	public String getNomeAzulejo() {
		return nomeAzulejo;
	}

	//Metodos
	public double calculoAreaParede(){
		return alturaParede * larguraParede;
	}

	public double calculoAreaAzulejo(){
		return alturaAzulejo * larguraAzulejo;
	}

	public double calculoQtdeAzulejo(){
		return calculoAreaParede() / calculoAreaAzulejo();
	}
}

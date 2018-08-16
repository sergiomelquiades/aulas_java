public class VolumeOleo {
	double raio;
	double altura;
	String nome;

	public VolumeOleo(double raio, double altura){
		this.raio = raio;
		this.altura = altura;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public double calculoVolume(){
		return 3.14159 * raio * 2 * altura;
	}
}

public class CaculadorRetangulo {
	//Atributos
	private double comprimento;
	private double largura;
	private String descricao;

	//Construtor
	public CaculadorRetangulo(double comprimento, double largura) {
		this.comprimento = comprimento;
		this.largura = largura;
	}

	//Metodos getters e setters
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	//Metodos
	public double calculoArea() {
		return comprimento * largura;
	}

	public double calculoPerimetro() {
		return (2 * comprimento) + (2 * largura);
	}
}

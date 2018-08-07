// *********************************  Camada de domínio  **********************************/
// O que ela é: Conceitos -> objetos(propriedade e métodos) -> relacionamento entre objetos
// DDD - Domain Driven Development
// ***************************************************************************************/



// Definição da Classe
public class CalculadorIMC {
	// Atributos
	private double peso;
	private double altura;
	private String nome;

	// Construtor
	public CalculadorIMC(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	// Métodos getters e setters
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Método
	public double calculoIMC() {
		return peso / (altura * 2);
	}
}

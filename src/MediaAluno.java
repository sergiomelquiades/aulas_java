public class MediaAluno {

	//Atributos
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private String nome;

	//Construtor
	public MediaAluno(double nota1, double nota2, double nota3, double nota4){
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}

	//Getters e Setters
	public void setNota1(double nota1){
		this.nota1 = nota1;
	}

	public void setNota2(double nota2){
		this.nota2 = nota2;
	}

	public void setNota3(double nota3){
		this.nota3 = nota3;
	}

	public void setNota4(double nota4){
		this.nota4 = nota4;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	//Metodo
	public double calculoMedia(){
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}
}

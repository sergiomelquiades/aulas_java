public class CalculadorRetanguloTests {
	public static void main(String[] args) {
		CaculadorRetangulo calc = new CaculadorRetangulo(100, 200);
		calc.setDescricao("Retangulo 1");
		print(calc);


		calc.setDescricao("Retangulo 2");
		calc.setComprimento(200);
		calc.setLargura(300);
		print(calc);


		calc.setDescricao("Retangulo 3");
		calc.setComprimento(300);
		calc.setLargura(400);
		print(calc);

	}

	public static void print(CaculadorRetangulo caculadorRetangulo){
		System.out.println("A area do " + caculadorRetangulo.getDescricao() + " é " + caculadorRetangulo.calculoArea() + " e o perimetro é " + caculadorRetangulo.calculoPerimetro());
	}
}

public class CalculadorRetanguloTests {
	public static void main(String[] args) {
		CaculadorRetangulo calc = new CaculadorRetangulo(140, 200);
		calc.calculoArea();
		calc.calculoPerimetro();
		System.out.println("A area é " + calc.calculoArea());
		System.out.println("O perimetro é " + calc.calculoPerimetro());
		//Verificar como fazer caso queira alterar os valores
	}
}

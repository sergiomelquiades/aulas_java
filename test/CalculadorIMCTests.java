public class CalculadorIMCTests {
	public static void main(String[] args) {
		CalculadorIMC calc = new CalculadorIMC(85,1.68);
		calc.setNome("Fulano");
		print(calc);

		// Nova configuração do objeto
		calc.setNome("Sicrano");
		calc.setPeso(95);
		calc.setAltura(1.75);
		print(calc);
	}

	public static void print(CalculadorIMC calculadorIMC) {
		System.out.println("O IMC do " + calculadorIMC.getNome() + " é " + calculadorIMC.calculoIMC());

	}
}

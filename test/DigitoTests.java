public class DigitoTests {
	public static void main(String[] args) {
		Digito calc = new Digito(0, 8);
		calc.setNumeros("Para 0 e 8: ");
		print(calc);

		calc.setNumeros("Para 2 e 10: ");
		calc.setX(2);
		calc.setY(10);
		print(calc);
	}

	public static void print(Digito digito) {
		System.out.println(digito.getNumeros() + digito.mostraDigito());
	}
}

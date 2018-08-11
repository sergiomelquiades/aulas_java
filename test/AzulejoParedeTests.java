public class AzulejoParedeTests {
	public static void main(String[] args) {
		AzulejoParede calc = new AzulejoParede(4, 10, 0.15, 0.30);
		calc.setNomeParede("Parede 1");
		calc.setNomeAzulejo("Azulejo 1");
		print(calc);

		calc.setNomeParede("Parede 2");
		calc.setNomeAzulejo("Azulejo 2");
		calc.setAlturaParede(3);
		calc.setLarguraParede(6);
		calc.setAlturaAzulejo(0.10);
		calc.setLarguraAzulejo(0.20);
		print(calc);
	}

	public static void print(AzulejoParede azulejoParede){
		System.out.println("São necessários " + azulejoParede.calculoQtdeAzulejo() + " " + azulejoParede.getNomeAzulejo() + " para cobrir a " + azulejoParede.getNomeParede());
	}
}

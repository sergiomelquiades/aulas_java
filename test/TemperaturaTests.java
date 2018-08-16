public class TemperaturaTests {
	public static void main(String[] args) {
		Temperatura converte = new Temperatura(68);
		converte.setPeriodo("manhã");
		print(converte);

		converte.setPeriodo("tarde");
		converte.setGrausF(95);
		print(converte);

		converte.setPeriodo("noite");
		converte.setGrausF(50);
		print(converte);
	}

	public static void print(Temperatura temperatura) {
		System.out.println("O valor de " + temperatura.grausF + "F em C no período da " + temperatura.getPeriodo() + " é " + temperatura.converteGraus());
	}
}

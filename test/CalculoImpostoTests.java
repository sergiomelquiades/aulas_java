public class CalculoImpostoTests {
	public static void main(String[] args) {
		CalculoImposto calc = new CalculoImposto(360, 180);
		calc.setNomeImovel("Imovel 1");
		print(calc);

		calc.setNomeImovel("Imóvel 2");
		calc.setAreaTotal(400);
		calc.setAreaConstruida(360);
		print(calc);
	}

	public static void print(CalculoImposto calculoImposto){
		System.out.println("O valor do imposto do " + calculoImposto.getNomeImovel() + " é R$ " + calculoImposto.apuraImposto() );
	}
}

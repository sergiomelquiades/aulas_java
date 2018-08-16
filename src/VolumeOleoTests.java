public class VolumeOleoTests {
	public static void main(String[] args) {
		VolumeOleo calc = new VolumeOleo(3.5, 15);
		calc.setNome("Lata de 1L");
		print(calc);

		calc.setNome("Lata 2L");
		calc.setRaio(6.9);
		calc.setAltura(20);
		print(calc);
	}

	public static void print(VolumeOleo volumeOleo) {
		System.out.println("O volume da " + volumeOleo.getNome() + " é " + volumeOleo.calculoVolume() );
	}
}

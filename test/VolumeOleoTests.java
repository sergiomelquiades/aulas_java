public class VolumeOleoTests {
	public static void main(String[] args) {
		VolumeOleo calc = new VolumeOleo(5.41, 10.83);
		calc.setNome("Lata de 1L");
		print(calc);

		calc.setNome("Lata 2L");
		calc.setRaio(10.82);
		calc.setAltura(21.66);
		print(calc);
	}

	public static void print(VolumeOleo volumeOleo) {
		System.out.println("O volume da " + volumeOleo.getNome() + " é " + volumeOleo.calculoVolume() );
	}
}

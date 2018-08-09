public class MediaAlunoTests {
	public static void main(String[] args) {
		MediaAluno calc = new MediaAluno(10, 8.5, 7.5, 8);
		calc.setNome("Sergio");
		print(calc);

		calc.setNome("Eliane");
		calc.setNota1(10);
		calc.setNota2(9);
		calc.setNota3(9.5);
		calc.setNota4(8);
		print(calc);

		calc.setNome("Maryanne");
		calc.setNota1(10);
		calc.setNota2(9.4);
		calc.setNota3(10);
		calc.setNota4(8.5);
		print(calc);

		calc.setNome("Henrique");
		calc.setNota1(10);
		calc.setNota2(9.9);
		calc.setNota3(8.9);
		calc.setNota4(9);
		print(calc);

	}

	public static void print(MediaAluno mediaAluno){
		System.out.println("A média do aluno " + mediaAluno.getNome() + " é " + mediaAluno.calculoMedia());
	}
}

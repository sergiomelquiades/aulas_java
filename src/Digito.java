public class Digito {
	private int x;
	private int y;
	private int z;
	private int result;
	private String numeros;

	public Digito(int x, int y){
		this.x = x;
		this.y = y;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setNumeros(String numeros) {
		this.numeros = numeros;
	}

	public String getNumeros() {
		return numeros;
	}


	public int mostraDigito(){
		while (result <= 2){
		return (x * y)%10;

		}

		return result++;
	}


}

public class Digito {
	int x;
	int y;
	int digito;
	String numeros;

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
		while (digito <= 2){
			return digito = (x * y)%10;
		}

		return digito++;
	}

}

public class Temperatura {
	double grausF;
	String periodo;

	public Temperatura(double grausF){
		this.grausF = grausF;
	}

	public void setGrausF(double grausF) {
		this.grausF = grausF;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getPeriodo() {
		return periodo;
	}

	public double converteGraus(){
		return (grausF - 32) * 5 / 9;
	}
}

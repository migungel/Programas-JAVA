
public class Coche extends Vehiculo{
	private int numeroPuertas;
	
	public Coche(String matricula, int numPuertas) {
		super(matricula);
		this.numeroPuertas = numPuertas;
	}
	
	public Coche(String matricula, double velocidad, int numPuertas) {
		super(matricula, velocidad);
		this.numeroPuertas = numPuertas;
	}
	
	public String toString() {
		return super.toString() +
				"Numero de puertas: " + numeroPuertas + "\n";
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

}

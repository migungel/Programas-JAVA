
public class Vehiculo {
	private String matricula;
	private double velocidad;
	
	public Vehiculo(String matricula) {
		this.matricula = matricula;
		this.velocidad = 0;
	}
	
	public Vehiculo(String matricula, double velocidad) {
		this.matricula = matricula;
		this.velocidad = velocidad;
	}
	
	public String toString() {
		return "Matricula: " + matricula + "\n" +
				"Velocidad: " + velocidad + " km/h\n";
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

}

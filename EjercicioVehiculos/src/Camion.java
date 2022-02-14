
public class Camion extends Vehiculo{
	private Remolque remolque;
	
	public Camion(String matricula) {
		super(matricula);
		this.remolque = null;
	}
	
	public Camion(String matricula, double velocidad) {
		super(matricula, velocidad);
		this.remolque = null;
	}
	
	public String toString() {
		String cadena = super.toString();
		if (this.remolque!=null) {
			cadena = cadena + remolque.toString();
		}
		return cadena;
	}
	
	public void ponRemolque(Remolque remolque) {
		this.remolque = remolque;
	}
	
	public void quitarRemolque() {
		this.remolque = null;
	}

	public Remolque getRemolque() {
		return remolque;
	}

	public void setRemolque(Remolque remolque) {
		this.remolque = remolque;
	}

}

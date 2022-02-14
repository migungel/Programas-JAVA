
public class Cliente extends Persona{
	private int porcentajeDescuento;
	
	public String toString() {
		return super.toString() + 
				"Porcentaje de descuento: " + porcentajeDescuento + "\n";
	}

	public int getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(int porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

}

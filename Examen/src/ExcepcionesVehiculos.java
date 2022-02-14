
public class ExcepcionesVehiculos extends NullPointerException{
	public ExcepcionesVehiculos(String mensaje) {
		super(mensaje);
	}
	
	public void mensaje() {
		System.out.println(this.getMessage());
	}
}

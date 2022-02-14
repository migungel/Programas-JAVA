import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private long cedula;
	private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
	
	public String toString() {
		return "Nombre: "+ nombre + "\n" +
		"Cedula: "+ cedula + "\n";
	}
	
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getCedula() {
		return cedula;
	}
	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

}


public class Persona {
	private String nombre;
	private String apellido;
	private String numCedula;
	private int edad;
	
	public String toString() {
		return "Nombre: " + nombre + "\n" +
				"Apellido: " + apellido + "\n" +
				"Cedula: " + numCedula + "\n" +
				"Edad: " + edad + "\n";
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNumCedula() {
		return numCedula;
	}
	public void setNumCedula(String numCedula) {
		this.numCedula = numCedula;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}

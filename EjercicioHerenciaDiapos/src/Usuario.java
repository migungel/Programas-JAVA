
public class Usuario extends Persona{
	private String usuario;
	private String clave;
	
	public String toString() {
		return super.toString() + 
				"Usuario: " + usuario + "\n" +
				"Clave: " + clave + "\n";
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}

}


public class ExceptionBisiesto extends Exception{
	public ExceptionBisiesto(String mensaje) {
		super(mensaje);
	}
	
	public void mensaje() {
		System.out.println(this.getMessage());
	}

}

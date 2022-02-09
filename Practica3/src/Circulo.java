
public class Circulo extends Padre implements Interfaz{
	private int radio;
	private int x = 0;
	private int y = 0;
	
	public String mover(int x, int y) {
		this.x = x;
		this.y = y;
		return "(" + x + ", " + y + ")";
	}
	
	public double calcularPerimetro(){
		return 2*(Math.PI)*radio;
	}
	
	public double calcularArea(){
		return (Math.PI)*radio*radio;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}

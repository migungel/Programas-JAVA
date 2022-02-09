
public class Rectangulo extends Padre implements Interfaz{
	private int base;
	private int altura;
	private int x = 0;
	private int y = 0;
	
	public String mover(int x, int y) {
		this.x = x;
		this.y = y;
		return "(" + x + ", " + y + ")";
	}
	
	public double calcularPerimetro(){
		return 2*base + 2*altura;
	}
	
	public double calcularArea(){
		return base*altura;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}

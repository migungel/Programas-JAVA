
public class Remolque {
	private String color;
	private String peso;
	
	public String toString() {
		return "Color: " + color + "\n" +
				"Peso: " + peso + "\n";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

}


public class Vehiculo {
	private String color;
	private String placa;
	private String marca;
	private String modelo;
	private int anio;
	private String tipo;
	
	public String toString() {
		return "Color: " + color + "\n" +
		"Placa: " + placa + "\n" +
		"Marca: " + marca + "\n" +
		"Modelo: " + modelo + "\n" +
		"Tipo: " + tipo + "\n" ;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}

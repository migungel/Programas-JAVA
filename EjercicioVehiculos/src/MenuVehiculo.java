import java.util.ArrayList;
import java.util.Scanner;

public class MenuVehiculo {
	
	public static void datosInciales(ArrayList<Vehiculo> lista, Scanner sc) {
		Remolque remolque = new Remolque();
		remolque.setColor("verde");
		remolque.setPeso("23");
		Camion camion = new Camion("ASD334");
		camion.ponRemolque(remolque);
		lista.add(camion);
		
		Camion camion2 = new Camion("asf23");
		lista.add(camion2);
	}

	public static void main(String[] args) {
		ArrayList<Vehiculo> lista = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		datosInciales(lista, sc);
		for (int x = 0; x < lista.size(); x++) {
			System.out.println(lista.get(x));
		}
		
		sc.close();
	}

}

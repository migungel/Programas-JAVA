import java.util.Scanner;

public class Practica2 {

	public static void main(String[] args) {
		System.out.println("***COTIZAR PIZZA***");
		System.out.println("Ingrese la cantidad de ingredientes de la pizza: ");
		Scanner sc = new Scanner(System.in);
		int cantidad = sc.nextInt();
		Pizza pizza = new Pizza();
		
		for (int i = 0; i < cantidad; i++) {
			sc.nextLine();
			int n = i+1;
			Ingrediente ingredientes = new Ingrediente();
			System.out.println("INGREDIENTES");
			System.out.print("Ingrese la descripcion del Ingrediente " + n + ": ");
			String ingrediente = sc.nextLine();
			ingredientes.setDescripcion(ingrediente);
			
			System.out.print("Ingrese el precio del Ingrediente " + n + ": ");
			float precio = sc.nextFloat();
			ingredientes.setPrecio(precio);
			
			pizza.getIngredientes().add(ingredientes);
		}
		
		System.out.println("\n");
		System.out.println("*******     INFORMACION DE LA PIZZA     *******");
		System.out.println("\t" + "INGREDIENTES" + "\t" + "PRECIO");
		float costo = 0;
		for (int a = 0; a < cantidad; a++) {
			System.out.println("\t "+pizza.getIngredientes().get(a).getDescripcion()+"\t\t"+pizza.getIngredientes().get(a).getPrecio());
			costo += pizza.getIngredientes().get(a).getPrecio();
		}
		System.out.println("__________________________________________");
		System.out.println("Precio Pizza: " + costo);
		sc.close();
	}

}

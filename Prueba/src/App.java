import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		while(opcion!=5) {
			System.out.println("HENU" + "\n" +
					"1. Verificar Pumero Perfecto" + "\n" +
					"2. Imprimir tabla de multiplicar" + "\n" +
					"3. Verificar factorial" + "\n" +
					"4. Numero Invertido" + "\n" +
					"5. Salir" + "\n");
		
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Dato inválido \n");
			}
			opcion = sc.nextInt();
			int i;
		
			switch (opcion) {
			case 1:
				System.out.println("Ingrese un número");
				while (!sc.hasNextInt()) {
					sc.next();
					System.out.println("Dato inválido \n");
				}
				int num1 = sc.nextInt();
				int suma = 0;
				for (i = 1; i < num1; i++) {                            
					if (num1 % i == 0) {
						suma = suma + i;
					}
				}
				if (suma == num1) {                
					System.out.println("Numero es perfecto \n");
				} else {
					System.out.println("Numero no es perfecto \n");

				}
				break;
				
			case 2:
				System.out.println("Ingrese un número");
				while (!sc.hasNextInt()) {
					sc.next();
					System.out.println("Dato inválido \n");
				}
				int num2 = sc.nextInt();
				for (i = 0; i < 13; i++) {
					int r = num2*i;
					System.out.println(num2 + " x " + i + " = " + r);
				}
				System.out.println("\n");
				break;
			
			case 3:
				System.out.println("Ingrese un número");
				while (!sc.hasNextInt()) {
					sc.next();
					System.out.println("Dato inválido \n");
				}
				int num3 = sc.nextInt();
				int resultado = 1;
				for (i = 1; i <= num3; i++) {
					resultado *= i;
				}
				System.out.println("El factorial de " + num3 + " es: " + resultado + " \n");
				break;
			
			case 4:
				System.out.println("Ingrese un número");
				while (!sc.hasNextInt()) {
					sc.next();
					System.out.println("Dato inválido \n");
				}
				int num4 = sc.nextInt();
				int resto, invertido = 0;
				while(num4 > 0) {
					resto = num4 % 10;
					invertido = invertido * 10 + resto;
					num4 /= 10;
				}
				
				System.out.println("El número invertido es: " + invertido + " \n");
				break;
			
			case 5:
				opcion = 5;
				break;
				
			default:
				System.out.println("Ingrese una de las opciones \n");
				break;
				
			}
		}
		sc.close();
	}

}

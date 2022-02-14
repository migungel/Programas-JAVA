import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Dato inválido \n");
		}
		int num1 = sc.nextInt();
		int suma = 0;
		for (int i = 1; i < num1; i++) {                            
			if (num1 % i == 0) {
				suma = suma + i;
			}
		}
		if (suma == num1) {                
			System.out.println("Numero es perfecto \n");
		} else {
			System.out.println("Numero no es perfecto \n");

		}
		sc.close();

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int f1, f2, num=0;
		f1 = 1;
		f2 = 1;
		
		System.out.println("Serie de Fibonacci con N terminos.");
		while(num<=1) {
			System.out.println("Ingrese un numero mayor que 1");
			num = sc.nextInt();
		}
		
		System.out.print(f1+",");
		for(int i = 2; i<=num; i++) {
			System.out.print(f2+",");
			f2 = f1 + f2;
			f1 = f2 - f1;
		}
		
		sc.close();

	}

}

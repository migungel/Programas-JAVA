import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, cnt = 0;
		while(num>=0) {
			System.out.println("Ingrese un numero");
			num = sc.nextInt();
			if (num%10 == 2) {
				cnt += 1;
			}else if(num<0){
				System.out.println("Programa terminado, numeros acabados en dos: " + cnt);
			}
		}
		sc.close();

	}

}

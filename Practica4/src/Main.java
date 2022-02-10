import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	
	public static void bisiesto(int anio) throws ExceptionBisiesto{
		if (anio % 4 != 0)
			throw new ExceptionBisiesto("El año no bisiesto");
		System.out.println("El año es bisiesto");
	}
	
	public static void bisiesto(ArrayList<Integer> array) {
		for(int x = 0; x < array.size(); x++) {
			int anio = array.get(x);
			System.out.println(anio);
			try {
				bisiesto(anio);
			}catch(ExceptionBisiesto e) {
				e.mensaje();
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(2016,2017,2018,2019));
		bisiesto(lista);
	}

}

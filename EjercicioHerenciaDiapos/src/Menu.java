import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	public static void datosIniciales(ArrayList<Persona> listaPersonas) {
		Persona per = new Persona();
		per.setNombre("Miguel");
		per.setApellido("Neira");
		per.setNumCedula("2450005885");
		per.setEdad(25);
		listaPersonas.add(per);
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Kerly");
		cliente.setApellido("Campoz");
		cliente.setNumCedula("2450001234");
		cliente.setEdad(24);
		cliente.setPorcentajeDescuento(50);
		listaPersonas.add(cliente);
		
		Usuario user = new Usuario();
		user.setNombre("Daniel");
		user.setApellido("Carrillo");
		user.setNumCedula("2450004321");
		user.setEdad(26);
		user.setUsuario("danicar");
		user.setClave("1234");
		listaPersonas.add(user);
	}
	
	public static void validar(Scanner sc) {
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Dato inválido \n");
		}
	}
	
	public static void datosPersona(Persona persona, Scanner sc) {
		System.out.println("Ingrese nombre: ");
		String nombre = sc.nextLine();
		persona.setNombre(nombre);
		
		System.out.println("Ingrese apellido: ");
		String apellido = sc.nextLine();
		persona.setApellido(apellido);
		
		System.out.println("Ingrese numero de cedula: ");
		String cedula = sc.nextLine();
		persona.setNumCedula(cedula);
		
		System.out.println("Ingrese edad: ");
		int edad = sc.nextInt();
		persona.setEdad(edad);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		datosIniciales(listaPersonas);
		int opcion = 0;
		
		while(opcion!=3) {
			System.out.println("Menu\n"+
					"1. Ingresar datos\n" + 
					"2. Imprimir datos\n" +
					"3. Salir\n");
			validar(sc);
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1:
					int ingreso=0;
					System.out.println("Desea ingresar:\n"+
										"1. Persona\n"+
										"2. Usuario\n"+
										"3. Cliente\n");
					validar(sc);
					ingreso= sc.nextInt();
					while(ingreso<1 || ingreso>3) {
						System.out.println("Ingrese una opcion válida");
						ingreso= sc.nextInt();
					}
					
					sc.nextLine();
					
					if(ingreso==1) {
						Persona persona = new Persona();
						datosPersona(persona, sc);
						listaPersonas.add(persona);
						
					}if(ingreso==2){
						Usuario usuario = new Usuario();
						datosPersona(usuario, sc);
						sc.nextLine();
						
						System.out.println("Ingrese usuario: ");
						String user = sc.nextLine();
						usuario.setUsuario(user);
						
						System.out.println("Ingrese clave: ");
						String clave = sc.nextLine();
						usuario.setClave(clave);
						
						listaPersonas.add(usuario);
						
					}if(ingreso==3){
						Cliente cliente = new Cliente();
						datosPersona(cliente, sc);
						sc.nextLine();
						
						System.out.println("Ingrese porcentaje de descuento: ");
						int porcentaje = sc.nextInt();
						cliente.setPorcentajeDescuento(porcentaje);
						
						listaPersonas.add(cliente);
					}
					
					break;
					
				case 2:
					System.out.println("******Usuarios******\n");
					for(int x = 0; x<listaPersonas.size(); x++) {
						System.out.println("Soy un(a) " + listaPersonas.get(x).getClass().getSimpleName());
						System.out.println(listaPersonas.get(x));
					}
					opcion = 3;
					break;
					
				case 3:
					System.out.println("Programa finalizado\n");
					break;
			}
			
		}
		
		sc.close();
	}

}

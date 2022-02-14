import java.util.Scanner;

public class Main {
	
	public static void datosIniciales(BaseDatos base) {
		Cliente cliente = new Cliente();
		cliente.setNombre("Miguel Neira");
		cliente.setCedula(2450005885L);
		Vehiculo car1 = new Buseta();
		car1.setColor("verde");
		car1.setMarca("mercedes benz");
		car1.setModelo("modelo 1");
		car1.setPlaca("AFE345");
		car1.setAnio(2021);
		car1.setTipo("buseta");
		cliente.getVehiculos().add(car1);
		base.getClientes().add(cliente);
		
	}
	
	public static void ingresoDatos(BaseDatos base, Scanner sc) throws ExcepcionesVehiculos {
		System.out.println("Tipo de auto(buseta/trailer): ");
		String tipo = sc.nextLine();
		Vehiculo car = new Vehiculo();
		if(tipo == "buseta") {
			car = new Buseta();
		}else if(tipo == "trailer") {
			car = new Trailer();
		}
		//sc.nextLine();
		System.out.println("Ingrese el color: ");
		String color = sc.nextLine();
		car.setColor(color);
			
		System.out.println("Ingrese la marca: ");
		String marca = sc.nextLine();
		car.setMarca(marca);
			
		System.out.println("Ingrese el modelo: ");
		String modelo = sc.nextLine();
		car.setModelo(modelo);
		
		System.out.println("Ingrese la placa: ");
		String placa = sc.nextLine();
		car.setPlaca(placa);
		
		System.out.println("Ingrese el año: ");
		int anio = sc.nextInt();
		car.setAnio(anio);
			
		System.out.println("Ingrese cedula del cliente: ");
		long cedula = sc.nextLong();
		int existe = -1;
		
		if (color == null||marca==null||modelo==null||placa==null||anio==0||cedula==0) {
			throw new ExcepcionesVehiculos("No ingresar datos incorrectos");
		}
		
		for (int a = 0; a < base.getClientes().size(); a++) {
			if (cedula == base.getClientes().get(a).getCedula())
				existe = a;
		}
		if (existe>=0) {
			base.getClientes().get(existe).getVehiculos().add(car);
		}else {
			//sc.nextLine();
			System.out.println("Cliente no exite. Ingrese datos para crear cliente");
			Cliente cliente = new Cliente();
			cliente.setCedula(cedula);
			String nombre = sc.nextLine();
			cliente.setNombre(nombre);
			cliente.getVehiculos().add(car);
			base.getClientes().add(cliente);
		}
		
	}
	
	public static void buscarClienteAnio(BaseDatos base, Scanner sc) {
		int anio = sc.nextInt();
		for (int a = 0; a < base.getClientes().size(); a++) {
			for (int b = 0; b < base.getClientes().get(a).getVehiculos().size(); b++) {
				if(anio == base.getClientes().get(a).getVehiculos().get(b).getAnio()) {
					System.out.println("Datos del cliente");
					
				}
			}
		}
		
	}

	public static void main(String[] args) {
		BaseDatos base = new BaseDatos();
		datosIniciales(base);
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		while(opcion !=4) {
			System.out.println("**** VENTA DE VEHICULOS ****" + "\n" +
					   "1. Registrar venta\n" +
					   "2. Buscar vehiculos de clientes por año\n"+
					   "3. Buscar vehiculos de clientes por marca\n"+
					   "4. Salir\n");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Dato inválido \n");
			}
			opcion = sc.nextInt();
			
			
			switch(opcion) {
			case 1:
				try {
					ingresoDatos(base, sc);
				}catch(ExcepcionesVehiculos e) {
					e.mensaje();
				}
				
				break;
			case 2:
				
				break;
			case 3:
				break;
			}
			
		}
		
		sc.close();

	}

}

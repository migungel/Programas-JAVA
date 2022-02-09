import java.io.IOException;

public class Tests {

	
	/*public Tests(Object obj) throws IOException {
		if (obj==null)
			throw new IOException("Provide an object!");
		System.out.println(obj + " created!");
	}
	public static void createObject() throws IOException {
		try {
			Tests obj = new Tests(null);
		}finally {
			System.out.println("Was the object created?");
		}
	}*/
	
	
	static int modify(Integer i) {
		i+=10;
		return i+10;
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//for(int x = 0; x<10; x--) {
		//	do {
		//		System.out.println("Loop");
		//		System.out.println("x: " + x);
		//	}while(x++ < 10);
		//}
		
		
		//createObject();
		
		
		Integer i=10;
		System.out.println(modify(i));
		

	}

}

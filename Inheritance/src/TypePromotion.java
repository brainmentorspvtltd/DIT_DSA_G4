import java.util.ArrayList;

public class TypePromotion {
	
	void show(byte x) {
		System.out.println("Byte X...");
	}
	
	void show(short x) {
		System.out.println("Short X...");
	}
	
//	void show(int x) {
//		System.out.println("Int X...");
//	}
	
//	void show(long x) {
//		System.out.println("Long X...");
//	}
	
//	void show(float x) {
//		System.out.println("Float X...");
//	}
	
//	void show(double x) {
//		System.out.println("Double X");
//	}
	
//	void show(Integer x) {
//		System.out.println("Integer Wrapper Class X...");
//	}
//	
//	void show(Float x) {
//		System.out.println("Float Wrapper Class X...");
//	}
	
//	void show(int ...x) {
//		System.out.println("Int Variable Length Argument...");
//	}
	

	public static void main(String[] args) {
		
		TypePromotion obj = new TypePromotion();
		// obj.show(10);
		// by default java executes int
		// if int is not available then, long will be executed
		// Widening
		// if long is not available then, float will be executed
		// if float is not available then, double will be executed
		// Wrapper Class
		// if double is not available then, Integer will be executed
		// variable length argument
		// obj.show(5,4,54,8);
		
		// byte method will be called
		// obj.show((byte)10);
		
		// short method will be called
		obj.show((short)10);
		
		//In Earlier version of Java
		// Boxing
		//Integer i = new Integer(12);
		// Unboxing
		//int i1 = i.intValue();
		
		//In current/newer version of Java
		// Autoboxing
		Integer i = 12;
		int i1 = i;
		
//		ArrayList<Task> arr = new ArrayList<>();
//		arr.add(task);
		
		
	}

}

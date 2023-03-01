class A {
	int x;
	A() {
		x = 10;
		System.out.println("A class Default Const. Called...");
	}
	A(int x) {
		this();
		x = 22;
		System.out.println("A class Param Const. Called...");
	}
}

class B extends A{
	int x;
	B() {
		super(10);	// will call param const of parent class
		//super();
		this.x = 20;
		//super();	// implicit java uses super in first line of constructor
		System.out.println("B class Default Const. Called...");
	}
	B(int x) {
		//super();	// internally super is called
		// local variable
		//int n = x + x;
		this();	// will call current class default constructor
		int n = x + this.x + super.x;
		System.out.println("Sum is : " + n);
	}
}

public class SuperVsThis {

	public static void main(String[] args) {
		
		//B obj = new B();
		B obj = new B(11);

	}

}

class GrandFather {
	int age = 80;
}

class Father extends GrandFather {
	int age = 55;
}

class Son extends Father {
	int age = 20;
	public Son(int age) {
		System.out.println("GrandFather Age : " + ((GrandFather)this).age);
		System.out.println("Father Age : " + super.age);
		System.out.println("Son Age : " + this.age);
		System.out.println("Son Local Age : " + age);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Son obj = new Son(10);

	}

}

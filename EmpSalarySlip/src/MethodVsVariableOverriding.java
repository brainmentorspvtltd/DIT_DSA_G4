class P1 {
	int x;
	int y;
}

class C1 extends P1 {
	void show() {
		System.out.println(x);
	}
}

public class MethodVsVariableOverriding {

	public static void main(String[] args) {
		C1 obj = new C1();
		obj.show();
	}

}

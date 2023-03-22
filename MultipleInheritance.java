interface H1 {
    int x = 100;
    void show();
}

interface H2 {
    int x = 200;
    void show();
}

interface H3 extends H1, H2 {
    void show();
}

class MyClass implements H3 {

    @Override
    public void show() {
        System.out.println(H1.x + H2.x);
    }

}

// class MyClass implements H1, H2, H3 {
    
// }

public class MultipleInheritance {
    public static void main(String[] args) {
        
    }
}

interface K1 {
    void print();
    default void show() {
        System.out.println("Show method inside K1...");
    }
}

interface K2 {
    void print();
    default void show() {
        System.out.println("Show method inside K2...");
    }
}

interface K3 extends K1, K2 {
    @Override
    default void show() {
        K1.super.show();
        K2.super.show();
        System.out.println("Show method inside K3...");
    }
}

class K implements K3 {
    @Override
    public void print() {

    }
}

public class DefaultKeyword {
    public static void main(String[] args) {
        K obj = new K();
        obj.show();
    }
}

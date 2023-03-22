import static java.lang.Math.PI;
import static java.lang.System.out;

final class MathOperations {
    private MathOperations() {

    }
    static void fact(int n) {
        System.out.println("Factorial method...");
    }
}

public class StaticExample {
    public static void main(String[] args) {
        // MathOperations obj = new MathOperations();
        MathOperations.fact(5);
        System.out.println(PI);
        out.println("...");
    }
}

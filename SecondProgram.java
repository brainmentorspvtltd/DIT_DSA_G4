public class SecondProgram {
    int x;
    int y;

    void show() {
        int z = x + y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        // Local variables must be initialized before use
        int x = 21;
        int y = 10;
        int z = x + y;
        System.out.println("Sum is : " + z);
    }
}

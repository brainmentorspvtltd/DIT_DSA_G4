public class Operators {
    public static void main(String[] args) {
        int x = 12, y = 20;

        // Arithmetic Operartors
        // Addition
        int z1 = x + y;
        // Subtraction
        int z2 = x - y;
        // Division
        int z3 = x / y;
        // Multiplication
        int z4 = x * y;
        // Modulo
        int z5 = x % y;

        System.out.println(z1 + "," + z2 + "," + z3 + "," + z4 + "," + z5);

        // Assignment Operators
        // x = x + 6;
        x += 6;

        // x = x - 6;
        x -= 6;

        // x = x / 6;
        x /= 6;

        // x = x * y;
        x *= y;

        // x = x % 3;
        x %= 3;

        // if(x == y) {

        // }
        
        // System.out.println(x == y);
        boolean result = x == y;
        System.out.println(result);

        System.out.println(x > y);
        System.out.println(x < y);

        // x is either greater or equal to y
        System.out.println(x >= y);
        // x is either smaller or equal to y
        System.out.println(x <= y);
        
        System.out.println(x != y);

    }
}

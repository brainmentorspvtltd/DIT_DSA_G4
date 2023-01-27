public class IfElseDemo {
    public static void main(String[] args) {
        int x = 20, y = 30;
        // Find greatest of two
        // if(x > y) {
        //     System.out.println("X is greater...");
        // }
        // else {
        //     System.out.println("Y is greater...");
        // }

        String output = x > y ? "X" : "Y";
        System.out.println(output + " is greater...");

    }
}

public class MaxOfThree {
    public static void main(String[] args) {
        int x = 20, y = 10, z = 30;
        if(x > y && x > z) {
            System.out.println("X is greatest...");
        }
        else if(y > x && y > z) {
            System.out.println("Y is greatest...");
        }
        else {
            System.out.println("Z is greatest...");
        }


    }
}

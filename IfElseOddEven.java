import java.util.Scanner;

public class IfElseOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scanner.nextInt();

        if(num % 2 == 0) {
            System.out.println("Number is even...");
        }
        else {
            System.out.println("Number is odd...");
        }

        scanner.close();
    }
}

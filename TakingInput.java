import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        
        // read() - it returns an int
        // read() - reads 1 byte at a time and return ASCII
        // int name = System.in.read();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your ID : ");
        int id = scanner.nextInt();

        // this will eat the remaining \n from buffer
        scanner.nextLine();

        System.out.println("Enter your name : ");
        // nextLine() or next() are used to take input in String data type
        
        // nextLine() takes input till \n
        String name = scanner.nextLine();
        
        // next() takes input till space only
        // String name = scanner.next();

        System.out.println("Enter your age : ");
        byte age = scanner.nextByte();
        
        System.out.println("Welcome : " + name);
        System.out.println("ID : " + id);
        System.out.println("Age : " + age);
        
        scanner.close();
    }
}

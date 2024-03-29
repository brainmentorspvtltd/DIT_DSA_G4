import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
//		ArrayList<ExceptionDemo> list = new ArrayList<>();
//		while(true) {
//			ExceptionDemo obj = new ExceptionDemo();
//			list.add(obj);
//		}
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter first num : ");
			int fnum = scanner.nextInt();
			System.out.print("Enter second num : ");
			int snum = scanner.nextInt();
			
			int sum = fnum + snum;
			System.out.println("Sum is : " + sum);
			
			int sub = fnum - snum;
			System.out.println("Sub is : " + sub);
			
			int div = fnum / snum;
			System.out.println("Div is : " + div);
			
			int mul = fnum * snum;
			System.out.println("Mul is : " + mul);
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero...");
		}
		catch (InputMismatchException e) {
			System.out.println("Invalid Input...");
		}
		catch (Exception e) {
			System.out.println("Something went wrong...");
		}
		
		finally {
			scanner.close();
		}

	}

}

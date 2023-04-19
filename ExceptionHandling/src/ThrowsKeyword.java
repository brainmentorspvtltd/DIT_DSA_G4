import java.io.IOException;
import java.util.Scanner;

public class ThrowsKeyword {
	
	void db() throws Exception {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter your email : ");
			String email = scanner.nextLine();
		}
		finally {
			scanner.close();
		}
	}
	
	void helper() throws Exception {
		db();
	}
	
	void view() {
		try {
			helper();
		} catch (Exception e) {
			System.out.println("Something went wrong...");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.view();

	}

}

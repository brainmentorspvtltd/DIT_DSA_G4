import java.util.Scanner;

public class EmployeeCaller {

	public static void main(String[] args) {
		
//		System.out.println("Employee Salary Slip...");
		
		MessageResourceBundle mr = new MessageResourceBundle();
		System.out.println(mr.getValue("welcome_msg"));
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(mr.getValue("input.id"));
		int empId = scanner.nextInt();	// 101\n
		
		scanner.nextLine();
		
		System.out.println(mr.getValue("input.name"));
		String name = scanner.nextLine();
		
		System.out.println(mr.getValue("input.salary"));
		double salary = scanner.nextDouble();
		
		scanner.nextLine();
		
		System.out.println(mr.getValue("input.email"));
		String email = scanner.nextLine();
		
		EmployeeDetails ram = new EmployeeDetails(empId, name, salary, email);
		
		// will show hashCode by default if we print object
//		System.out.println(ram.toString());
		
		// but if we override toString method then we can print anything we want
		System.out.println(ram);
		
//		System.out.println("Name is : " + ram.getName());
//		System.out.println("Name is : " + ram.showEmp());
		
//		System.out.println(ram.showEmp());
//		System.out.println("Email is : " + ram.getEmail());
//		System.out.println("Basic Salary is : " + ram.getSalary());
//		System.out.println("Payable Salary : " + ram.calcSalary());
		
		scanner.close();

	}

}

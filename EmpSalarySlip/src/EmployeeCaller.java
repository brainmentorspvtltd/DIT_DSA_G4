public class EmployeeCaller {

	public static void main(String[] args) {
		
		EmployeeDetails ram = new EmployeeDetails(101, "RAMesh SHarMA", 25000, "ram12@gmail.com");
		
		// will show hashCode by default if we print object
//		System.out.println(ram.toString());
		
		// but if we override toString method then we can print anything we want
		//System.out.println(ram);
		
//		System.out.println("Name is : " + ram.getName());
		System.out.println("Name is : " + ram.showEmp());
		System.out.println("Email is : " + ram.getEmail());
		System.out.println("Basic Salary is : " + ram.getSalary());
		System.out.println("Payable Salary : " + ram.calcSalary());

	}

}

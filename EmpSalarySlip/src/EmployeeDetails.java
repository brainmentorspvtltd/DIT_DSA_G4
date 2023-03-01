public class EmployeeDetails {
	private int id;
	private String name;
	private double salary;
	private String email;
	private final double hra;
	private final double ma;
	private final double ta;
	private final double da;
	private final double pf;
	private final double tds;
	private final String company;
	
	public EmployeeDetails() {
		this.company = "Brain Mentors";
		this.hra = 0.30;
		this.ma = 0.10;
		this.ta = 0.15;
		this.da = 0.40;
		this.pf = 0.05;
		this.tds = 0.10;
	}
	
	public EmployeeDetails(int id, String name, double salary, String email) {
		this();		// will call default constructor
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getHRA() {
		return this.salary * this.hra;
	}
	
	public double getTA() {
		return this.salary * this.ta;
	}
	
	public double getDA() {
		return this.salary * this.da;
	}
	
	public double getMA() {
		return this.salary * this.ma;
	}
	
	public double getTDS() {
		return this.salary * this.tds;
	}
	
	public double getPF() {
		return this.salary * this.pf;
	}
	
//	public String showEmp() {
//		CommonUtils utils = new CommonUtils("en", "IN");
//		this.name = utils.getProperName(name);
//		String date = utils.formatDate();
//		String formatSalary = utils.formatNumber(calcSalary());
//		return date + "\n" + this.name + "\n" + formatSalary;
//	}
	
	public double calcSalary() {
		double earnings = this.salary + getHRA() + getDA() + getMA() + getTA();
		double deductions = getPF() + getTDS();
		double payableSalary = earnings - deductions;
		return payableSalary;
	}
	
	@Override
	public String toString() {
		CommonUtils utils = new CommonUtils("en", "US"); // Has-A
		this.name = utils.getProperName(name);
		String date = utils.formatDate();
		String formatSalary = utils.formatNumber(calcSalary());
		return  "Date : " + date + "\n" + 
				"Name : " + this.name + "\n" + 
				"Salary : " + formatSalary;
	}
	
}

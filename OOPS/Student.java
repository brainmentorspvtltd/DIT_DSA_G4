// package OOPS;

// SRP
// Encapsulation - wrapping of methods and member variables 
// in a single unit known as class
// Data Hiding - make member variables private
// Good Encapsulation - Data Hiding + Encapsulation
// Private member variables and public methods

public class Student {
    // default scope
    // int id;
    // public
    // public String name;
    // protected
    // protected double marks;
    // private
    private int id;
    private String name;
    private double marks;
    private double fees;
    private String college;
    private String country;

    // Default Constructor...
    // Java already has a default constructor for each class
    // but when we create default constructor than java's default const. is destroyed
    // it will be called when we create object of the class...
    // used to initalize variables
    // public Student() {
    //     System.out.println("This is a default constructor...");
    //     this.id = 101;
    //     this.name = "John";
    //     this.marks = 76.54;
    //     this.fees = 56000.00;
    // }

    // Default Const...
    public Student() {
        System.out.println("Default Const. Called...");
        this.college = "DIT";
    }

    public Student(String country) {
        this();
        this.country = country;
    }

    // Parameterized const.
    public Student(int id, String name, double marks, double fees) {
        // constructor chaining
        // this();     // it will call default constructor
        this("India");
        System.out.println("This is a parameterized const...");
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.fees = fees;
        // this();
    }


    // Getter
    public String getName() {
        return this.name;
    }
    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // public void takeInput(int id, String name, double marks, double fees) {
    //     this.id = id;
    //     this.name = name;
    //     this.marks = marks;
    //     this.fees = fees;
    // }

    public void showDetails() {
        // this - refers to the current object
        // internally this is written before each variable
        System.out.println("College : " + this.college);
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Marks : " + marks);
        System.out.println("Fees : " + fees);
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return double return the marks
     */
    public double getMarks() {
        return marks;
    }

    /**
     * @param marks the marks to set
     */
    public void setMarks(double marks) {
        this.marks = marks;
    }

    /**
     * @return double return the fees
     */
    public double getFees() {
        return fees;
    }

    /**
     * @param fees the fees to set
     */
    public void setFees(double fees) {
        if(fees < 1 || fees > 5000) {
            throw new IllegalArgumentException();
        }
        this.fees = fees;
    }

}

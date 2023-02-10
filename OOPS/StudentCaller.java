// package OOPS;

public class StudentCaller {
    public static void main(String[] args) {
        // local variable
        // int x = 12;
        
        // Default Constructor
        // Student s1 = new Student();

        // Parameterized Constructor
        Student s1 = new Student(101, "John", 80, 4500.00);
        // s1.takeInput(101, "John", 80, 4500.00);
        s1.showDetails();

        // it will create object of default const...
        // Student s2 = new Student();
        // s2.takeInput(102, "Shawn", 90, 4500.00);
        // s2.showDetails();

        // System.out.println(s2.name);
        // System.out.println(s2.getName());
        // s2.setName("John");
        // s2.setFees(-10);
    }
}

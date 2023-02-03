package OOPS;

// S.O.L.I.D
// D - DRY - Donot Repeat Yourself
// S - SRP - Single Responsibility Principle

class Student {
    int id;
    String name;
    double marks;
    double fees;

    public void takeInput(int id, String name, double marks, double fees) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.fees = fees;
    }

    public void showDetails() {
        // this - refers to the current object
        // internally this is written before each variable
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Marks : " + marks);
        System.out.println("Fees : " + fees);
    }
}

public class ClassObjectDemo {
    
    public static void main(String[] args) {
        Student student_1 = new Student();

        // student_1.id = 101;
        // student_1.name = "Ram";
        // student_1.marks = 80.00;
        // student_1.fees = 4500.00;

        student_1.takeInput(101, "John", 80, 4500.00);
        student_1.showDetails();

        // System.out.println("ID : " + student_1.id);
        // System.out.println("Name : " + student_1.name);
        // System.out.println("Marks : " + student_1.marks);
        // System.out.println("Fees : " + student_1.fees);

        
        Student student_2 = new Student();

        // student_2.id = 102;
        // student_2.name = "Shyam";
        // student_2.marks = 88.00;
        // student_2.fees = 4500.00;

        student_2.takeInput(102, "Shawn", 60, 4500.00);
        student_2.showDetails();

        // System.out.println("ID : " + student_2.id);
        // System.out.println("Name : " + student_2.name);
        // System.out.println("Marks : " + student_2.marks);
        // System.out.println("Fees : " + student_2.fees);
    }
}

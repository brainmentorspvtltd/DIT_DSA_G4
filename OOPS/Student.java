package OOPS;

// SRP

public class Student {
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

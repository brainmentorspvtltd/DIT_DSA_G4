package OOPS;

public class StudentCaller {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.takeInput(101, "John", 80, 4500.00);
        s1.showDetails();

        Student s2 = new Student();
        s2.takeInput(102, "Shawn", 90, 4500.00);
        s2.showDetails();
    }
}

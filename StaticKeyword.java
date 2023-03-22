class Customer {
    static int counter;    // class variables - loads with class
    
    // instance variables
    int id;
    String name;
    double balance;

    // static block
    static {
        System.out.println("Static block init...");
        counter = 100;
    }

    // Init block
    {
        System.out.println("Init Block called...");
    }

    public Customer(String name, double balance) {
        System.out.println("Constructor called...");
        counter++;
        this.id = counter;
        // this.id = id;
        this.name = name;
        this.balance = balance;
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Customer ram = new Customer("Ram", 10000.00);
        System.out.println(ram.id + "," + ram.name + "," + ram.balance);

        Customer shyam = new Customer("Shyam", 10000.00);
        System.out.println(shyam.id + "," + shyam.name + "," + shyam.balance);

        System.out.println("Ram ID : " + ram.id);
    }
}

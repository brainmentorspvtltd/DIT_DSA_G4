import java.util.ArrayList;

// SAM - Single abstract method
// FunctionalInterface - which contain one method only

@FunctionalInterface
interface Calc {
    int compute(int x, int y);
}

// class MyCalc implements Calc {
//     @Override
//     public int compute(int x, int y) {
//         return x + y;
//     }
// }

public class InterfaceUseWays {
    public static void main(String[] args) {
        // MyCalc obj = new MyCalc();
        // obj.compute(35, 12);

        // Object Way
        // internally it creates anonymous class (class without name)
        // Calc obj = new Calc() {
        //     @Override
        //     public int compute(int x, int y) {
        //         return x + y;
        //     }
        // };
        // obj.compute(12, 20);

        // Lambda Expressions
        Calc obj = (a,b) -> a + b;
        System.out.println(obj.compute(12, 10));

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Shawn");
        names.add("Max");
        names.forEach((name) -> {System.out.println(name);});

        // for(String name : names) {
        //     System.out.println(name);
        // }

        Calc cc = (a,b) -> {
            int d = a + b;
            System.out.println("Addition is : " + d);
            return d;
        };
        System.out.println(cc.compute(12, 20));

    }
}

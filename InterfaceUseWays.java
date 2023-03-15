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
        Calc obj = new Calc() {
            @Override
            public int compute(int x, int y) {
                return x + y;
            }
        };
        obj.compute(12, 20);

    }
}

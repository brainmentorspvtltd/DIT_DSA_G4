import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;

public class WrapperDataTypes {
    public static void main(String[] args) {
        // Wrapper Classes
        int x = 12;
        Integer x1 = 45;

        byte b = 45;
        Byte b1 = 45;
        
        System.out.println(x + x1);

        Float f = 45.4f;
        Double d = 23.65;

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> ll = new LinkedList<>();

        BigInteger big_1 = new BigInteger("3453453456");
        BigInteger big_2 = new BigInteger("45343");
        BigInteger big_3 = big_1.add(big_2);
        System.out.println(big_3);

    }
}

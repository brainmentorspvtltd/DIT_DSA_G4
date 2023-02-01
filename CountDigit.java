public class CountDigit {
    public static void main(String[] args) {
        // int num = 321434;
        int num = 102304004;
        int digitCount = 0;
        int zeroCount = 0;
        while(num != 0) {
            if(num % 10 == 0) {
                zeroCount++;
            }
            num = num / 10;
            digitCount++;
        }
        System.out.println("Number of digits : " + digitCount);
        System.out.println("Number of Zero : " + zeroCount);
    }
}

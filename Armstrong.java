public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int result = 0;
        int temp = num;
        // Math.pow(2, 4);
        while(num != 0) {
            int rem = num % 10;     // 3, 5, 1
            result += rem * rem * rem;  // 3^3 = 27 + 5^3 = 27 + 125 = 152 + 1 ^ 3 = 152 + 1 = 153
            num = num / 10;     // 15, 1, 0
        }
        if(temp == result) {
            System.out.println("Armstrong number...");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }   
}

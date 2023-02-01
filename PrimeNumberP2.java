public class PrimeNumberP2 {
    public static void main(String[] args) {
        // int num = 100000007;
        int num = 997;
        boolean isPrime = true;
        int iter = 0;
        for(int i = 2; i * i <= num; i++) {
            iter++;
            if(num % i == 0) {
                // System.out.println("Not Prime");
                isPrime = false;
                break;
            }
        }
        System.out.println("Iterations took : " + iter);
        if(isPrime) {
            System.out.println("Number is prime...");
        }
        else { 
            System.out.println("Number is not prime...");
        }
    }
}

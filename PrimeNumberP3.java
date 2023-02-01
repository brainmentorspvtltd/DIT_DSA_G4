public class PrimeNumberP3 {
    public static void main(String[] args) {
        int num = 100000007;
        // int num = 997;
        boolean isPrime = true;

        if(num % 2 == 0 || num % 3 == 0) {
            isPrime = false;
        }

        int iter = 0;
        for(int i = 5; i * i <= num; i += 6) {
            iter++;
            if(num % i == 0 || num % (i + 2) == 0) {
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

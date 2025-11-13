public class PrimeOrNot {
    public static void main(String args[]) {
        int n = 6;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}

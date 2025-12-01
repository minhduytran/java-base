public class bai_5 {
    static int primeCount = 0;

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Có ước số khác 1 và chính nó → không nguyên tố
            }
        }
        return true; // Là số nguyên tố
    }

}

    public static void findPrimes(int n) {
        // TODO: Find all primes from 1 to n
        // TODO: Store in array and print
    }

    public static void main(String[] args) {
        findPrimes(50);
        System.out.println("Total primes found: " + primeCount);
    }
}


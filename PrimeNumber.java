public class PrimeNumber {
    public static void main(String[] args) {
        int num = 29;
        
        boolean isPrime = checkPrime(num);
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    
    public static boolean checkPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }
        
        // Check for divisibility from 2 up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a factor, so it's not prime
            }
        }
        return true; 
    }
}

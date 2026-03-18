public class GCD {
    public static void main(String[] args) {
        int a = 98, b = 56;
        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }
    
    // Using Euclidean Algorithm
    public static int findGCD(int a, int b) {
        // If b becomes 0, then a is the GCD
        if (b == 0) {
            return a;
        }
        // Recursively call finding GCD of b and remainder of a divided by b
        return findGCD(b, a % b);
    }
}

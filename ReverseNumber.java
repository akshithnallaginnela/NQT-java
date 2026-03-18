public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Input: " + n + " -> Output: " + reverse(n));
        
        int n2 = 1200;
        System.out.println("Input: " + n2 + " -> Output: " + reverse(n2));
    }
    
    public static int reverse(int n) {
        long reversed = 0; // Use long to handle overflow during calculation
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        
        // Check for 32-bit signed integer overflow
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return -1;
        }
        
        return (int) reversed;
    }
}

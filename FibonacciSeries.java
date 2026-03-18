public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 20; // Print Fibonacci numbers less than or equal to N
        
        int firstTerm = 0, secondTerm = 1;
        System.out.print("Output: ");
        
        // While the current term is less than or equal to N
        while (firstTerm <= n) {
            System.out.print(firstTerm + " ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }
}

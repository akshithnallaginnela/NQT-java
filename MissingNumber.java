public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        
        // Sum of first N integers: N * (N + 1) / 2
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : arr) {
            actualSum += num;
        }
        
        int missingNumber = expectedSum - actualSum;
        System.out.println("Input array length N = " + n + ", Output: " + missingNumber);
    }
}

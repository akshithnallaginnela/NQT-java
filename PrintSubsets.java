public class PrintSubsets {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        
        System.out.println("All non-continuous Subsets (Combinations):");
        
        // 3 elements mean there are 2^3 = 8 possible subsets total
        int totalSubsets = (int) Math.pow(2, n); 
        
        // Loop through exactly 8 times (0 to 7)
        for (int i = 0; i < totalSubsets; i++) {
            System.out.print("{ ");
            
            int activeSubset = i;
            
            // Loop through each piece of the array
            for (int j = 0; j < n; j++) {
                // Determine if we should include current array element using remainders (0 or 1)
                // This mimics "on" or "off" behavior for creating subsets
                if (activeSubset % 2 == 1) {
                    System.out.print(arr[j] + " ");
                }
                // Break down to the next number
                activeSubset = activeSubset / 2;
            }
            System.out.println("}");
        }
    }
}

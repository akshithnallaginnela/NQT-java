public class PrintSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        
        System.out.println("Continuous Subarrays:");
        
        // Starting point of our subarray
        for (int i = 0; i < arr.length; i++) {
            
            // Ending point of our subarray
            for (int j = i; j < arr.length; j++) {
                
                System.out.print("[");
                // Print everything between the start point (i) and end point (j)
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + (k == j ? "" : ", "));
                }
                System.out.println("]");
                
            }
        }
    }
}

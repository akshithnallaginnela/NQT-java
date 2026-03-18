public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        
        System.out.println("Looking for duplicate in basic array...");
        // Very simple nested loop to compare each element with every other element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // If two elements are the same, we found the duplicate!
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found: " + arr[i]);
                    return; // Exit as soon as we find it
                }
            }
        }
    }
}

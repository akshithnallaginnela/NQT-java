public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        
        System.out.println("Finding the next greater elements...");
        
        // Loop through every single element
        for (int i = 0; i < arr.length; i++) {
            int nextGreater = -1;
            
            // Simply look at everything to the right of the current element
            for (int j = i + 1; j < arr.length; j++) {
                // If we find something larger, mark it and stop looking!
                if (arr[j] > arr[i]) {
                    nextGreater = arr[j];
                    break;
                }
            }
            
            System.out.println(arr[i] + " -> " + nextGreater);
        }
    }
}

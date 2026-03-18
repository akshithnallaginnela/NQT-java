import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // Number of times to rotate
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        // Rotate the array physically 1 step at a time, 'K' times
        for (int i = 0; i < k; i++) {
            
            // Save the very last element before we overwrite it
            int lastElement = arr[arr.length - 1];
            
            // Shift every element ONE step to the right
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            
            // Put the saved last element into the very first spot
            arr[0] = lastElement;
        }
        
        System.out.println("Array after " + k + " rotations: " + Arrays.toString(arr));
    }
}

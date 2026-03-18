import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        
        // Sorting the array is necessary if elements are not in sorted order
        Arrays.sort(arr);
        
        int n = arr.length;
        if (n == 0 || n == 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        
        // j is used to track the index of the next unique element
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            // If the current element is not equal to the next, it's unique
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        // Add the last element
        arr[j++] = arr[n - 1];
        
        // Print unique elements
        System.out.print("Array with unique elements: ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

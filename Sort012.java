import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 0};
        
        int low = 0, mid = 0, high = arr.length - 1;
        
        // Dutch National Flag Algorithm
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid], increment both
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    // Just move mid pointer
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high], decrement high
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
        
        System.out.println("Sorted Array (0s, 1s, and 2s): " + Arrays.toString(arr));
    }
    
    // Helper method to swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

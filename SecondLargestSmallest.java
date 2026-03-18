public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        
        if (arr.length < 2) {
            System.out.println("Invalid input");
            return;
        }
        
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        
        for (int num : arr) {
            // Logic for finding largest and second largest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
            
            // Logic for finding smallest and second smallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Second Smallest: " + secondSmallest);
    }
}

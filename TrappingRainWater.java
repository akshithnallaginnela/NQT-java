public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trappedWater = 0;
        
        // Go through each bar one by one (skipping the very first and very last)
        for (int i = 1; i < arr.length - 1; i++) {
            
            // 1. Find the highest bar on its left
            int leftMax = arr[i];
            for (int j = 0; j < i; j++) {
                if (arr[j] > leftMax) {
                    leftMax = arr[j];
                }
            }
            
            // 2. Find the highest bar on its right
            int rightMax = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > rightMax) {
                    rightMax = arr[j];
                }
            }
            
            // The water it can hold is the lowest of the two maximum boundaries, minus its own height!
            int waterForThisBar = Math.min(leftMax, rightMax) - arr[i];
            trappedWater += waterForThisBar;
        }
        
        System.out.println("Total Trapped Water: " + trappedWater);
    }
}

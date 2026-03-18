public class ArmstrongNumber {
    public static void main(String[] args) {
        int[] testCases = {153, 123};
        
        for (int num : testCases) {
            System.out.println("Input: N = " + num + " -> Output: " + (isArmstrong(num) ? "True" : "False"));
        }
    }
    
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // Number of digits
        
        while (num > 0) {
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, digits); // Raise digit to power of digits
            num /= 10;
        }
        
        return sum == originalNum;
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int originalNum = num;
        int reversedNum = 0;
        
        // Reverse the number
        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num /= 10;
        }
        
        // If original number equals reversed number, it's a palindrome
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome number.");
        } else {
            System.out.println(originalNum + " is not a Palindrome number.");
        }
    }
}

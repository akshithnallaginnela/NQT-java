public class NumberSystemConversion {
    public static void main(String[] args) {
        int decimalNumber = 42;
        
        // 1. Decimal to Binary
        String binaryStr = Integer.toBinaryString(decimalNumber);
        System.out.println("Decimal " + decimalNumber + " to Binary: " + binaryStr);
        
        // 2. Decimal to Hexadecimal
        String hexStr = Integer.toHexString(decimalNumber);
        System.out.println("Decimal " + decimalNumber + " to Hexadecimal: " + hexStr.toUpperCase());
        
        // 3. Binary to Decimal
        String binaryInput = "101010";
        int parsedDecimal = Integer.parseInt(binaryInput, 2);
        System.out.println("Binary " + binaryInput + " to Decimal: " + parsedDecimal);
        
        // 4. Manual conversion: Decimal to Binary
        System.out.print("Manual conversion of " + decimalNumber + " to Binary: ");
        decimalToBinaryManual(decimalNumber);
    }
    
    // Method to convert Decimal to Binary manually without built-in functions
    public static void decimalToBinaryManual(int num) {
        int[] binaryNum = new int[32];
        int i = 0;
        while (num > 0) {
            binaryNum[i] = num % 2; // Store remainder
            num = num / 2;          // Divide by 2
            i++;
        }
        // Print in reverse order
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j]);
        }
        System.out.println();
    }
}

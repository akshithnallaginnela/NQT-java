public class LongestCommonSubstring {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "zcdemf";
        int maxLength = 0;
        String longestSub = "";
        
        // Basic loops: compare each character of s1 starting here
        for (int i = 0; i < s1.length(); i++) {
            // With each character of s2 starting here
            for (int j = 0; j < s2.length(); j++) {
                
                int currentLength = 0;
                
                // Keep checking matching characters one by one
                while (i + currentLength < s1.length() && 
                       j + currentLength < s2.length() && 
                       s1.charAt(i + currentLength) == s2.charAt(j + currentLength)) {
                    currentLength++;
                }
                
                // If we found a longer match, record it
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    longestSub = s1.substring(i, i + currentLength);
                }
            }
        }
        System.out.println("Longest Length: " + maxLength + " (Substring: " + longestSub + ")");
    }
}

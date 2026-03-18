import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println("Input: s1 = \"listen\", s2 = \"silent\" -> Output: " + (areAnagrams("listen", "silent") ? "True" : "False"));
        System.out.println("Input: s1 = \"hello\", s2 = \"world\" -> Output: " + (areAnagrams("hello", "world") ? "True" : "False"));
    }
    
    public static boolean areAnagrams(String s1, String s2) {
        // Remove spaces and convert to lower case
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        
        // If lengths differ, they can't be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Convert to char arrays and sort them
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

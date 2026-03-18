public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello World";
        count(str);
    }
    
    public static void count(String str) {
        int vowels = 0, consonants = 0;
        // Convert string to lower case to make checking easier
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if character is a letter
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Output: Vowels: " + vowels + ", Consonants: " + consonants);
    }
}

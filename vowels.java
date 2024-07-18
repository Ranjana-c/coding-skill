
import java.util.*;
class RemoveVowels {
        public static void main(String[] args) {
            String str = "Hello, World!";
            String result = removeVowels(str);
            System.out.println("Original string: " + str);
            System.out.println("String without vowels: " + result);
    }

    public static String removeVowels(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!isVowel(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c); 
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

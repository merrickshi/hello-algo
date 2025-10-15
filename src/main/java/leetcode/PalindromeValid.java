package leetcode;

/**
 *
 *
 * @author merrick
 * @date 2025/10/15 16:42:42
 */
public class PalindromeValid {

    public static Boolean PalindromeValid(String str) {
        String simplified = Simplified(str);
        return (new StringBuilder(simplified)).reverse().toString().equals(simplified);
    }

    public static String Simplified(String str) {
        return str.toLowerCase().replaceAll("[^a-z0-9]", "");
    }
}
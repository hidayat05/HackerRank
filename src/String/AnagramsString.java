package String;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @owner hidayat
 * @since 12/20/16.
 */
public class AnagramsString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        System.out.println(isAnagram(first, second));
    }

    static boolean isAnagram(String first, String second) {
        char[] word1 = first.toUpperCase().replaceAll("[\\s]", "").toCharArray();
        char[] word2 = second.toUpperCase().replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}

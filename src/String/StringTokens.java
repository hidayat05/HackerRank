package String;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @owner hidayat
 * @since 12/20/16.
 */
public class StringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tokensInput = scanner.nextLine();
        scanner.close();

        StringTokenizer tokenizer = new StringTokenizer(tokensInput, " @_'.,?!");
        System.out.println(tokenizer.countTokens());
        while (tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextElement());
        }
    }
}

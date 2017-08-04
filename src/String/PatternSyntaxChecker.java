package String;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @owner hidayat
 * @since 12/20/16.
 */
public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        for (int i = 0; i < testCases; i++) {
            try {
                String pattern = in.nextLine();
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
                //Write your code
            }
        }
    }
}

package String;

import java.util.Scanner;

/**
 * @owner hidayat
 * @since 12/20/16.
 */
public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(A.substring(start, end));
    }
}

package String;

import java.util.Scanner;

/**
 * @owner hidayat
 * @since 12/20/16.
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String temp = new StringBuilder(input).reverse().toString();

        if (temp.equals(input)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

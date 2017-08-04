import java.util.Scanner;

/**
 * @owner hidayat
 * @since 11/29/16.
 */
public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 1;
        while (scanner.hasNext()) {
            System.out.println(x++ + " " + scanner.nextLine());
        }
    }
}

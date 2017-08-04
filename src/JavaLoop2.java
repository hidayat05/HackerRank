import java.util.Scanner;

/**
 * @owner hidayat
 * @since 11/29/16.
 */
public class JavaLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int result = a;

            for (int j = 0; j < n; j++) {
                result += b << j;
                System.out.printf("%d ", result);
            }
            System.out.println();
        }
        scanner.close();
    }
}

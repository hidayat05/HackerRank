import java.util.Scanner;

/**
 * @owner hidayat
 * @since 11/29/16.
 */
public class PrimalityTest {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);)
        {
            System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        }
    }
}

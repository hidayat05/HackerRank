package BigNumber;

import java.util.Scanner;

/**
 * @owner hidayat
 * @since 2/10/17.
 */
public class BigInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();

        java.math.BigInteger bigA, bigB;
        bigA = new java.math.BigInteger(a);
        bigB = new java.math.BigInteger(b);
        System.out.println(bigA.add(bigB));
        System.out.println(bigA.multiply(bigB));

    }
}

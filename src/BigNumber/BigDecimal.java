package BigNumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by hidayat
 * on 2/10/17.
 */
public class BigDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.next();
        }
        scanner.close();
        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 == null || o2 == null) {
                    return 0;
                }
                java.math.BigDecimal o1Bd = new java.math.BigDecimal(o1);
                java.math.BigDecimal o2Bd = new java.math.BigDecimal(o2);
                return o1Bd.compareTo(o2Bd);
            }
        }));

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}

package datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @owner nurhidayat
 * @since 27/02/18.
 * https://www.hackerrank.com/challenges/phone-book/problem
 */
public class JavaMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countRequest = scanner.nextInt();
        scanner.nextLine();

        Map<String, Long> map = new HashMap<>();
        for (int i = 0; i < countRequest; i++) {
            String name = scanner.nextLine();
            long number = scanner.nextLong();
            map.put(name, number);
            scanner.nextLine();
        }

        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}

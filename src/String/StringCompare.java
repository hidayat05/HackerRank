package String;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @owner hidayat
 * @since 12/20/16.
 */
public class StringCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int k = scanner.nextInt();

        Object[] parts = IntStream.range(0, input.length() + 1 - k)
                .mapToObj(i -> input.substring(i, i+k)).sorted().toArray();
        System.out.println(parts[0]+"\n"+parts[parts.length-1]);
    }
}

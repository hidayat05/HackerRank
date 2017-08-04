package datastructures;

import java.util.Scanner;

/**
 * Created by nurhidayat
 * on 4/17/17.
 * https://www.hackerrank.com/challenges/java-1d-array-introduction
 */
public class Java1dArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            a[i] = val;
        }
        scanner.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

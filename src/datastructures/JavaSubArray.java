package datastructures;

import java.util.Scanner;

/**
 * Created by nurhidayat
 * on 4/17/17.
 * https://www.hackerrank.com/challenges/java-negative-subarray
 */
public class JavaSubArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countArray = scanner.nextInt();

        int[] arrays = new int[countArray];
        for (int i = 0; i < countArray; i++) {
            int val = scanner.nextInt();
            arrays[i] = val;
        }
        int count = 0;
        for (int i = 0; i < countArray; i++) {
            int sum = 0;
            for (int j = i; j < countArray; j++) {
                sum = arrays[j] + sum;
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}

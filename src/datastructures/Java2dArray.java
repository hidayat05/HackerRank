package datastructures;

import java.util.Scanner;

/**
 * Created by nurhidayat
 * on 4/17/17.
 * https://www.hackerrank.com/challenges/java-2d-array?h_r=next-challenge&h_v=zen
 */

public class Java2dArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i    ][j  ] + arr[i    ][j + 1] + arr[i    ][j + 2]
                                          + arr[i + 1][j + 1]
                        + arr[i + 2][j  ] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }
}

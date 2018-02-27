package algoritm;

/**
 * @owner nurhidayat
 * @since 27/02/18.
 */
public class FizzBuzz {

    public static void main(String[] args) {

        int[] arrayData = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (int item : arrayData) {
            if (item % 15 == 0) {
                System.out.println(item + "fizz buzz");
            } else if (item % 3 == 0) {
                System.out.println(item + "fizz");
            } else if (item % 5 == 0) {
                System.out.println(item + "buzz");
            } else {
                System.out.println(item);
            }
        }
    }
}

package algoritm;

/**
 * @owner nurhidayat
 * @since 27/02/18.
 */
public class LongestCommonSubSequence {

    public static void main(String[] args) {

        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";
        System.out.println(lcs(str1, str2, str1.length(), str2.length()));
        System.out.println(lcs2(str1, str2));
    }

    private static int lcs(String string1, String string2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (string1.charAt(m - 1) == string2.charAt(n - 1)) {
            return 1 + lcs(string1, string2, m - 1, n - 1);
        } else {
            return Math.max(lcs(string1, string2, m - 1, n), lcs(string1, string2, m, n - 1));
        }
    }

    private static int lcs2(String str1, String str2) {
        int lcs[][] = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i <= str1.length(); i++) {
            for (int j = 0; j <= str2.length(); j++) {
                if (i == 0 || j == 0) {
                    lcs[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    lcs[i][j] = 1 + lcs[i - 1][j - 1];
                } else {
                    lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
                }
            }
        }
        return lcs[str1.length()][str2.length()];
    }

}

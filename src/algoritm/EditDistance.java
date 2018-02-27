package algoritm;

/**
 * @owner nurhidayat
 * @since 27/02/18.
 */
public class EditDistance {

    public static void main(String[] args) {
        String string1 = "march";
        String string2 = "cart";

        EditDistance editDistance = new EditDistance();
        System.out.println(editDistance.getMinConversions(string1, string2));

    }

    private int getMinConversions(String string1, String string2) {
        int dp[][] = new int[string1.length() + 1][string2.length() + 1];
        for (int i = 0; i <= string1.length(); i++) {
            for (int j = 0; j <= string2.length(); j++) {
                if(i==0)
                    dp[i][j] = j; else if(j==0)
                    dp[i][j] = i;
                else if(string1.charAt(i-1) == string2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1]; else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
            }
        }
        return dp[string1.length()][string2.length()];
    }
}

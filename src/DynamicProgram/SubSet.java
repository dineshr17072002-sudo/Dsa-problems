package DynamicProgram;

public class SubSet {
    public static void main(String[] args){
        int[] set = {3, 34, 4, 12, 5, 2};
        int sum = 9;

        System.out.println(subsetSum(set, sum));
    }
 static boolean subsetSum(int[]set, int sum) {
     int n = set.length;
     boolean[][] dp = new boolean[n][sum + 1];
     for (int i = 0; i < n; i++) {
         dp[0][i] = true;
     }
     for (int j = 1; j <= sum; j++) {
         if (j == set[0]) {
             dp[0][j] = true;
         } else {
             dp[0][j] = false;
         }

     }
     for (int i = 1; i < n; i++) {
         for (int j = 1; j <= sum; j++) {
             if (j < set[i]) {
                 dp[i][j] = dp[i - 1][j];
             } else if (dp[i - 1][j]) {
                 dp[i][j] = true;
             } else {
                 dp[i][j] = dp[i - 1][j - set[i]];
             }
         }
     }
return dp[n-1][sum];

 }}

package PartitionDP;
import java.util.Arrays;
public class cutStick {


        public static void main(String[] args) {

            int n = 7;
            int[] cuts = {1, 3, 4, 5};

            int m = cuts.length;

            int[] arr = new int[m + 2];
            arr[0] = 0;
            arr[m + 1] = n;

            for (int i = 0; i < m; i++) {
                arr[i + 1] = cuts[i];
            }

            Arrays.sort(arr);

            int[][] dp = new int[m + 2][m + 2];

            for (int len = 2; len < m + 2; len++) {

                for (int i = 0; i + len < m + 2; i++) {

                    int j = i + len;

                    dp[i][j] = Integer.MAX_VALUE;

                    for (int k = i + 1; k < j; k++) {

                        int cost = (arr[j] - arr[i])
                                + dp[i][k]
                                + dp[k][j];

                        dp[i][j] = Math.min(dp[i][j], cost);
                    }

                    if (dp[i][j] == Integer.MAX_VALUE) {
                        dp[i][j] = 0;
                    }
                }
            }

            System.out.println(dp[0][m + 1]);
        }

}

//Let's dry run the Tabulation DP Table for:
//
//n = 7
//cuts = [1,3,4,5]
//
//After adding boundaries:
//
//arr = [0,1,3,4,5,7]
//index  0 1 2 3 4 5
//Meaning of dp[i][j]
//dp[i][j]
//= Minimum cost to cut the stick between arr[i] and arr[j]
//
//Example:
//
//dp[0][5]
//= Minimum cost to cut stick from 0 to 7
//Initial DP Table
//
//All values are 0.
//
//i\j	0	1	2	3	4	5
//0	0	0	0	0	0	0
//1	0	0	0	0	0	0
//2	0	0	0	0	0	0
//3	0	0	0	0	0	0
//4	0	0	0	0	0	0
//5	0	0	0	0	0	0
//len = 2
//dp[0][2]
//stick = [0,3]
//possible cut = 1
//
//k = 1
//
//cost = (3-0)
//     + dp[0][1]
//     + dp[1][2]
//
//     = 3 + 0 + 0
//     = 3
//dp[0][2] = 3
//dp[1][3]
//stick = [1,4]
//cut = 3
//cost = 4-1 = 3
//dp[1][3] = 3
//dp[2][4]
//stick = [3,5]
//cut = 4
//
//cost = 5-3 = 2
//dp[2][4] = 2
//dp[3][5]
//stick = [4,7]
//cut = 5
//
//cost = 7-4 = 3
//dp[3][5] = 3
//
//Table now:
//
//i\j	0	1	2	3	4	5
//0	0	0	3	0	0	0
//1	0	0	0	3	0	0
//2	0	0	0	0	2	0
//3	0	0	0	0	0	3
//4	0	0	0	0	0	0
//5	0	0	0	0	0	0
//len = 3
//dp[0][3]
//stick = [0,4]
//cuts = {1,3}
//k = 1
//cost = 4
//     + dp[0][1]
//     + dp[1][3]
//
//     = 4+0+3
//     = 7
//k = 2
//cost = 4
//     + dp[0][2]
//     + dp[2][3]
//
//     = 4+3+0
//     = 7
//
//Minimum:
//
//dp[0][3] = 7
//dp[1][4]
//stick = [1,5]
//cuts = {3,4}
//
//k = 2
//
//4 + 0 + 2 = 6
//
//k = 3
//
//4 + 3 + 0 = 7
//
//Minimum:
//
//dp[1][4] = 6
//dp[2][5]
//stick = [3,7]
//cuts={4,5}
//
//k = 3
//
//4+0+3 = 7
//
//k = 4
//
//4+2+0 = 6
//
//Minimum:
//
//dp[2][5] = 6
//
//Table:
//
//i\j	0	1	2	3	4	5
//0	0	0	3	7	0	0
//1	0	0	0	3	6	0
//2	0	0	0	0	2	6
//3	0	0	0	0	0	3
//4	0	0	0	0	0	0
//5	0	0	0	0	0	0
//len = 4
//dp[0][4]
//stick = [0,5]
//cuts={1,3,4}
//
//k=1
//
//5+0+6 = 11
//
//k=2
//
//5+3+2 = 10
//
//k=3
//
//5+7+0 = 12
//
//Minimum:
//
//dp[0][4]=10
//dp[1][5]
//stick=[1,7]
//cuts={3,4,5}
//
//k=2
//
//6+0+6 =12
//
//k=3
//
//6+3+3 =12
//
//k=4
//
//6+6+0 =12
//dp[1][5]=12
//len = 5
//dp[0][5]
//stick=[0,7]
//cuts={1,3,4,5}
//
//k=1
//
//7+0+12 =19
//
//k=2
//
//7+3+6 =16
//
//k=3
//
//7+7+3 =17
//
//k=4
//
//7+10+0 =17
//
//Minimum:
//
//dp[0][5]=16
//Final Table
//i\j	0	1	2	3	4	5
//0	0	0	3	7	10	16
//1	0	0	0	3	6	12
//2	0	0	0	0	2	6
//3	0	0	0	0	0	3
//4	0	0	0	0	0	0
//5	0	0	0	0	0	0
//Answer
//dp[0][5] = 16
//
//✅ Minimum cost to cut the stick = 16.
//
//Important interview point: We fill the table diagonally because dp[i][j] depends on smaller intervals like dp[i][k] and dp[k][j], which must already be computed.

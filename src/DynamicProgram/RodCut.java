package DynamicProgram;

public class RodCut {
    static int rc(int[] price,int n){
       int[] dp=new int[n+1];  //0 to 8
        dp[0]=0;

        for(int i=1;i<=n;i++){
            int maxP = Integer.MIN_VALUE;
//one dimension array=1d
            for (int j = 1; j <= i; j++) {
                maxP = Math.max(price[j - 1] + dp[i - j], maxP);
            }
            dp[i] = maxP;
        }
        return dp[n];
    }

    public static void main(String[] args){
        int n=8;
        int[]price={1,5,8,9,10,17,17,20};
        System.out.println(rc(price,n));
    }
}
//Final DP Table
//i (Length)	0	1	2	3	4	5	6	7	8
//dp[i]	0	1	5	8	10	13	17	18	22
//Answer
//Maximum Profit = dp[8] = 22
//Important Interview Point
//
//For i = 8, the maximum profit 22 comes from:
//
//Length 8
//= 2 + 6
//
//Profit
//= 5 + 17
//= 22
//
//So the best cut is 2 units + 6 units.

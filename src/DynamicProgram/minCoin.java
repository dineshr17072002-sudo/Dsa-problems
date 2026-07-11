package DynamicProgram;

public class minCoin {
    public static void main (String[] args){
        int []arr={1,3,5};
        int amount=10;

        int [][]dp=new int[arr.length][amount+1];
        //fist column
        for(int i=0;i< arr.length;i++){
            dp[i][0]=0;
        }
        //row
        for(int j=1;j<=amount;j++){
            if(j% arr[0]==0){
                dp[0][j]=j/arr[0];
            }else{
                dp[0][j]=amount+1;
            }
        }
        for(int i=1;i< arr.length;i++){
            for(int j=1;j<=amount;j++){
                if(j<arr[i])
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=Integer.min(dp[i-1][j],1+dp[i][j-arr[i]]);
            }
        }
        int ans=dp[arr.length-1][amount];
        if(ans==amount+1){
            System.out.println("wrong");
        }else{
            System.out.println(ans+ "conis required");
        }
    }
}

package Array_Midium;

public class BuySell {

    public static void main(String[] args) {

        int[] arr = {1,4,7,3,8,5,1,6,9};

        int n = arr.length;

        int maxProfit = 0;
        int minPrice = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }

            int profit = arr[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println(maxProfit);
    }
}



//PRINT BY DAYS
/*public class BestTimeToBuySellStock {

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        int minPrice = prices[0];
        int minIndex = 0;

        int buyDay = 0;
        int sellDay = 0;

        int maxProfit = 0;

        for(int i=1;i<prices.length;i++){

            if(prices[i] < minPrice){
                minPrice = prices[i];
                minIndex = i;
            }

            int profit = prices[i] - minPrice;

            if(profit > maxProfit){
                maxProfit = profit;
                buyDay = minIndex;
                sellDay = i;
            }
        }

        System.out.println("Maximum Profit = " + maxProfit);
        System.out.println("Buy Price = " + prices[buyDay] + " (Day " + buyDay + ")");
        System.out.println("Sell Price = " + prices[sellDay] + " (Day " + sellDay + ")");
    }
}*/


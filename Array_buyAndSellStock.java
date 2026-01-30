import java.util.*;
public class Array_buyAndSellStock {
    public static int BuyAndSellStock(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxProfit=0;
        
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){                   //this loop find the profit
                int profit=prices[i]-buyprice;            // today's profit
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyprice=prices[i];
            }
        }
        System.out.print(maxProfit);
        return maxProfit;
    }
    public static void main(String[] args){
        int prices[]={7,1,5,3,6,4};
        BuyAndSellStock(prices);
    }
}

package example.topinterviewquestions.Arrays1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StockBuySellTest {

    @Test
    public void testMaxProfit(){
        int[] input = new int[]{3,5,2,9,1,6,7};
        Assertions.assertEquals(7,maxProfit(input));
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] currMin = new int[n];
        currMin[0] = prices[0];
        int[] currMax = new int[n];
        currMax[n-1] = prices[n-1];
        int result = 0;
        for(int i=1;i<n;i++)
        {
            currMin[i] = Math.min(currMin[i-1],prices[i]);
        }
        for(int i=n-2;i>=0;i--){
            currMax[i] = Math.max(currMax[i+1],prices[i]);
            result = Math.max(currMax[i]-currMin[i],result);
        }
        return result;
    }
}

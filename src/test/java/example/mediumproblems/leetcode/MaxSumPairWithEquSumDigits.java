package example.mediumproblems.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MaxSumPairWithEquSumDigits {

        @Test
        public void testMethod(){
            Assertions.assertEquals(872,maximumSum(new int[]{279,169,463,252,94,455,423,315,288,64,494,337,409,283,283,477,248,8,89,166,188,186,128}));
        }

    private int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for(int i=0;i<nums.length;i++){
            int digitSum = getDigitSum(nums[i]);
            if(map.containsKey(digitSum)){
                max = Math.max(max,nums[map.get(digitSum)]+nums[i]);
                map.put(digitSum,nums[map.get(digitSum)]>nums[i]?map.get(digitSum):i);
            }else
            map.put(digitSum,i);
        }
        return max;
    }
    private int getDigitSum(int num){
        int sum = 0;
        while(num!=0){
            sum+=num%10;
            num /= 10;
        }
        return sum;
    }
}

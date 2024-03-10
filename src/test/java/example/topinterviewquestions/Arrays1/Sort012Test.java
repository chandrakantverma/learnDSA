package example.topinterviewquestions.Arrays1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Sort012Test {

    @Test
    public void testSort012(){
        int nums[] = new int[]{2,0,2,1,1,0};
        int res[] = sortColors(nums);
        Assertions.assertEquals(Arrays.toString(new int[]{0,0,1,1,2,2}),Arrays.toString(res));
    }

    @Test
    public void testSort012_1(){
        int nums[] = new int[]{1,2,0};
        int res[] = sortColors(nums);
        Assertions.assertEquals(Arrays.toString(new int[]{0,1,2}),Arrays.toString(res));
    }




    public int[] sortColors(int[] nums) {
        int n = nums.length;
        int i = 0,start = 0, end = n-1;
        while(i<n&&i<=end){
            if(nums[i]==0){
                NextPermutationTest.swapElement(nums,i,start);
                start++;
                i++;
            }
            else if(nums[i]==2){
                NextPermutationTest.swapElement(nums,i,end);
                end--;
            }
            else
            i++;
        }
        return nums;
    }
}

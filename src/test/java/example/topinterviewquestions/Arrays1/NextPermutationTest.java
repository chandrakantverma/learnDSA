package example.topinterviewquestions.Arrays1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.logging.Logger;



public class NextPermutationTest {

    Logger log = Logger.getLogger(String.valueOf(NextPermutationTest.class));
    public void nextPermutation(int[] nums) {
        if(nums.length==1) return;
        boolean checkBreakPoint = false;
        int n = nums.length;
        int breakPoint = 0;
        for(int i = n-1;i>0;i--){
            if(nums[i]>nums[i-1])
            {
                breakPoint = i-1;
                checkBreakPoint = true;
                break;
            }
        }
        System.out.println(breakPoint);
        if(!checkBreakPoint){
            reverseArray(nums,0,n);
        }
        else{
            for(int i= n-1;i>breakPoint;i--){
                if(nums[i]>nums[breakPoint]){
                    swapElement(nums,i,breakPoint);
                    break;
                }
            }
            reverseArray(nums,breakPoint+1,n);
        }
    }

    private void swapElement(int[] nums, int minIndex, int breakPoint) {
        nums[minIndex] = nums[minIndex]+nums[breakPoint];
        nums[breakPoint] = nums[minIndex]-nums[breakPoint];
        nums[minIndex] = nums[minIndex]-nums[breakPoint];
    }

    private void reverseArray(int[] nums, int i, int n) {
        int end = n-1;
        while(i<end)
        {
            swapElement(nums,i,end);
            i++;
            end--;
        }
    }


    @Test
    public void nextPermutationTest(){
        int[] nums = new int[]{1,3,2};
        nextPermutation(nums);
        log.info(Arrays.toString(nums));
    }
}

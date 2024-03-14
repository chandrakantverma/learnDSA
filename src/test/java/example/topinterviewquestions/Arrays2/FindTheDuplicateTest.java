package example.topinterviewquestions.Arrays2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindTheDuplicateTest {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            if(nums[Math.abs(nums[i])-1]<0)
                return nums[i]*-1;
            else
                nums[Math.abs(nums[i])-1] *= -1;
            i++;
        }
        return 0;
    }

    @Test
    public void testDuplicate(){
        Assertions.assertEquals(2, findDuplicate(new int[]{1,3,4,2,2}));
    }
}

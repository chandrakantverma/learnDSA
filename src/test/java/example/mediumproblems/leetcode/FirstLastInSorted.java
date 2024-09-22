package example.mediumproblems.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstLastInSorted {

    @Test
    public void testSortedArray(){
        int[] res  = new int[]{0,0};
        int[] nums = new int[]{1};
        Assertions.assertArrayEquals(res,searchRange(nums,1));
    }

    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        int mid =0;

        while(l<=r){
            mid = (l+r)/2;

            if(nums[mid]==target){
                int first = mid,last= mid;
                while(first>=0&&nums[first]==target)first--;
                while(last<nums.length&&nums[last]==target)last++;
                return new int[]{first+1,last-1};
            }
            else if(nums[mid]<target)
                l = mid+1;
            else r= mid-1;
        }
        return new int[]{-1,-1};
    }
}

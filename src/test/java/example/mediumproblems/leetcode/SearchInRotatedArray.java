package example.mediumproblems.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInRotatedArray {

    @Test
    public void testSearchInRotate(){
        int nums[] = {4,5,6,7,0,1,2};
        Assertions.assertEquals(4,search(nums,0));
    }

    public int search(int[] nums, int target) {
        int l = 0, r=nums.length-1;
        int mid = 0;
        while(l<=r){
            mid = (r+l)/2;
            if(nums[mid]==target) return mid;

            if(nums[l]<=nums[mid]){
                if(nums[l]<=target&&target<=nums[mid]){
                    r= mid-1;
                }
                else l = mid+1;
            }
            else{
                if(nums[mid]<=target&&target<=nums[r]){
                    l=mid+1;
                }else{
                    r= mid-1;
                }
            }

        }
        return -1;
    }
}

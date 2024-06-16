package example.basics.mychoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncreasingSequenceTriplet {
  @Test
  public void testIncreasingSequenceTriplet() {
    Assertions.assertTrue(increasingTriplet(new int[] {7, 10, 3, 20, 5}));
  }

  public boolean increasingTriplet(int[] nums) {
    int a = Integer.MAX_VALUE;
    int b = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] <= a) {
        a = nums[i];
      } else if (nums[i] <= b) {
        b = nums[i];
      } else return true;
    }

    return false;
  }
}

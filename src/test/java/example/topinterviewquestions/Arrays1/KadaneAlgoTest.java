package example.topinterviewquestions.Arrays1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KadaneAlgoTest {
  @Test
  public void testKadaneAlgo() {
    Assertions.assertEquals(23, maxSubArray(new int[] {5, 4, -1, 7, 8}));
    Assertions.assertEquals(6, maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }

  @Test
  public void testKadaneAlgo1() {
    Assertions.assertEquals(6, maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }

  @Test
  public void testKadaneAlgo2() {
    Assertions.assertEquals(-1, maxSubArray(new int[] {-1}));
  }

  public int maxSubArray(int[] nums) {
    int n = nums.length;
    int maxSum = nums[0];
    int currSum = 0;
    for (int i = 0; i < n; i++) {

      currSum += nums[i];
      if (currSum > maxSum) maxSum = currSum;
      if (currSum < 0) currSum = 0;
    }
    return maxSum;
  }
}

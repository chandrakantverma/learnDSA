package example.topinterviewquestions.Arrays1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SetMaxZeroTest {
  @Test
  public void testSetMaxZero() {
    int[][] expected = {{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
    int[][] input = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
    Assertions.assertEquals(Arrays.deepToString(expected), Arrays.deepToString(setZeroes(input)));
  }

  public int[][] setZeroes(int[][] mat) {
    int m = mat.length;
    int n = mat[0].length;

    Set<Integer> rows = new HashSet<>();
    Set<Integer> cols = new HashSet<>();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (mat[i][j] == 0) {
          rows.add(i);
          cols.add(j);
        }
      }
    }
    for (Integer r : rows) {
      for (int col = 0; col < n; col++) {
        mat[r][col] = 0;
      }
    }

    for (Integer c : cols) {
      for (int row = 0; row < m; row++) {
        mat[row][c] = 0;
      }
    }
    return mat;
  }
}

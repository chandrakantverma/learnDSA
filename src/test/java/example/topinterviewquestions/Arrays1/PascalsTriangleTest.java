package example.topinterviewquestions.Arrays1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PascalsTriangleTest {

  public boolean generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 1; i <= numRows; i++) {
      List<Integer> tempList;
      if (i == 1) {
        result.add(
            new ArrayList<Integer>() {
              {
                add(1);
              }
            });
      } else {
        tempList = new ArrayList<>(result.get(i - 2));
        List<Integer> newList = new ArrayList<>(tempList);

        for (int j = 1; j < result.get(i - 2).size(); j++) {
          newList.set(j, tempList.get(j - 1) + tempList.get(j));
        }
        newList.add(1);
        result.add(newList);
      }
    }
    return true;
  }

  @Test
  public void testPascalTriangle() {
    Assertions.assertTrue(generate(5));
  }
}

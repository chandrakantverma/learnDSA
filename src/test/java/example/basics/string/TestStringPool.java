package example.basics.string;

import org.junit.jupiter.api.Test;

public class TestStringPool {

  @Test
  public void testStringPool() {
    String str = new String("hello");
    str = "good";
    System.out.println(str);
    String str1 = null;
    String str2 = null;

    StringBuilder sb = new StringBuilder(str);
    System.out.println(sb.reverse());
    System.out.println(str1 == str2);
  }
}

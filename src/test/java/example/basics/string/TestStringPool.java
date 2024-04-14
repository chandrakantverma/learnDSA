package example.basics.string;

import org.junit.jupiter.api.Test;

public class TestStringPool {

    @Test
    public void testStringPool(){
        String str = new String("hello");
        str = "good";
        System.out.println(str);
    }
}

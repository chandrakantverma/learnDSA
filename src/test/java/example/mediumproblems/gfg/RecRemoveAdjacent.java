package example.mediumproblems.gfg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RecRemoveAdjacent {

    @Test
    void testRemoveAdjacent(){
        Assertions.assertEquals("",rremove("abccbccba"));
    }
    String rremove(String s) {
        // code her
        int l = s.length();
        if(l==2&&s.charAt(0)==s.charAt(1)) return "";
        boolean duplicates = false;
        String temp = "";
        for(int i=0;i<l;i++){
            boolean tempDup = false;
            if(i==l-1){
                temp = temp+s.charAt(i);
                break;
            }
            while(i!=l-1l&&s.charAt(i)==s.charAt(i+1)){
                duplicates = true;
                tempDup = true;
                i = i+1;
            }
            if(tempDup)
            continue;
            if(i<l)
                temp = temp+s.charAt(i);
            System.out.println(temp);
        }
        return duplicates?rremove(temp):temp;
    }
}

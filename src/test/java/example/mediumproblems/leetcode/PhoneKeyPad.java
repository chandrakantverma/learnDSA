package example.mediumproblems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PhoneKeyPad {

    public List<String> letterCombinations(String digits) {
        String keys[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result = new ArrayList<>();
        backTrack(result, new StringBuilder(""),keys,digits);
        return result;
    }
    public void backTrack(List<String> result,StringBuilder sb,String[] keys, String digits){



    }
}

package example.mediumproblems.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class DiffWaytoAddParanthese {

    public static void main(String[] args) {
        System.out.println(diffWaysToCompute("2*3-4*5"));
    }

    public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();

        // Iterate through the expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If the current character is an operator
            if (c == '+' || c == '-' || c == '*') {
                // Divide the expression into two parts based on the operator
                String leftPart = expression.substring(0, i);
                String rightPart = expression.substring(i + 1);

                // Recursively calculate results for the left and right parts
                List<Integer> leftResults = diffWaysToCompute(leftPart);
                List<Integer> rightResults = diffWaysToCompute(rightPart);

                // Combine results of left and right using the current operator
                for (int left : leftResults) {
                    for (int right : rightResults) {
                        switch (c) {
                            case '+':
                                result.add(left + right);
                                break;
                            case '-':
                                result.add(left - right);
                                break;
                            case '*':
                                result.add(left * right);
                                break;
                        }
                    }
                }
            }
        }

        // If the expression is a single number, return it as the only result
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }

        return result;
    }
}



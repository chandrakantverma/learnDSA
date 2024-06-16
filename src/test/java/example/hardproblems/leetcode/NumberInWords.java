package example.hardproblems.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class NumberInWords {

    @Test
    public void testNumberToWords(){
        System.out.println(numberToWords(1000000));
    }

    public String numberToWords(int num) {
        if(num==0) return "Zero";
        String[] pointers = {"","","Thousand","Million","Billion","Trillion"};
        String result = "";
        int count = 0;
        Stack<String> st = new Stack<>();
        while(num!=0){
            int temp = num%1000;
            String auxString = get3DigitWord(temp);
            count++;
            if(!auxString.equals(""))
            st.push(auxString);
            num = num/1000;
        }
        if(st.size()==1){
            return (st.peek()+" "+pointers[count]).trim();
        }
        while(!st.isEmpty()){
            String temp = st.peek();
            st.pop();
            System.out.println(temp);
            result = result + " " + temp + (!st.isEmpty()?(" " + pointers[count--]):"");
        }

        return result.trim();
    }
    public String get3DigitWord(int temp){

        String unitIndex[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String secondDecimalIndex[] = {"0","1","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

        int len = String.valueOf(temp).length();
        if(len==1) return unitIndex[temp];
        else if(len==2) {
            if(temp/10>=2){
                return (secondDecimalIndex[temp/10]+" "+unitIndex[temp%10]).trim();
            }
            else{
                return unitIndex[temp];
            }
        }

        int secondUnit = (temp - (temp/100)*100)/10;

        String one = unitIndex[temp/100];

        String two = "";
        if(secondUnit>=2){
            two = secondDecimalIndex[secondUnit];
        }
        else{
            if(secondUnit==1){
                two = unitIndex[temp%100];
            }
        }

        String three = (secondUnit!=1)?unitIndex[temp%10]:"";
        return (one+" Hundred "+two+ (secondUnit!=0?" ":"")+three).trim();

    }
}

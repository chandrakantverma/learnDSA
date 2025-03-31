package steps.step1.lecture4;

import java.util.*;

public class CountDigit {

    public static void main(String[] args) {
        int digits = 123456789;
        StringBuilder sb = new StringBuilder(String.valueOf(digits));
        System.out.println(String.valueOf(digits).length());
        System.out.println(sb.reverse().toString().equals(String.valueOf(digits)));
        int[] arr = new int[]{34,34,1,3435,2,3552,98};
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println();
        Long start1 = System.currentTimeMillis();
        System.out.println("GCD: "+findGCD1(21232323,77343243));
        System.out.println(System.currentTimeMillis()-start1);
        Long start2 = System.currentTimeMillis();
        System.out.println("GCD: "+findGCD2(21232323,77343243));
        System.out.println(System.currentTimeMillis()-start2);
        Long start3 = System.currentTimeMillis();
        List<Integer> sortedListOfDivisors = printDivisors(77343243);
        System.out.println(sortedListOfDivisors);
        System.out.println(System.currentTimeMillis()-start3);


    }

    public int countPrimes(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        for(int i=2;i*i<n;i++){
            if(isPrime[i]==1){
                for(int j =i*i;j<n;j+=i){
                    isPrime[j]=0;
                }
            }
        }
        return (int) Arrays.stream(isPrime).filter(a -> a==1).count();
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j*j <i ; j++) {
            if(i%j==0) return false;

        }return true;
    }

    private static List<Integer> printDivisors(int i) {
        List<Integer> result = new ArrayList<>();
        for(int j=1;j*j<=i;j++){
            if(i%j==0){
                result.add(j);
                result.add(i/j);
            }
        }
        Collections.sort(result);
        return result;
    }

    private static int findGCD1(int min, int max) {
        int gcd = 1;
        for(int i=1;i<min/2;i++){
            if(min%i==0&&max%i==0) gcd = Math.max(gcd,i);
        }
        return gcd;
    }
    private static int findGCD2(int max, int min) {
        if(min==0) return max;
        int rem = max%min;
        if(rem>min) return findGCD2(rem,min);
        return findGCD2(min,rem);
    }

}

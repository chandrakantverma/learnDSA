package example.patterns;

import org.junit.jupiter.api.Test;

public class Pattern1 {

    @Test
    public void question7(){
        int N =4;
        for (int i = 1; i <=N; i++) {
            for(int j=1;j<=N;j++){
                if(j<=i)
                System.out.print(j);
                else System.out.print(" ");
            }
            for(int j=N;j>0;j--){
                if(j<=i)
                    System.out.print(j);
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = N; i>0; i--) {
            for(int j=1;j<=N;j++){
                if(j<=i)
                    System.out.print(j);
                else System.out.print(" ");
            }
            for(int j=N;j>0;j--){
                if(j<=i)
                    System.out.print(j);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

}

package PatternPrint;

import java.util.Scanner;

public class palindromePattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the num:");
        int n=s.nextInt();

        for(int i=0;i<n;i++){
            //space
            int space=n-i-1;
            for(int k=0;k<space;k++){
                System.out.print(" ");
            }
            //left
            for(int j=i;j>=0;j--){
                System.out.print(j);
            }
            //right
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
           if(i!=n-1)
            System.out.println();

           //     0
            //   101
            //  21012
            // 3210123
            //432101234
        }
    }
}


/* n=5

    0
   101
  21012
 3210123
 */
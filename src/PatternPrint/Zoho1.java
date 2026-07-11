package PatternPrint;

import java.util.Scanner;

public class Zoho1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the num:");
        int n = s.nextInt();

        for(int i=1;i<=n;i++){
            int t=i;
            for(int j=1;j<=i;j++){
                System.out.print(t+" ");
                t+=n-j;  //+2 next line +3
            }
            System.out.println();
        }

    }
}
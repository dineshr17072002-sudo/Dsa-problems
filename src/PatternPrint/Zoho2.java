package PatternPrint;

import java.util.Scanner;

public class Zoho2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the num:");
        int n = s.nextInt();

        int count=0;
        for(int i=1;i<=(n/2)+1;i++){
            int k=count+i;
            for(int j=1;j<=i;j++){
                System.out.print(k--+" ");
            }
            count+=i;
            System.out.println();
        }


        for(int i=(n/2);i>=1;i--){
            int k=count+i;
            for(int j=1;j<=i;j++){
                System.out.print(k--+" ");
            }
            count+=i;
            System.out.println();

    }
}}
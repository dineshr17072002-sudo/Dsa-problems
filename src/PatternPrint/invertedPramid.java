package PatternPrint;

import java.util.Scanner;

public class invertedPramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star=2*n-1;
        int spa=0;

        for(int i=0;i<n;i++){
            //space

            for(int j=0;j<spa;j++)
                System.out.print(" ");
                spa++;

            //stars
            for(int j=0;j<=star;j++)
            System.out.print("*");
            star-=2;

            System.out.println();

        }
}}


/// donot use brackets for loops{}
package PatternPrint;

import java.util.Scanner;

public class butterfly2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        //*      *
        //**    **
        //***  ***
        //********
        //***  ***
        //**    **
        //*      *

        //Easy trick to remember
        //Upper half: i goes up (1 → n), so the butterfly opens (stars increase, spaces decrease).
        //Lower half: i goes down (n-1 → 1), so the butterfly closes (stars decrease, spaces increase).

        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

}

package PatternPrint;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // Spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();

            //         *********
            //        *********
            //       *********
            //      *********
            //     *********
            //    *********
            //   *********
            //  *********
            // *********
        }
    }
}
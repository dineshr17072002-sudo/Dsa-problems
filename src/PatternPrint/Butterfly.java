package PatternPrint;
import java.util.Scanner;
public class Butterfly {


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter n (odd number): ");
            int n = sc.nextInt();

            int stars = n / 2 + 1;
            int spaces = 0;
            //********
            //***  ***
            //**    **
            //*      *
            //**    **
            //***  ***
            //********

            //The pattern is formed by:
            //
            //Left wing (left stars)
            //Middle gap (spaces)
            //Right wing (right stars)
            for (int i = 1; i <= n; i++) {

                // Left stars
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }

                // Middle spaces
                for (int j = 1; j <= spaces; j++) {
                    System.out.print(" ");
                }

                // Right stars
                for (int j = 1; j <= stars; j++) {
                    System.out.print("*");
                }

                System.out.println();

                // Upper half
                if (i < n / 2 + 1) {
                    stars--;
                    spaces += 2;
                }

                // Middle row
                else if (i == n / 2 + 1) {
                    stars = 2;
                    spaces = n - 3;
                }

                // Lower half
                else {
                    stars++;
                    spaces -= 2;
                }
            }

          //  sc.close();
        }
    }


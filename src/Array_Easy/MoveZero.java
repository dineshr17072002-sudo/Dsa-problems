package Array_Easy;

import java.util.Scanner;

public class MoveZero {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
                                                        //if questionlike this{1,2,3,4,5,4,4,6,4}
                        //use  int x = sc.nextInt();   // Element to move    if (arr[i] != x) {
            int j = 0;                              //rest of them same

            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    j++;
                }
            }

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }



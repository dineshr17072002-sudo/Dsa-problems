package Array_Midium;

public class Sort012 {
    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0};

        int zero = 0, one = 0, two = 0;

        // Count
        for (int num : arr) {
            if (num == 0) zero++;
            else if (num == 1) one++;
            else two++;
        }

        int i = 0;

        // Fill 0s
        while (zero-- > 0) {
            arr[i++] = 0;
        }

        // Fill 1s
        while (one-- > 0) {
            arr[i++] = 1;
        }

        // Fill 2s
        while (two-- > 0) {
            arr[i++] = 2;
        }

        // Print
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
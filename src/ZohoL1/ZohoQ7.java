package ZohoL1;

public class ZohoQ7 {

    public static int zoho(int[] A, int target) {

        int low = 0;
        int high = A.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (A[mid] == target) {             // arr mid so =5->a[2]
                return mid;
            }
            else if (A[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[] A = {1, 3, 5, 6, 8};
        int target = 7;

        System.out.println(zoho(A, target));
    }
}
/*
Given
A = [1, 3, 5, 6, 8]
target = 7
Initial:
low = 0
high = 4
🔹 Iteration 1
mid = (low + high) / 2
    = (0 + 4) / 2
    = 2
So:
A[mid] = A[2] = 5
Compare:
5 == 7 ❌
5 > 7  ❌
Therefore:
low = mid + 1;
low = 3
high = 4
🔹 Iteration 2
mid = (3 + 4) / 2
    = 3
A[3] = 6
Compare:
6 == 7 ❌
6 > 7  ❌
So:
low = mid + 1;
Now:
low = 4
high = 4
🔹 Iteration 3
mid = (4 + 4) / 2
    = 4
A[4] = 8
Compare:
8 == 7 ❌
8 > 7 ✅
Therefore:
high = mid - 1;
So:
high = 3
low = 4
🔹 Loop stops
 */
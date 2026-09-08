package ZohoL1;

public class ZohoQ8 {

    public static boolean zoho(int[] arr, int n) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                boolean a = (i == 0) || (arr[i - 1] == 0);

                boolean b = (i == arr.length - 1) || (arr[i + 1] == 0);

                if (a && b) {
                    arr[i] = 1;
                    count++;
                }
            }
        }

        return count >= n;
    }

    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 0, 0};
        int n = 1;

        boolean result = zoho(arr, n);

        System.out.println(result);
    }
}
/*
Initial:
arr   = [0, 0, 1, 0, 0]
count = 0
i = 0
arr[0] = 0
Calculate a:
a = (i == 0) || (arr[i - 1] == 0)
Since i == 0:
a = true
Calculate b:
b = (i == arr.length - 1) || (arr[i + 1] == 0)
0 is not the last index, so check:
arr[1] = 0
Therefore:
b = true
So:
a && b
true && true = true
Execute:
arr[0] = 1;
count++;
Now:
arr   = [1, 0, 1, 0, 0]
count = 1
i = 1
arr[1] = 0
Left:
arr[0] = 1
Therefore:
a = false
Since a && b cannot be true, nothing happens.
arr   = [1, 0, 1, 0, 0]
count = 1
i = 2
arr[2] = 1
So:
if (arr[i] == 0)
is false.
Nothing happens.
i = 3
arr[3] = 0
Left:
arr[2] = 1
So:
a = false
Nothing happens.
i = 4
arr[4] = 0
This is the last element.
Therefore:
b = true
But left side:
arr[3] = 0
So:
a = true
Thus:
a && b
true && true = true
Execute:
arr[4] = 1;
count++;
Now:
arr   = [1, 0, 1, 0, 1]
count = 2
Finally
return count >= n;
We have:
count = 2
n = 1
Therefore:
2 >= 1
is true.
 */
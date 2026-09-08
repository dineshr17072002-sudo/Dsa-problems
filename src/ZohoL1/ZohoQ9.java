package ZohoL1;

public class ZohoQ9 {

    public static void zoho() {

        for (int i = 0; i <= 5; i++) {
            System.out.print(help(5, i) + " ");
        }
    }

    private static int help(int n, int k) {

        if (k == 0 || k == n) {
            return 1;
        }

        return help(n - 1, k - 1) + help(n - 1, k);
    }

    public static void main(String[] args) {

        zoho();
    }
}
/*
Debug it step-by-step
The loop is:
for (int i = 0; i <= 5; i++)
So i takes:
0 → 1 → 2 → 3 → 4 → 5
Each time:
help(5, i)
is called.
1. help(5, 0)
if (k == 0 || k == n)
Here:
k = 0
So condition is true.
return 1;
Result:
help(5,0) = 1
2. help(5, 1)
Not a base case, so:
help(5,1)
= help(4,0) + help(4,1)
Now:
help(4,0) = 1
and
help(4,1)
= help(3,0) + help(3,1)
= 1 + 3
= 4
Therefore:
1 + 4 = 5
So:
help(5,1) = 5
3. help(5, 2)
help(5,2)
= help(4,1) + help(4,2)
We know:
help(4,1) = 4
help(4,2) = 6
Therefore:
4 + 6 = 10
4. help(5, 3)
help(5,3)
= help(4,2) + help(4,3)
= 6 + 4
= 10
5. help(5, 4)
help(5,4)
= help(4,3) + help(4,4)
= 4 + 1
= 5
6. help(5, 5)
Here:
k == n
because:
5 == 5
Therefore:1

1 5 5 10 10 1
 */
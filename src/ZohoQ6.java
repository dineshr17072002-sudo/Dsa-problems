public class ZohoQ6 {

    public static boolean zoho(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {

            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else {
                return help(s, i + 1, j) ||
                        help(s, i, j - 1);
            }
        }

        return true;
    }

    public static boolean help(String s, int i, int j) {

        while (i <= j) {

            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "AllTheBest";

        System.out.println(zoho(s));
    }
}

/*String s = "AllTheBest";
1. Initial values
String:
 A l l T h e B e s t
 0 1 2 3 4 5 6 7 8 9
i = 0
j = 9
Compare:
s.charAt(0) == s.charAt(9)
'A' == 't'
❌ Not equal.
So else executes:
return help(s, i + 1, j) || help(s, i, j - 1);
That means:
help(s, 1, 9) || help(s, 0, 8)
2. First call: help(s, 1, 9)
Compare:
 A [l l T h e B e s t]
   ↑               ↑
   1               9
'l' != 't'
❌ So this returns:
false
3. Second call: help(s, 0, 8)
Now:
 [A l l T h e B e s] t
  ↑               ↑
  0               8
Compare:
'A' != 's'
❌ So this also returns:
false
4. Final result
We had:
false || false
Therefore:

return false;

 */
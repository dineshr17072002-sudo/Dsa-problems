package ZohoL1;

public class ZohoQ3 {

    public static String zoho(String s) {

        char[] c = s.toCharArray();

        for (int i = 1; i < c.length; i = i + 2) {
            c[i] = (char) (c[i - 1] + c[i] - '0');
        }

        return String.valueOf(c);
    }

    public static void main(String[] args) {

        String s = "D4V1D";

        System.out.println(zoho(s));
    }
}

/*Capital letters:
A = 65
B = 66
C = 67
D = 68
E = 69
F = 70
G = 71
H = 72
I = 73
J = 74
...
V = 86
W = 87
Digits:
'0' = 48
'1' = 49
'2' = 50
'3' = 51
'4' = 52
'5' = 53
'6' = 54
'7' = 55
'8' = 56
'9' = 57

That's why in your code:
c[i - 1] + c[i] - '0'
For D4:
68 + 52 - 48
= 72
= H
For V1:
86 + 49 - 48
= 87
= W
So:
D4V1D
 ↓
DHVWD
*/
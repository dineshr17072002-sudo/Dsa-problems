

public class ZohoQ2{

    public static String zoho(String s) {

        int sp = -1;

        char[] arr = s.toCharArray();

        int l = s.length();

        for (int i = 0; i <= l; i++) {

            if (i == l || arr[i] == ' ') {

                int j = sp + 1;
                int k = i - 1;

                while (j < k) {

                    char temp = arr[j];

                    arr[j] = arr[k];

                    arr[k] = temp;

                    j++;
                    k--;
                }

                sp = i;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String s = "Zoho Corp";

        System.out.println(zoho(s));
    }
}
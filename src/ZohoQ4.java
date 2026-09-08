public class ZohoQ4 {

    static class Pair {
        int key;
        boolean value;

        Pair(int key, boolean value) {
            this.key = key;
            this.value = value;
        }
    }

    public static int zoho(int[] nums) {

        Pair a = new Pair(-1, false);
        Pair b = new Pair(-1, false);
        Pair c = new Pair(-1, false);

        for (int num : nums) {

            if ((a.value && a.key == num) ||
                    (b.value && b.key == num) ||
                    (c.value && c.key == num)) {

                continue;
            }

            if (!a.value || a.key <= num) {

                c = b;
                b = a;
                a = new Pair(num, true);

            } else if (!b.value || b.key <= num) {

                c = b;
                b = new Pair(num, true);

            } else if (!c.value || c.key <= num) {

                c = new Pair(num, true);
            }
        }

        if (!c.value)
            return a.key;

        return c.key;
    }

    public static void main(String[] args) {

        int[] nums = {5, 2, 2, 3, 1, 4};

        System.out.println(zoho(nums));
    }
}

/*
Input:
        5  2  2  3  1  4

        ↓

a = 5   → largest
        b = 4   → second largest
c = 3   → third largest
*/

 package Array_Midium;

public class MajorityElement {
    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (candidate == arr[i]) {
                count++;                                                        //Method 3: Moore's Voting Algorithm (Best) — O(n), O(1)
            } else {
                count--;
            }
        }

        System.out.println(candidate);
    }
}
/*import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > arr.length / 2) {
                System.out.println(num);
                return;
            }
        }
    }
} Hashmap*/
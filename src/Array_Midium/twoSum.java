package Array_Midium;

import java.util.HashMap;

public class twoSum {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 7;
        int a2 = 0;
        int n= arr.length;
                                       //HahMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <n; i++) {
            a2 = target - arr[i];
            if (map.containsKey(a2)) {
                System.out.println(map.get(a2)+" "+i);
                return;
            }


            map.put(arr[i], i);
        }
    }
}

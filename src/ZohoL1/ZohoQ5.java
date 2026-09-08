package ZohoL1;

import java.util.Arrays;

public class ZohoQ5 {

    public static int[] zoho(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            int temp = -1;
            int j = nums2.length - 1;

            while (j >= 0 && nums2[j] != nums1[i]) {

                if (nums2[j] > nums1[i]) {
                    temp = nums2[j];
                }

                j--;
            }

            ans[i] = temp;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 3, 4};
        int[] nums2 = {0, 1, 2, 3, 4, 5};

        int[] result = zoho(nums1, nums2);

        System.out.println(Arrays.toString(result));
    }
}


/*
nums1 = [2, 3, 4]

2 → 3
3 → 4
4 → 5

ans = [3, 4, 5]
🔑 Key lines to remember
int temp = -1;
➡️ Default answer if no greater element exists.
int j = nums2.length - 1;
➡️ Start from the right end of nums2.
while (j >= 0 && nums2[j] != nums1[i])
➡️ Move left until the target element is found.
if (nums2[j] > nums1[i])
    temp = nums2[j];
➡️ Keep track of a greater element.
j--;
➡️ Move left.
ans[i] = temp;
➡️ Store the result.
In one sentence:
👉 For each number in nums1, scan nums2 from right to left until you find that number, while remembering the nearest greater number encountered.
 */
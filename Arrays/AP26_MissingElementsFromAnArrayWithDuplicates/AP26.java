package AP26_MissingElementsFromAnArrayWithDuplicates;

import java.util.ArrayList;

/**
 * AP26
 * with n size array 1 to n element can exist in an array some having duplicates
 */
public class AP26 {

    static ArrayList<Integer> missingElementsFromAnArrayWithDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int idx = 0; idx < n; idx++) {
            int value = Math.abs(arr[idx]);
            int position = value - 1;

            if (arr[position] > 0) {
                arr[position] = -arr[position];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 5, 2, 2};
        ArrayList<Integer> list = missingElementsFromAnArrayWithDuplicates(arr);
        System.out.println(list.toString());
    }
}
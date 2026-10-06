package AP16_UnionOfArray;

import java.util.HashMap;

/**
 * AP16
 */
public class AP16 {

    static void unionOfArray(int[] arr, int[] brr) {
        HashMap<Integer, Integer> inter = new HashMap<>();
        for (int i : arr) {
            inter.put(i, inter.getOrDefault(i, 0) + 1);
        }
        for (int i : brr) {
            inter.put(i, inter.getOrDefault(i, 0) + 1);
        }
        System.out.println("Union : ");
        for (int i : inter.keySet()) {
            if (inter.get(i) > 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 5, 5, 6 };
        int[] brr = { 3, 5, 9, 12 };
        unionOfArray(arr, brr);
    }
}
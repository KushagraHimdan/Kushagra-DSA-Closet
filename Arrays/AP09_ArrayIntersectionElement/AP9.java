package AP09_ArrayIntersectionElement;

import java.util.HashMap;

/**
 * AP9
 */
public class AP9 {

    static void intersactionOfArray(int[] arr, int[] brr) {
        HashMap<Integer, Integer> inter = new HashMap<>();
        for (int i : arr) {
            inter.put(i, inter.getOrDefault(i, 1));
        }
        for (int i : brr) {
            inter.put(i, inter.getOrDefault(i, 0)+1);
        }
        System.out.println("Intersection : ");
        for (int i : inter.keySet()) {
            if (inter.get(i) > 1) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 4, 5, 5, 6 };
        int[] brr = { 3, 5, 9, 12 };
        intersactionOfArray(arr, brr);
    }
}
package AP24_FirstRepeatingElement;

import java.util.HashMap;

/**
 * AP24
 */
public class AP24 {

    static int firstRepeatingElement(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i : arr) {
            if (freq.get(i) > 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 3, 4, 5, 6 };
        int res = firstRepeatingElement(arr);
        System.out.println(res);
    }
}
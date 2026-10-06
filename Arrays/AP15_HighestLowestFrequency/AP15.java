package AP15_HighestLowestFrequency;

import java.util.HashMap;

/**
 * AP14
 */
public class AP15 {

    static int[] getMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int minFreq = arr.length;
        int minFreqKey = -1;
        int maxFreq = -1;
        int maxFreqKey = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeyFreq = freq.get(key);
            if (currentKeyFreq > maxFreq) {
                maxFreq = currentKeyFreq;
                maxFreqKey = currentKey;
            }
            if (currentKeyFreq < minFreq) {
                minFreq = currentKeyFreq;
                minFreqKey = currentKey;
            }
        }

        int[] result = { maxFreqKey, minFreqKey };

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 3, 3, 4, 5, 6, 6, 7, 7, 7, 7 };
        int result[] = getMode(arr);
        System.out.println("Highest freq is : " + result[0] + " Lowest freq is : " + result[1]);
    }
}

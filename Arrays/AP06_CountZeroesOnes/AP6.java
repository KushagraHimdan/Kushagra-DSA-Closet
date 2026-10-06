package AP06_CountZeroesOnes;

/**
 * AP6
 */
public class AP6 {

    static int[] getZeroOneCount(int[] arr) {
        int zero_count = 0;
        int one_count = 0;

        for (int i : arr) {
            if (i == 0) {
                zero_count += 1;
            } else {
                one_count += 1;
            }
        }
        int[] result = { zero_count, one_count };
        return result;
    }
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 0, 1 };
        int[] result = getZeroOneCount(arr);
        System.out.println("Number of zeroes : " + result[0] + " Number of Ones : " + result[1]);
    }
}
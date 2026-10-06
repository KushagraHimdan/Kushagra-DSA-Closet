package AP18_MissingNumber;

/**
 * AP18
 */
public class AP18 {

    static int missingNumber(int[] arr) {
        int xorSum = 0;
        // xor with array element
        for (int num : arr) {
            xorSum = xorSum ^ num;
        }
        // xor with range
        for (int i = 0; i <= arr.length; i++) {
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }

    public static void main(String[] args) {
        // range 0 to n
        int[] arr = { 2, 4, 0, 1, 3 };
        int result = missingNumber(arr);
        System.out.println("Missing Number : " + result);
    }
}
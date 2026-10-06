package AP27_MaximumSubarray;

/**
 * AP27
 */
public class AP27 {

    static int maximumSubarray(int[] arr){
        int sum = 0;
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            maximum = Math.max(maximum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int res = maximumSubarray(arr);
        System.out.println("maximum sum : " + res);
    }
}
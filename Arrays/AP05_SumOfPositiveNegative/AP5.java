package AP05_SumOfPositiveNegative;

public class AP5 {
    public static int[] sumOfPositiveAndNegative(int[] arr) {
        int positiveSum = 0;
        int negativeSum = 0;
        for (int i : arr) {
            if (i > 0) {
                positiveSum += i;
            } else {
                negativeSum += i;
            }
        }
        int[] ans = { positiveSum, negativeSum };
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -3, -4, 7, 9, -8, 2, 6, 7 };
        int[] ans = sumOfPositiveAndNegative(arr);
        System.out.println("Positive sum : " + ans[0] + " Negative sum : " + ans[1]);
    }
}

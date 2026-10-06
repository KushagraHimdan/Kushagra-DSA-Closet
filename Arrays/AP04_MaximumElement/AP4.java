package AP04_MaximumElement;

public class AP4 {
    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 8, 9, 4, 4, 7 };
        int ans = findMax(arr);
        System.out.println("Maximum element in an array is : " + ans);
    }
}
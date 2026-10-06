package AP03_LinearSearch;

public class AP3 {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 9 };
        int target = 3;
        int ans = linearSearch(arr, target);
        if (ans == -1) {
            System.out.println("The target " + target + " is not in array.");
        } else {
            System.out.println("The target is at index " + ans + ".");
        }
    }
}

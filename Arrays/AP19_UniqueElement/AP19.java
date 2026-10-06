package AP19_UniqueElement;

/**
 * AP19
 */
public class AP19 {

    static int uniqueElement(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result = result ^ i;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        int result = uniqueElement(arr);
        System.out.println(result);
    }
}
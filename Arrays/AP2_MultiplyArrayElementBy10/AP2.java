package AP2_MultiplyArrayElementBy10;

public class AP2 {

    static int[] multiplyBy10(int[] arr) {
        int size = arr.length;
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        // return new array
        return newArray;
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3, 9 };
        int[] answer = multiplyBy10(arr);
        System.out.println("Answer Array : ");
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

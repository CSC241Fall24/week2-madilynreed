public class Q2PrintArray {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(array.length);
    }

    private static void printRecursion(int i) {
        if (i <= 0) { // base case
            return;
        }
        System.out.println(array[array.length - i]);
        printRecursion(i-1);
    }
}
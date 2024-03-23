public class sum_recursion{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = findSum(arr, arr.length - 1);
        System.out.println("Sum of the elements in the array: " + sum);
    }

    public static int findSum(int[] arr, int index) {
        if (index == -1) {
            return 0;
        }
        return arr[index] + findSum(arr, index - 1);
    }
}

public class selectionSort {
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] data = {9, 7, 5, 11, 12, 2, 1, 5};
        System.out.println("Unsorted Array:");
        printArray(data);

        selectionSort(data);
        System.out.println("\nSorted Array in Ascending Order:");
        printArray(data);
    }
}
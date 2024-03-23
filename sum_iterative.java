public class sum_iterative {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 44, 89, 34};
        int sum = 0;
        for (int number : numbers) {
            sum += number;    
        }
        System.out.println("Sum: " + sum);
    }
}
import java.util.Scanner;

public class GetArrayMean {
    public static double calculateMean(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number: ");
            array[i] = scanner.nextInt();
        }

        double mean = calculateMean(array);
        System.out.printf("Mean of array is: %.2f%n", mean);

        scanner.close();
    }
}

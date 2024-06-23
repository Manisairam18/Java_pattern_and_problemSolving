import java.util.Scanner;

public class ArraySumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements to allocate:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Allocated space for " + n + " elements.");
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int sum = calculateSum(arr);
        System.out.println("The sum of the entered values is: " + sum);
    }
    
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}

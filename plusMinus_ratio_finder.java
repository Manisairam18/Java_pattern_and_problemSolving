import java.util.Scanner;

public class plusMinusRatio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Here your ratio values are: ");
		plusMinusRatio(arr);
		sc.close();
	}

	public static void plusMinusRatio(int[] arr) {

		int n = arr.length;
		int positiveinteger = 0;
		int negativeinteger = 0;
		int zerointeger = 0;

		for (int num : arr) {
			if (num > 0) {
				positiveinteger++;
			} else if (num < 0) {
				negativeinteger++;
			} else {
				zerointeger++;
			}
		}

		double positiveratio = (double) positiveinteger / n;
		double negativeratio = (double) negativeinteger / n;
		double zeroratio = (double) zerointeger / n;

		System.out.println(positiveratio);
		System.out.println(negativeratio);
		System.out.println(zerointeger);
	}

}

import java.util.Scanner;

public class swaptwonumbers {

	public static void main(String[] args) {
		System.out.println("Enter any number to swap : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int temp;
		System.out.println("Your value before swapping : " + n + " " + m);
		temp = n;
		n = m;
		m = temp;
		System.out.println("Your value after swapping : " + n + " " + m);

		n = n + m;
		m = n - m;
		n = n - m;
		System.out.println("Again arrange the before swapping value : " + n + " " + m);
	}

}

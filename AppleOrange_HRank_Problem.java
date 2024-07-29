import java.util.Scanner;

public class AppleOrange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting point and ending point for house distance:");
		int start = sc.nextInt();
		int end = sc.nextInt();

		System.out.println("Enter the location of the apple(apple) tree and the orange(orange) tree:");
		int apple = sc.nextInt();
		int orange = sc.nextInt();

		System.out.println("Enter the number of apple and oranges : ");
		int appc = sc.nextInt();
		int orgc = sc.nextInt();

		int[] apples = new int[apple];
		System.out.println("Enter the distance of each apple from the orange tree :");
		for (int i = 0; i < appc; i++) {
			apples[i] = sc.nextInt();
		}

		int[] oranges = new int[orgc];
		System.out.println("Enter the distances of each orange from the orange tree :");
		for (int i = 0; i < orgc; i++) {
			oranges[i] = sc.nextInt();

		}

		int orangecount = 0;
		int applecount = 0;

		for (int i = 0; i < appc; i++) {
			int appleposition = appc + apples[i];
			if (appleposition >= start && appleposition <= end) {
				applecount++;
			}

		}

		for (int i = 0; i < orgc; i++) {
			int orangeposition = orgc + oranges[i];
			if (orangeposition >= start && orangeposition <= end) {
				orangecount++;
			}

		}
		System.out.println("Number of apples that fall on the house : " + applecount);
		System.out.println("Number of oranges that fall on the house :" + orangecount);
	}

}


import java.util.Scanner;

public class timeconversion {

	public static String Timeconversion(String s) {

		String period = s.substring(s.length() - 2);
		int hour = Integer.parseInt(s.substring(0, 2));
		String minsec = s.substring(2, s.length() - 2);

		if (period.equals("AM")) {
			if (hour == 12) {
				hour = 0;
			}
		} else {
			if (hour != 12) {
				hour = hour + 12;
			}
		}
		String hrs = String.format("%02d", hour);
		return hrs + minsec;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time in 12 hour format (HH:MM:SS AM/PM) : ");
		String n = sc.nextLine();

		String convertedtime = Timeconversion(n);
		System.out.println(convertedtime);

	}

}


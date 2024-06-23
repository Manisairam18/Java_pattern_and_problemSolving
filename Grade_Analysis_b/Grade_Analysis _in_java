import java.util.Scanner;

public class GradeComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] aliceGrades = new int[3];
        System.out.println("Enter the top 3 grade points for Alice:");
        for (int i = 0; i < 3; i++) {
            aliceGrades[i] = scanner.nextInt();
        }
        
        int[] bobGrades = new int[3];
        System.out.println("Enter the top 3 grade points for Bob:");
        for (int i = 0; i < 3; i++) {
            bobGrades[i] = scanner.nextInt();
        }
        
        int alicePoints = 0;
        int bobPoints = 0;
        
        for (int i = 0; i < 3; i++) {
            if (aliceGrades[i] > bobGrades[i]) {
                alicePoints++;
            } else if (aliceGrades[i] < bobGrades[i]) {
                bobPoints++;
            }
        }
        
        System.out.println("Alice points: " + alicePoints + " Bob points: " + bobPoints);
    }
}



import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number :");
    int num=1;
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
        num=num*i;
    }
    System.out.println("The Factorial values are: "+ num);
        
    }
}

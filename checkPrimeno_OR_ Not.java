import java.util.Scanner;
public class primenum {
    
    public static boolean prime(int num){
        if(num<=1){
            return false;
        }
        for(int i =2; i<=Math.sqrt(num);i++){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter any value to check primenumber or not: ");
     int n = sc.nextInt();
     if(prime(n)){
         System.out.println(n+" It's a primenumber.");
     }else{
         System.out.println(n+" It's not a primenumber");
     }
     
    }
}

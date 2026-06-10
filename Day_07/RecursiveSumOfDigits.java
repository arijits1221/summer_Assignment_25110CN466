import java.util.Scanner;

public class RecursiveSumOfDigits {
    public static int sum(int n){
       if(n==0){
        return 0;
       }
       else
        return n%10 + sum(n/10);
    }

     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER ");
        int n = input.nextInt();
         System.out.print("SUM OF THE DIGITS OF GIVEN NUMBER: "+ sum(n));
    }
    
}

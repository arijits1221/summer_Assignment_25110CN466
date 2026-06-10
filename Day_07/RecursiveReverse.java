import java.util.Scanner;

public class RecursiveReverse {
      static int rev=0;
    public static int reverse(int n){
      
        if(n==0 )
            return rev;
        
            rev = n%10 +rev*10;
            return reverse(n/10);
    }
    
     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER ");
        int n = input.nextInt();
         System.out.print("REVERSE OF GIVEN NUMBER: "+ reverse(n));
    }
}


import java.util.Scanner;
public class Q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE BASE: ");
        int num = input.nextInt();
         System.out.print("ENTER THE EXPONENT: ");
        int exp = input.nextInt();
        int num1=num;
        for (int i = 1; i < exp; i++) {
            num= num*num1;
        }
        System.out.print(num1+"^"+exp+"="+num);


    }
    
}

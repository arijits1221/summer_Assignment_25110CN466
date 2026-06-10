import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class DecToBin{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER IN DECIMAL FORM ");
        int num = input.nextInt();
        String bin = "";
        while(1<=num){
            bin = (num%2) + bin;
            num = num/2;   
        }
          System.out.print("GIVEN NUMBER IN BINARY FORM = "+bin);
      
    }
}
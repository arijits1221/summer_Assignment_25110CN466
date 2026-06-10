import java.util.Scanner;
public class BinToDec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER IN BINARY FORM: ");
        int num = input.nextInt();
        int dec=0;
        int i = 0;
        int p;
        while(num>0){
            p=(int)Math.pow(2,i);
            dec= (num%10)*p + dec;
            num = num /10;
            i++;
        }
        System.out.print("GIVEN NUMBER IN DECIMAL FORM : " + dec);
    }
    
}

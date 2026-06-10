import java.util.Scanner;
public class bits {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER ");
        int num = input.nextInt();
        int count=0;
        while(num>0){
            count ++;
            num = num/2;
        }
        System.out.println("NUMBER OF BITS OF GIVEN NUMBER IS: "+ count);
    }
    
}

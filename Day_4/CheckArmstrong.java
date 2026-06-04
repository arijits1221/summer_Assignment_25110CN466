import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER : ");
        int num = input.nextInt();

            int num1 = num;
            int count = 0;
            while (num1 > 0) {
                num1 = num1/ 10;
                count++;
            }
            int temp = num;
            int arm = 0;
            while (temp > 0) {
                int c = temp % 10;
                arm += Math.pow(c, count);
                temp /= 10;
            }

            
            if (num == arm) {
                System.out.print(num + " IS AN ARMSTRONG NUMBER ");
            }
            else
                System.out.print("IT IS NOT AN ARMSTRONG NUMBER");
        }
    }



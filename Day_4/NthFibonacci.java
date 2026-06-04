import java.util.Scanner;
public class NthFibonacci {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER: ");
        int n = input.nextInt();
    System.out.println("Fibonacci Series upto " + n +"th term is ");
    int num1 = 0;
    int num2 = 1;
    int temp;
    for(int i = 0; i<n; i++){
        System.out.print( num1 +" " );
        temp = num1 + num2;
        num1 = num2;
        num2 = temp;
    }
}
}


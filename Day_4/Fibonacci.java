import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
    System.out.println("Fibonacci Series: ");
    int num1 = 0;
    int num2 = 1;
    int temp;
    for(int i = 0; i<=30; i++){
        System.out.print( num1 +" " );
        temp = num1 + num2;
        num1 = num2;
        num2 = temp;
    }
}
}
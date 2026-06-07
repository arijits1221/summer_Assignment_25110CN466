import java.util.Scanner;
public class RecursiveFibonacci {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY NUMBER ");
        int n = input.nextInt();
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
    }
}
}
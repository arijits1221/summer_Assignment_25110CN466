public class Armstrong {
    public static void main(String[] args) {
        System.out.println("ARMSTRONG NUMBERS: ");

        for (int i = 1; i <= 100000; i++) {
            int num1 = i;
            int count = 0;
            while (num1 > 0) {
                num1 = num1/ 10;
                count++;
            }
            int temp = i;
            int arm = 0;
            while (temp > 0) {
                int c = temp % 10;
                arm += Math.pow(c, count);
                temp /= 10;
            }

            
            if (i == arm) {
                System.out.print(i + " ");
            }
        }
    }
}
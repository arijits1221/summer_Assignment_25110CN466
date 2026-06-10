
public class CharacterPyramid {
    public static void main(String[] args){
         for (int i = 1; i <= 5; i++) {
            for (int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++; 
            }
            ch -= 2; 
            for (int j = 1; j < i; j++) {
                System.out.print(ch);
                ch--; 
            }
            System.out.println();
            }
           
        }
}

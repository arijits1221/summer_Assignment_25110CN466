import java.util.Scanner;

public class CharacterFequency {
      public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("ENTER THE STRING: ");
    String str = input.nextLine();

    

    for(int i =0;i<=str.length()-1;i++){
        int count = 0;
        for(int j =0;j<=str.length()-1;j++){
            if(str.charAt(i)==str.charAt(j)){
                count++;
            }
        }
        if(str.charAt(i)!=' ')
        System.out.println("FREQUENCY OF "+ str.charAt(i)+ " = "+ count);
        }
    }

    }

    


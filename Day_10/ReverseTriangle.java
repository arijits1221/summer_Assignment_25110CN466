public class ReverseTriangle {
    public static void main(String[] args){
        for(int i=9;i>=1;i-=2){
            for (int j = 1; j <=9-i; j++) {
                System.out.print(" ");
            }
                for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
              System.out.println("");  
            }
           
        }
    
}

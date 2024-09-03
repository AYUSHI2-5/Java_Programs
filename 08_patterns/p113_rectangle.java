
import java.util.Scanner;

public class p113_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
       for (int i = 0; i < n; i++) {
        for (int j= 0; j < 4; j++) {
            System.out.print("*");
            
        }
          System.out.println(" "); 
       }
    }
    
}

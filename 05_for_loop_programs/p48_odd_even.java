
import java.util.Scanner;



public class p48_odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit==");
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++){
            if(i%2==0){
                System.out.println("it is even==" +i);
            }
            else{
                System.out.println("it is odd==" +i);
            }

            
        }
    }
    
}

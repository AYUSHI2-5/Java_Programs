
import java.util.Scanner;



public class p68_odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limits==");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            if(i%2==0){
                System.out.println("it is even number="+i);
                i++;

            }
            else{
                System.out.println("it is odd number="+i);
                i++;
                
            }
        }
    }
    
}

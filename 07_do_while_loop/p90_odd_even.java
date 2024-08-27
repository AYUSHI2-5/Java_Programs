
import java.util.Scanner;



public class p90_odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limits==");
        int n=sc.nextInt();
        int i=1;
        do { 
            if(i%2==0){
                System.out.println("it is even number="+i);
                i++;

            }
            else{
                System.out.println("it is odd number="+i);
                i++;
                
            }
            
        } while (i<=n);
        
    }
    
}
    


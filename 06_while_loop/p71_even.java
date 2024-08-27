
import java.util.Scanner;



public class p71_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
           if(i%2==0){
            System.out.println(+i);
           
           }
           i++;
        }
    }
    
}

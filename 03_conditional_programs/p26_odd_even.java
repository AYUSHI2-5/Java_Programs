
import java.util.Scanner;

public class p26_odd_even {
    public static void main(String[] args) {
        System.out.println("ODD OR EVEN");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER HERE");
        int n0=sc.nextInt();
        if(n0%2==0){
            System.out.println("IT IS EVEN NUMBER");
        }
        else{
            System.out.println("IT IS ODD NUMBER");
        }
    }
    
}

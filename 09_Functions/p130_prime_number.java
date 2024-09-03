
import java.util.Scanner;

public class p130_prime_number {
    public static void printPrimeNumber(int a){
        int c=0;
        for(int i=2;i<=a;i++){
            if(a%i==0){
                c=1;
                break;
            }
            if(c==0){
                System.out.println("it is prime number");
                return;
            }
            else{
              
                return;
            }
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        printPrimeNumber(a);
        

    }
    
}

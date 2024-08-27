
import java.util.Scanner;

public class p28_odd_even_neutral {
    public static void main(String[] args){
    System.out.println("ODD EVEN OR NEUTRAL");
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter any number==");
     int a=sc.nextInt();
     if(a%2==0){
        System.out.println("number is even");
     }
     else if(a%2!=0){
        System.out.println("number is odd");
     }
     else{
        System.out.println("it is neutral number");
     }
     
    
    }    
}

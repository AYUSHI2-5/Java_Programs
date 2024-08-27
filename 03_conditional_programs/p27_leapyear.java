import java.util.Scanner;

public class p27_leapyear {
    public static void main(String[] args) {
        System.out.println("LEAP YEAR");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ANY YEAR HERE");
        int year=sc.nextInt();
        if(year%4==0){
            System.out.println("it is leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }
        
    }
    
}

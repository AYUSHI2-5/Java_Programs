
import java.util.Scanner;

public class p30_months {
    public static void main(String[] args) {
        System.out.println("months calling");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number from 1 to 12==");
        int a=sc.nextInt();
        if(a==1){
            System.out.println("jan");
        }
        else if(a==2){
            System.out.println("feb");
        }
        else if(a==3){
            System.out.println("march");
        }
        else if(a==4){
            System.out.println("april");
        }
        else if(a==5){
            System.out.println("may");
        }
        else if(a==6){
            System.out.println("june");
        }
        else if(a==7){
            System.out.println("july");
        }
        else if(a==8){
            System.out.println("august");
        }
        else if(a==9){
            System.out.println("sept");
        }
        else if(a==10){
            System.out.println("oct");
        }
        else if(a==11){
            System.out.println("nov");
        }
        else if(a==12){
            System.out.println("dec");
        }
        else {
            System.out.println("in valid number");
        }

    }
    
}


import java.util.Scanner;

public class p31_weeks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number form 1 to 7==");
        int a=sc.nextInt();
        if(a==1){
            System.out.println("mon");
        }
         else if(a==2){
            System.out.println("tue");
        }
         else if(a==3){
            System.out.println("wed");
        }
         else if(a==4){
            System.out.println("thur");
        }
         else if(a==5){
            System.out.println("fri");
        }
         else if(a==6){
            System.out.println("sat");
        }
         else if(a==7){
            System.out.println("sun");
        }
        else{
            System.out.println("in valid number");
        }
    }
    
}

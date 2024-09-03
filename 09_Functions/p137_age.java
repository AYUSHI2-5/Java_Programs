
import java.util.Scanner;

public class p137_age {
    public static void printAge(){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>18){
            System.out.println("eligible for vote");
        }
        else{
            System.out.println("not eligible for vote");

        }
        return;
    }
    public static void main(String[] args) {
        printAge();
        
    }
    
}

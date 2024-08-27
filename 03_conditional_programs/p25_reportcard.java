
import java.util.Scanner;

public class p25_reportcard {
 public static void main(String[] args) {
     System.out.println("HERE ARE YOUR MARKS");
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter english marks");
    int eng=sc.nextInt();
    System.out.println("ENTER MATHS MARKS");
    int maths=sc.nextInt();
    System.out.println("ENTER SCIENCE MARKS");
    int sci=sc.nextInt();
    int total=eng+maths+sci;
    System.out.println(total);
    if(total<100){
        System.out.println("work hard");
    }
    else{
        System.out.println("i will buy u a ps");
    }


 }    
}

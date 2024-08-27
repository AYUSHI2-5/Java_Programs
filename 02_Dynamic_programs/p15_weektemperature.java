
import java.util.Scanner;

public class p15_weektemperature{
    public static void main(String[] args) {
        System.out.println("ENTER WEEK'S TEMPERATURE" );
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TEMPERATURE OF MONDAY");
        int mon=sc.nextInt();
        System.out.println("ENTER TEMPERATURE OF TUESDAY");
        int tue=sc.nextInt();
        System.out.println("ENTER TEMPERATURE OF WEDNESDAY");
        int wed=sc.nextInt();
        System.out.println("ENTER TEMPERATURE OF THURSDAY");
        int thur=sc.nextInt();
        System.out.println("ENTER TEMPERATURE OF FRIDAY");
        int fri=sc.nextInt();
        System.err.println("ENTER TEMPERATURE OF SATURDAY");
        int sat=sc.nextInt();
        int total=mon+tue+wed+thur+fri+sat;
        int avg=((mon+tue+wed+thur+fri+sat)/6);
        System.out.println(total);
        System.out.println(avg);


        
    }
}

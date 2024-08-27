
import java.util.Scanner;

public class p84_fractional_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr your limit");
        int n=sc.nextInt();
        int i=1;
        float s=0;
        while(i<=n){
            System.out.print("1/"+i+"+");
            i++;
            s+=i;
        }
        System.out.println("");
        System.out.println("sum of fractions=" +s);
    }
    
}

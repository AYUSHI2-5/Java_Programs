
import java.util.Scanner;

public class p134_sum_odd {
    public static void printOddSum(int a){
       
        int sum=0;
        int c=0;
        for (int i = 1; i <=a; i++) {
            if(i%2==0){
               
            }
            else{ 
                System.out.println(+i);
                sum+=i;
                c++;

            }
           
            
        }
        System.out.println("sum of odd numbers=" +sum);
        System.out.println("count of odd numbers=" +c);
    

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        printOddSum(a);
        
        
    }
    
}

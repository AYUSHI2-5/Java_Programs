
import java.util.Scanner;

public class p61_odd_even_square_cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit==");
        int n=sc.nextInt();
        int s=0;
        int c=0;
        int s1=0;
        int c1=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(+i*i);
                s+=i;
                c++;
            }
            else{
                System.out.println(+i*i*i);
                s1+=i;
                c1++;
            }
        }
        System.out.println();
        System.out.println("sum of even num==" +s);
        System.out.println("sum of odd num==" +s1);
        System.out.println("count of even num==" +c);
        System.out.println("count of odd num==" +c1);
        

    }
    
}

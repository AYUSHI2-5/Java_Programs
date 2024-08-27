import java.util.Scanner;

public class p52_divisble_7_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit==");
        int n=sc.nextInt();
        int sum=0;
        int count=0;
       
        for(int i=1;i<=n;i++){
           
            
            if(i%7==0){
                System.out.println(+i);
                sum+=i;
                count++;
               
            }
          
        }
        System.out.println("sum==" +sum);
        System.out.println("count==" +count);
       
    }
    
    
}

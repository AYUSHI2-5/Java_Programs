import java.util.Scanner;

public class p102_divisible_7 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit=");
        int n=sc.nextInt();
        int i=1;
       do{
          if(i%7==0){
            System.out.println(+i);
           
          }
          
          i++;
        } while(i<=n);
        
    
}
}

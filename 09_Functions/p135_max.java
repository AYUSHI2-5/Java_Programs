import java.util.Scanner;

public class p135_max {
    public static void printMax(int a,int b) {
        
            if(a>b){
                System.out.println("a is greater than b");
    
            }
            else{
                System.out.println("b is greter than a");
                return ;
            }
        }  
                   
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        printMax(a,b);
        
    }
    
}

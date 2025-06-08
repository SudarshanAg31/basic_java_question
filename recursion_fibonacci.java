
import java.util.Scanner;

public class recursion_fibonacci {
    public static int fibonacci(int x) {
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        int a=fibonacci(x-1);
        int b=fibonacci(x-2); 
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int ans=fibonacci(x);
        System.out.println(ans);
    }
} 

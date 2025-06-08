
import java.util.Scanner;

public class recursion_factorial {
    public static int factorial(int x) {//5,4,3,2,1
        if(x==1){
            return x;
        }
        int y=factorial(x-1);
        int ans=x*y;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int ans=factorial(x);
        System.out.println(ans);
    }
}

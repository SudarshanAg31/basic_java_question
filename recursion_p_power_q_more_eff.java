
import java.util.Scanner;
public class recursion_p_power_q_more_eff{
    static int printn(int n ,int m) {//2 1 0
       if(m==0){
        return 1;
       }
       int x=printn(n, m/2)*n;
       if(m%2==0){
       return x*x;
       }
    return x*x*n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans=printn(x,y);
        System.out.println(ans);
    }
}
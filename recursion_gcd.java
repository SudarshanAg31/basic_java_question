
import java.util.Scanner;

public class recursion_gcd {
    public static int printn(int x,int y) {
    if(y==0)return x;
    return printn(y, x%y);        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans=printn(x,y);
        System.out.println(ans);
    }
}

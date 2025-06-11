
import java.util.Scanner;
public class recursion_factors {
    public static void printn(int x,int y) {
        if(y==1){
            System.out.println(x);
            return;
        }
        printn(x, y-1);
        System.out.println(x*y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        printn(x,y);
    }
}

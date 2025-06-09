
import java.util.Scanner;

public class recursion_count_digit {
    static int countdigit(int x){
        if(x<10){
            return 1;
        }
        int y=countdigit(x/10);
        int ans=y+1;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=countdigit(x);
        System.out.println(y);
    }
}

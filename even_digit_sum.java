
import java.util.Scanner;

public class even_digit_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0;
        while(x!=0){
            int y=x%10;
            if(y%2==0){
                sum+=y;
            }
            x=x/10;
        }
        System.out.println(sum);
    }
}

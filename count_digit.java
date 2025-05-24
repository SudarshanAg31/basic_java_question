
import java.util.Scanner;

public class count_digit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int flag=1;
        while(x>=10){
            int y=x/10;
            flag++;
            x=y;
        }
        System.out.println(flag);
    }
}
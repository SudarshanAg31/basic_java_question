
import java.util.Scanner;

public class _pattern_hollow_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x+2;j++){
                if(i==1||j==1||i==x||j==x+2){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println("");
        }
    }
}

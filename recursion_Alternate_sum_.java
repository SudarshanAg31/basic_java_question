import java.util.Scanner;

public class recursion_Alternate_sum_ {
    public static int printn(int x) {
        if(x==0){
            return 0;
        }
        int y=printn(x-1);
        if(x%2==0){
            return y-x; 
        }
        return y+x;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int v=printn(x);
        System.out.println(v);
    }
}


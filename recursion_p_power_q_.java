
import java.util.Scanner;

public class recursion_p_power_q_ {
    static int power(int x,int y){//5,5 ,4 ,3 ,2 
        if (y==0){
            return 1;
        }
        int z=power(x, y-1)*x;//4,3,2,1
        return z;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=power(x,y);
        System.out.println(z);
    }
}

import java.util.Scanner;

public class recursion_natural_number {
    public static void printIC(int n) {//n=3,2,1
        if(n==1){// false flase true
            System.out.println(1);//print(1)
            return;//it return 
            //due to its return when n=1 so the function is finish
            //but the remaning function of n=2,3 is left...
        }
        printIC(n-1);//2 1
        System.out.println(n);//2,3
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();//3
        printIC(x);//3
        //so over all function 1,2,3 is print 
    }
}

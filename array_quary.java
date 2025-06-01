import java.util.Scanner;
public class array_quary {
    public static int[] frqarr(int[] arr) { 
        int[] freq=new int[100001];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]=freq[arr[i]]+1;
        }
        return freq;
       }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
        int[] arr={2,3,4,5,4,3,2,7};
        int q=5;
        int[] freq=frqarr(arr);
        while(q>0){
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            q--;
        }
    }
}

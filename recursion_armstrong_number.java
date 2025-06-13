class recursion_armstrong_number{
public static int printn(int x,int y) {
    //base case
    if(x<10) { 
        return (int)Math.pow(x,y);
    }
    //sub problem 
    int z=printn(x/10,y);
    //answer  
    int ans=z+(int)Math.pow((x%10),y);
    return ans;    
}
public static int printc(int x) {
    if(x<10){
        return 1;
    }
    int y=printc(x/10);
    int ans=y+1;
    return ans;
}
    public static void main(String[] args) {
        int x=555; 
        int count=printc(x);
        int ans=printn(x,count);
        System.out.println(ans);
    }
}
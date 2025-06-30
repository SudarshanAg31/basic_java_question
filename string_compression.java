public class string_compression {
    public static void main(String[] args) {
        String str="aaabbcccdde";
        String ans=""+str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                ans+=count;
                count=1;
                ans+=str.charAt(i);
            }
        }
        ans+=count;
        System.out.println(ans);
    }
}

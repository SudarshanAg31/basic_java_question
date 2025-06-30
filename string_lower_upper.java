public class string_lower_upper {
    public static void main(String[] args) {
        String str="PhysICS";
        String ans="";
        System.out.println();
        for(int i=0;i<str.length();i++){
            int x=(int)str.charAt(i);
            if(x>64&&x<91){
              ans+=(char)(x+32);  
            }
            else if (x==32) {
                ans+=(char)(x);
            }
            else{
                ans+=(char)(x-32);
            }
        }
        System.out.println(ans);
    }
}

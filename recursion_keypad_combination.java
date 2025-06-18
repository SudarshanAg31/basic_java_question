public class recursion_keypad_combination {
    public static void com(String digit,String[] km,String res) {
        if(digit.length()==0){
            System.out.print(res+" ");
            return;
        }
        int curr=digit.charAt(0)-'0';
        String currnum=km[curr];
        for(int i=0;i<currnum.length();i++){
            com(digit.substring(1), km, res+currnum.charAt(i));
        }
    }
    public static void main(String[] args) {
        String digit="23";
        String[] km={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        com(digit,km,"");
    }
}

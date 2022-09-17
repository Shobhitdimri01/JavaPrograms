package Arrays;

public class Removing_Alphabet {
    public static void main(String[] args) {
        char ch='l';
        String ans = ReplaceStr("Chlole",ch);
        System.out.println(ans);
    }
    public static String ReplaceStr(String OldString, char newChar) {
        int n= OldString.length();
        String store="";
        for (int i=0;i<n;i++){
            if (OldString.charAt(i)!=newChar){
                store=store+OldString.charAt(i);
            }
        }
        return store;
    }
}

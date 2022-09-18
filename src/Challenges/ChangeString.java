package Challenges;

public class ChangeString {
    private static String originalString="abcabca";
    public static void main(String[] args) {
        int NumOfStringRemoved=1;
        TimeTakenToGetBackToOriginalString(NumOfStringRemoved,originalString);
    }
    public static boolean TimeTakenToGetBackToOriginalString(int NumOfStringRemoved,String originalString){
        String newStr = originalString;
        int counter=0;
        while(true) {
            for (int i = 0; i < originalString.length(); i++) {
                int newlength = originalString.length() - NumOfStringRemoved;
                String b = originalString.substring(newlength);
                originalString = originalString.substring(0, newlength);
                System.out.println("Original String = " + originalString);
                originalString = b.concat(originalString);
                counter++;
                System.out.println(originalString+" = "+newStr);
                if (originalString.equals(newStr)) {
                    System.out.println("================================================================");
                    System.out.println("Time taken to return into original String = " + counter);
                    System.out.println("================================================================");
                    return true;
                }

            }
        }
    }
}

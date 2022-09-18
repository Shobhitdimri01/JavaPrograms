package Challenges;

public class ChangeString {
    public static void main(String[] args) {
        String originalString="abcabc";
        int input1=2;
        TimeTakenToGetBackToOriginalString(input1,originalString);
    }
    public static void TimeTakenToGetBackToOriginalString(int input1,String originalString){
        String newStr = originalString;
        int counter=0;
        boolean result=false;
        while(result!=true) {
            for (int i = 0; i < originalString.length(); i++) {
                int newlength = originalString.length() - input1;
                String b = originalString.substring(newlength);
                originalString = originalString.substring(0, newlength);
                System.out.println("Original String = " + originalString);
                originalString = b.concat(originalString);
                counter++;
                System.out.println(originalString+" = "+newStr);
                if (originalString.equals(newStr)) {
                    result = true;
                    System.out.println("Counter = " + counter);
                    return;
                }

            }
        }
    }
}

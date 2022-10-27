package Substring;

public class Substring {
    public static String getSmall&LargestSubstring(String s,int k){
        String smallest = "";
        String largest = "";
        smallest = s.substring(beginIndex:0,k);

        for(int i=0;i<=s.length()-k;i++) {
            if(s.substring(i,i+k).compareTo(smallest)<=0)
                smallest = s.substring(i,i+k);
            if(s.substring(i,i+k).compareTo(largest)>=0)
                largest = s.substring(i,i+k);
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(s:"Enter the word:");
        String s = sc.next();
        System.out.println("Enter length of substring : ");
        int k = sc.nextInt();
        System.out.println(getSmall&LargestSubstring(s,k));
    }
}

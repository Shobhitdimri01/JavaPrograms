package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {
    // write code here
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        System.out.println("Arrays = "+Arrays.toString(a));
        reverse(a);
        System.out.println("Reversed Array = "+Arrays.toString(a));
    }
    private static void reverse(int [] a){
        int maxindex = a.length - 1;
        int halflength = a.length/2;
        for (int i=0;i<halflength;i++) {
            int temp = a[i];
            a[i] = a[maxindex - i];
            a[maxindex - i] = temp;
        }
    }
}
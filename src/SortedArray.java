import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }
    public static int[] getIntegers(int num){
        int [] values = new int[num];
        for(int i=0;i<values.length;i++){
            values[i] = scan.nextInt();
        }
        return values;
    }

    public static int [] sortIntegers(int []values){
        int [] arr = new int[values.length];
        for (int i=0;i<values.length;i++){
                arr[i] = values[i];
        }
        boolean flag =true;
        int temp;

        while(flag){
            flag = false;

            for (int i=0;i<arr.length-1;i++){
                if (arr[i]<arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr [i+1];
                    arr [i+1] = temp;
                    flag = true;
                }
            }

        }
        return arr;
    }

    public static void printArray(int [] arr){
            for (int i=0;i<arr.length;i++){
                System.out.println("Element "+i+" contents "+arr[i]);
            }
    }
}

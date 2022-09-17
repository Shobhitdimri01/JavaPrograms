package Arrays;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int a = readInteger();
        int [] arr = readElements(a);
        System.out.println("Min Length is "+findMin(arr));


    }
    public static int readInteger(){

        System.out.println("Enter the no. of elements : ");
        int sc = scan.nextInt();
        System.out.println("Total Elements are:"+sc);

        return sc;
    }

    public static int[] readElements(int a){
        int [] values = new int[a];
        System.out.println(values.length);

        for (int i=0;i<values.length;i++){
            values[i]=scan.nextInt();
        }
        return values;
    }

    public static int findMin(int [] arr){
        int min = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

}

package Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int []a = new int[5];
        for (int i =0; i<a.length;i++){
            a[i]=i*10;
        }
        myArray(a);
    }
    public static void myArray(int [] arr){
        int counter = 0;
        for (int i:arr) {
            System.out.println("Elements ["+counter+"] is -> "+i);
            counter++;
        }
    }
}

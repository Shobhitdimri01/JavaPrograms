package AutoBoxing;

import java.util.ArrayList;

public class autoboxing {
    public static void main(String[] args) {
        ArrayList<String>myStr = new ArrayList<String>();
        myStr.add("Rahul");
        myStr.add("Ramesh");



        System.out.println(myStr.get(1));
        ArrayList<Integer>myInt = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            myInt.add(Integer.valueOf(i+1));//AutoBoxing
        }
        for(int i=0;i<10;i++){
            System.out.println(i+1+")."+myInt.get(i).intValue());//Unboxing
        }
        Integer myintV = 56;//Compiler fixes this as --> Integer.valueOf(56);
        int myint = myintV.intValue();
    }
}

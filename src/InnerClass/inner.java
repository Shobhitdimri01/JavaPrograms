package InnerClass;

class Outer {
    int x = 10;
    class Inner {
        public void InnerDisplay() {
            System.out.println("Inner class value of x is " + x);
        }
    }
    public void OuterDisplay() {
        System.out.println("outer called ()");
        Inner i = new Inner();
        i.InnerDisplay();
    }

}
class Main{
    public static void main(String[] args) {
        Outer o =new Outer();
        o.OuterDisplay();
        //Directly accessing the inner class from main method
        Outer.Inner oi = new Outer().new Inner();
        oi.InnerDisplay();

    }
}
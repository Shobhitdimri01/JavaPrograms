package Abstract;

//if a class is having even a single method as abstract
//the class must be declared as abstract
abstract class Super{
    public Super(){
        System.out.println("Calling constructor");
    }

    public void method1(){
        System.out.println("method1() -->  Called");
    }
    abstract void method2(); // abstract method
}

//Inheritance

class Sub extends Super{
    @Override
    void method2() {
        System.out.println("abstract method2() --> Called ");
    }
}

public class Abstract {
public static void main(String[]args){
    //We can create reference of abstract classes ,but we can't initialize their object
        Super s;
        Sub obj = new Sub();
        obj.method1();
        obj.method2();

        s = new Sub();
        s.method1();
        s.method2();
        }
}

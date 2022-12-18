package AnonymousClass;

abstract class My{
   abstract void Hello();
}

interface Print{
    void print();
}

class Outer{
    public void Display(){
        My m = new My() {
            @Override
            void Hello() {
                System.out.println("Anonymous class called through abstract class");
            }
        };
        m.Hello();

        Print p = new Print() {
            @Override
            public void print() {
                System.out.println("Anonymous class called through interface");
            }
        };
        p.print();
    }
}

class Main{
    public static void main(String[] args) {
        Outer o =new Outer();
        o.Display();
    }
}
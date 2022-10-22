package Abstract;


abstract class Shape{

    abstract void area();
    abstract void perimeter();
}

class Circle extends Shape{

    int radius;
    @Override
    void perimeter() {
        System.out.println(2*Math.PI*(radius^2));
    }

    @Override
    public void area(){
        System.out.println((Math.PI)*(radius^2));
    }
}

class Rectangle extends Shape{

    int length ;
    int breadth ;

    @Override
    void perimeter() {
        System.out.println(2*(length+breadth));
    }

    @Override
    void area() {
        System.out.println(length*breadth);
    }
}

public class Shapes{
    public static void main(String[] args) {

        Circle C = new Circle();
        C.radius = 3;
        System.out.println("Circle perimeter is : ");
        C.perimeter();
        System.out.println("Circle area is : ");
        C.area();

        Rectangle R = new Rectangle();
        R.length = 10; R.breadth =4;
        System.out.println("Rectangle perimeter is : ");
        R.perimeter();

        System.out.println("Rectangle area is : ");
        R.area();
    }
}
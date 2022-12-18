package StaticClass;
class Outer{
    static  int x = 10;
    int y=20;
    static class Inner{
        public void display(){
            System.out.println(x);
            System.out.println("Can't display y because it is not static");
        }
    }
}

class Main{
    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner();//directly calling inner class because it is static
        i.display();
    }
}
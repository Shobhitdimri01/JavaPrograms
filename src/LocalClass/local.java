package LocalClass;

class Local{
    public void Display(){
        String H = "Hello";
        class LocalInner{
            void InnerDisplay(){
                System.out.println(H);
            }
        }
        LocalInner l =new LocalInner();
        l.InnerDisplay();
    }
}

class Main{
    public static void main(String[] args) {
        Local l = new Local();
        l.Display();
    }
}
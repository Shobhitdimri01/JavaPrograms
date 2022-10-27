package MultipleInheritance;

public class Main {
    public static void main(String[] args) {


        Dog doggy = new Dog();
        doggy.livesInland();

        Frog frog = new Frog();
        frog.livesInWater();
        frog.livesInland();

    }
}

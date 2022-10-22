package MultipleInheritance;

public class Frog implements Aquatic,Terrestrial{

    @Override
    public void livesInland() {
        System.out.println("Frog lives in land");
    }

    @Override
    public void livesInWater() {
        System.out.println("Frog lives in water");
    }
}

package Interface1;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveAble{
    private String Name;
    private int Hit_points;
    private int Strength;

    public Monster(String name, int hit_points, int strength) {
        Name = name;
        Hit_points = hit_points;
        Strength = strength;
    }

    public String getName() {
        return Name;
    }

    public int getHit_points() {
        return Hit_points;
    }

    public int getStrength() {
        return Strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "Name='" + Name + '\'' +
                ", Hit_points=" + Hit_points +
                ", Strength=" + Strength +
                '}';
    }

    @Override
    public List<String> Write() {
        ArrayList<String>Values = new ArrayList<String>();
        Values.add(0,this.Name);
        Values.add(1,""+this.Hit_points);
        Values.add(2,""+this.Strength);
        return Values;
    }
    @Override
    public void read(List<String> saveValues) {
        if(saveValues!=null && saveValues.size()>0){
            this.Name = saveValues.get(0);
            this.Hit_points = Integer.parseInt(saveValues.get(1));
            this.Strength = Integer.parseInt(saveValues.get(2));
        }
    }
}

package Interface1;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveAble{
    private String name;
    private int point;
    private int strength;
    private String weapon;

    public Player(String name, int point, int strength, String weapon) {
        this.name = name;
        this.point = point;
        this.strength = strength;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", point=" + point +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> Write() {
        List<String> values = new ArrayList<String>();
        values.add(0,this.name);
        values.add(1,this.weapon);
        values.add(2,""+this.strength);
        values.add(3,""+this.point);
        return values;
    }

    @Override
    public void read(List<String>saveValues) {

        if (saveValues!=null && saveValues.size()>0){
            this.name = saveValues.get(0);
            this.point = Integer.parseInt(saveValues.get(3));
            this.weapon = saveValues.get(1);
            this.strength = Integer.parseInt(saveValues.get(2));

        }

    }

}

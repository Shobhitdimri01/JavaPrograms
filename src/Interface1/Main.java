package Interface1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Player Sam = new Player("Sam",10,300,"Sword");
        System.out.println(Sam.toString());
        SavedObject(Sam);

        Sam.setPoint(12);
        System.out.println(Sam);
        Sam.setWeapon("Gun");
        SavedObject(Sam);
        LoadObject(Sam);
        System.out.println(Sam);

        //Monster
       /* ISaveAble Werewolf = new Monster("Brad",100,200);
        System.out.println(Werewolf);
        //Kind of Multiple Inheritance
        System.out.println("Strength = "+((Monster)Werewolf).getStrength());*/
        Monster Werewolf = new Monster("Brad",100,200);
        System.out.println("Strength = "+Werewolf.getStrength());
        SavedObject(Werewolf);

    }




    public static List<String> readValues(){
        List<String>Value = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n"+
                "1 to enter String\n"+
                "0 to Quit");

        while(!quit){
            System.out.println("Choose the option : ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    System.out.println("Quit");
                    break;
                case 1:
                    System.out.println("Enter a string : ");
                    String stringInput = scan.nextLine();
                    Value.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return Value;
    }

    public static void SavedObject(ISaveAble ObjectToSave){
            for (int i=0;i<ObjectToSave.Write().size();i++){
                System.out.println("Saving "+ObjectToSave.Write().get(i)+" to storage device. ");
            }
    }

    public static void LoadObject(ISaveAble ObjectToLoad){
         List<String>Values = readValues();
         ObjectToLoad.read(Values);
    }
}
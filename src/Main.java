import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static Arraylist groceryList = new Arraylist();
    public static void main(String[] args) {
        boolean quit= false;
        int choice = 0;
        printInstruction();
        while(!quit){
            System.out.println("Enter your Choice : ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit=true;
                    break;

            }
        }

    }

    public static void printInstruction(){
        System.out.println("\nPress : ");
        System.out.println("\t 0 - <-------To print the available option--------->");
        System.out.println("\t 1 - <-------To print item present in grocery list--------->");
        System.out.println("\t 2 - <-------To add item in grocery list--------->");
        System.out.println("\t 3 - <-------To modify item in grocery list--------->");
        System.out.println("\t 4 - <-------To remove specific item in grocery list--------->");
        System.out.println("\t 5 - <-------To Search for specific item in grocery list--------->");
        System.out.println("\t 6 - !!!!!------------To Quit the console-----------!!!!!");

    }

    public static void addItem(){
        System.out.println("Please enter the item in Grocery list : ");
        groceryList.addGroceryList(input.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter Current Item Name : ");
        String ItemPrevName = input.nextLine();
        System.out.println("Enter the New Item Name : ");
        String ItemName = input.nextLine();
        groceryList.modifyItem(ItemPrevName,ItemName);

    }

    public static void removeItem(){
        System.out.println("Enter the name of the item to be removed ");
        String ItemName = input.nextLine();
        input.nextLine();
        groceryList.removeItem(ItemName);
    }

    public static void searchForItem() {
        System.out.println("Enter the name of item to be searched");
        String ItemName = input.nextLine();
        if (groceryList.OnFile(ItemName))
            System.out.println(ItemName + " has been found in the grocery list.");
        else
            System.out.println("Search Item not found in groceryList");
    }
}
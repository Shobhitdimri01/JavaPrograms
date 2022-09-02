import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

import static java.util.logging.Logger.global;

public class Main {
     //***********Grocery List function (Code present on ArrayList)**************//
        private static Scanner input = new Scanner(System.in);
 /*   private static Arraylist groceryList = new Arraylist();
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
    }*/

    //**************Mobile Functionality (Code present on Contacts,MobilePhone)****************//
        private static MobilePhone mobilePhone =new MobilePhone("003-442-452");
        private static boolean quit = false;
        public static void main(String[] args) {

        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter Action: (6 to show available action)");
            int action = input.nextInt();
            input.nextLine();
            switch (action){
                case 0:
                    System.out.println("\n Shutting down ..........!!");
                    break;
                case 1:
                    PrintContacts();
                    break;
                case 2:
                    AddNewContact();
                    break;
                case 3:
                    UpdateExistingContact();
                    break;
                case 4:
                    RemovingContact();
                    break;
                case 5:
                    QueryContact();
                    break;
                case 6:
                    printActions();
                    break;
                case 7:
                    Exit();
                    break;

            }
        }
    }

    private static void AddNewContact(){
        System.out.println("enter the contact name :");
        String name = input.nextLine();
        System.out.println("enter a valid phone no : ");
        String PhoneNo = input.nextLine();
        Contacts newContact = Contacts.CreateContacts(name,PhoneNo);
        if (mobilePhone.addNewContacts(newContact)){
            System.out.println("New Contact added with name = "+ name+" \n\t\tContactNo --> "+ PhoneNo);
        }else {
            System.out.println("Error -: Cannot add as name = "+name+" is already on database !!");
        }
    }


    private static void PrintContacts(){
            mobilePhone.printContacts();
    }
    private static void startPhone(){
        System.out.println("Starting phone .................");
    }

    private static void UpdateExistingContact(){
        System.out.println("Enter existing contact name: ");
        String name =input.nextLine();
        Contacts existingRecord = mobilePhone.queryContact(name);
        if (existingRecord.equals(null)){
            System.out.println("Contact not found!!");
            return;
        }



        System.out.println("Enter the Updated Record :- \nName:");
        String new_name = input.nextLine();
        System.out.printf("Contact: ");
        String new_number = input.nextLine();
        Contacts NewContact = new Contacts(new_name,new_number);
        if(mobilePhone.UpdateContact(existingRecord,NewContact)){
            System.out.println("========================================================");
            System.out.println("\t\t\tSuccessfully updated Contact");
            System.out.println("=========================================================");
        }else {
            System.out.println("Error Updating Record !!!");
        }
    }
    private static void QueryContact() {
        System.out.println("Enter existing contact name: ");
        String name = input.nextLine();
        Contacts existingRecord = mobilePhone.queryContact(name);
        if (existingRecord == null) {
            System.out.println("Contact not found!!");
            return;
        }
        System.out.println("++++++++++++++++++++++Found the Record :++++++++++++++++++++++++++++++++");
        System.out.printf("\t \nName: %s \nContact: %s",existingRecord.getName(),existingRecord.getPhoneno());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }

    private static void RemovingContact(){
        System.out.println("Enter existing contact name: ");
        String name =input.nextLine();
        Contacts existingRecord = mobilePhone.queryContact(name);
        if (existingRecord==null){
            System.out.println("Contact not found!!");
            return;
        }
         boolean Deleted = mobilePhone.removeContact(existingRecord);
        if (Deleted){
            System.out.println("**********************************************");
            System.out.println("\t\t\tSuccessfully Deleted");
            System.out.println("**********************************************");
        }else {
            System.out.println("Error in deleting contact!!!!");
        }
    }
    private static void printActions(){
        System.out.println("\nAvailable Actions :\npress");
        System.out.println("\t 0 - To Shutdown !!");
        System.out.println("\t 1 - <-------To print Contacts--------->");
        System.out.println("\t 2 - <-------To add a new Contact--------->");
        System.out.println("\t 3 - <-------To update a contact--------->");
        System.out.println("\t 4 - <-------To remove existing contact--------->");
        System.out.println("\t 5 - <-------Query if existing Contact exist--------->");
        System.out.println("\t 6 - <------------To print list of Available contacts---------->");
        System.out.println("\t 7 - <------------To exit Console---------->");
        System.out.println("Choose your action:");

    }
    public static void Exit(){
        System.out.println("Exiting Console...................................");
            quit = true;
    }

}
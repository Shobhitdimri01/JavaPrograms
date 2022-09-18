package Linked_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
//listIterator doesn't have current item
public class linkedlist {
    public static void main(String[] args) {
        //Initializing Linked List
        LinkedList<String> PlacesToVisit = new LinkedList<String>();
//        PlacesToVisit.add("Himachal");
//        PlacesToVisit.add("Sydney");
//        PlacesToVisit.add("USA");
//        PlacesToVisit.add("Dubai");
//        PlacesToVisit.add("SriLanka");
//        PlacesToVisit.add("Europe");
//        PlacesToVisit.add("Africa");
        System.out.println("Printing in Alphabetic order------(A to Z)");
        addInOrder("Mumbai", PlacesToVisit);
        addInOrder("Himachal", PlacesToVisit);
        addInOrder("USA", PlacesToVisit);
        addInOrder("SriLanka", PlacesToVisit);
        addInOrder("Dubai", PlacesToVisit);
        addInOrder("Sydney", PlacesToVisit);
        addInOrder("Canada", PlacesToVisit);
        addInOrder("Mumbai", PlacesToVisit);
        printList(PlacesToVisit);
        //Printing places by iterating over it
        printList(PlacesToVisit);

        //Console Menu
        visit(PlacesToVisit);

        //Adding at a particular index

        PlacesToVisit.add(2, "Mumbai");
        System.out.println("Place added is :" + PlacesToVisit.get(2));
        System.out.println("------------------------------------------------------------");

        printList(PlacesToVisit);

        //Removing an entry
        System.out.println("Element removed is :" + PlacesToVisit.remove(2));
        System.out.println("------------------------------------------------------------");
        PlacesToVisit.remove(2);
        printList(PlacesToVisit);

        //

    }

    private static void printList(LinkedList<String> places) {
        Iterator<String> Cursor = places.iterator();
        while (Cursor.hasNext()) {
            System.out.println("The places to visit are " + Cursor.next());
        }
        System.out.println("========================================================================");
    }

    private static boolean addInOrder(String newCity, LinkedList<String> OrderedList) {
        ListIterator<String> stringListIterator = OrderedList.listIterator();
        while (stringListIterator.hasNext()) {
            //returns 0 if matched ,<1 if Alphabets
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println("Error : " + newCity + "City Already exist!!");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        boolean quit = false;
        boolean goingforward = true;
        Scanner input = new Scanner(System.in);
        ListIterator<String> City = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("Error!! : No cities present");
            return;
        } else {
            System.out.println("Now Visiting cities are : " + City.next());
            printMenu();
        }
        while (!quit) {
            int action = input.nextInt();
            input.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday (Vacation) Over");
                    quit=true;
                    break;
                case 1:
                    if(!goingforward){
                        if(City.hasNext()) {
                            System.out.println("code11");
                            City.next();
                        }
                        goingforward = true;
                    }
                    if (City.hasNext())
                        System.out.println("Now Visiting ---> "+City.next());
                    else {
                        System.out.println("Reached the End of list!!");
                        goingforward = false;
                    }
                    break;
                case 2:
                    if(goingforward){
                        if(City.hasPrevious()) {
                            System.out.println("code22");
                            City.previous();
                        }
                        goingforward = false;
                    }
                    if(City.hasPrevious())
                        System.out.println("Now visiting ----> "+City.previous());
                    else {
                        System.out.println("We are at the start of list");
                        goingforward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    private static void printMenu(){
        System.out.println("Available Actions\nPress:");
        System.out.println("0 - To Quit Console");
        System.out.println("1- To Visit Next City");
        System.out.println("2- To Visit Previous City");
        System.out.println("3- To print Menu");
    }
}

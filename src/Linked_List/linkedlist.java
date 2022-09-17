package Linked_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {
    public static void main(String[] args) {
        //Initializing Linked List
        LinkedList<String>PlacesToVisit = new LinkedList<String>();
//        PlacesToVisit.add("Himachal");
//        PlacesToVisit.add("Sydney");
//        PlacesToVisit.add("USA");
//        PlacesToVisit.add("Dubai");
//        PlacesToVisit.add("SriLanka");
//        PlacesToVisit.add("Europe");
//        PlacesToVisit.add("Africa");
        System.out.println("Printing in Alphabetic order------(A to Z)");
        addInOrder("Mumbai",PlacesToVisit);
        addInOrder("Himachal",PlacesToVisit);
        addInOrder("USA",PlacesToVisit);
        addInOrder("SriLanka",PlacesToVisit);
        addInOrder("Dubai",PlacesToVisit);
        addInOrder("Sydney",PlacesToVisit);
        addInOrder("Canada",PlacesToVisit);
        printList(PlacesToVisit);
    //Printing places by iterating over it
        printList(PlacesToVisit);

    //Adding at a particular index

         PlacesToVisit.add(2,"Mumbai");
        System.out.println("Place added is :"+PlacesToVisit.get(2));
        System.out.println("------------------------------------------------------------");

        printList(PlacesToVisit);

    //Removing an entry
        System.out.println("Element removed is :"+PlacesToVisit.remove(2));
        System.out.println("------------------------------------------------------------");
        PlacesToVisit.remove(2);
        printList(PlacesToVisit);

    //

    }

    private static void printList(LinkedList<String> places){
        Iterator<String>Cursor = places.iterator();
        while(Cursor.hasNext()){
            System.out.println("The places to visit are "+Cursor.next());
        }
        System.out.println("========================================================================");
    }

    private static boolean addInOrder(String newCity,LinkedList<String>OrderedList){
        ListIterator<String>stringListIterator = OrderedList.listIterator();
        while(stringListIterator.hasNext()){
            //returns 0 if matched ,<1 if Alphabets
            int comparison =  stringListIterator.next().compareTo(newCity);
            if (comparison ==0){
                System.out.println("Error : "+newCity+"City Already exist!!");
            } else if (comparison>0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if (comparison<0){

            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}

package Arrays;

import java.util.*;

public class Arraylist {
    private ArrayList<String> GroceryList = new ArrayList<String>();

    public void addGroceryList(String items){
        GroceryList.add(items);
    }

    public void printGroceryList(){
        System.out.println("You have total of "+GroceryList.size()+" items in your grocery list");
        for (int i=0;i<GroceryList.size();i++){
            System.out.println((i+1)+" - "+GroceryList.get(i));
        }
    }

    public void modifyItem(String currentItem,String newItem){
        int position = FindItem(currentItem);
        if (position>=0)
            modifyItem(position,newItem);
    }
    private void modifyItem(int position,String name){
        GroceryList.set(position,name);
        System.out.println("Grocery item in list at number "+(position+1)+" has been modified.");
    }

    public void removeItem(String Item){
        int position = FindItem(Item);
        if (position>=0)
            removeItem(position);
    }
    private void removeItem(int position){
        String RemovedItem=GroceryList.get(position);
        GroceryList.remove(position);
        System.out.println("Your item at "+(position+1)+" position named: "+RemovedItem +" has been removed.");
    }

    private int FindItem(String SearchItem){
      //  boolean exists = GroceryList.contains(SearchItem);
        return GroceryList.indexOf(SearchItem);
    }

    public boolean OnFile(String SearchItem){
        int position = FindItem(SearchItem);
        if (position>=0)
            return true;
        else
            return false;
    }
}

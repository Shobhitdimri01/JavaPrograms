package Arrays;

import Arrays.Contacts;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts>myContacts;
    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addNewContacts(Contacts contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean removeContact(Contacts contact){
        int foundPosition = findContact(contact);
        if (foundPosition<0){
            System.out.println("Contact with "+contact.getName()+" was not found!");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName()+" was deleted from the record");
        return true;
    }

    public boolean UpdateContact(Contacts OldContact, Contacts NewContact){
        int foundPosition = findContact(OldContact);
        if (foundPosition<0){
            System.out.println("Contact with "+OldContact.getName()+" was not found!");
            return false;
        } else if ((findContact(NewContact.getName()) != -1)) {
            System.out.printf("Contact with Name: %s already exist\nUpdate Un-successful!!!!.",NewContact.getName());
            return false;
        }

        this.myContacts.set(foundPosition,NewContact);
        System.out.println("Old Contact with "+OldContact.getName()+" is replaced by New Contact "+ NewContact.getName()+" successfully");
        return true;

    }

    private int findContact(Contacts contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String ContactName){
        for(int i=0;i<this.myContacts.size();i++){
                Contacts contact = this.myContacts.get(i);
                if (contact.getName().equals(ContactName)){
                    return i;
                }
        }
        return -1;
    }


    public String queryContact(Contacts contact){
        if (findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name){
        int position = findContact(name);
        if (position >=0){
            return this.myContacts.get(position);
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List");
        for (int i=0;i<this.myContacts.size();i++){
            System.out.println((i+1)+"."+this.myContacts.get(i).getName() +"-->"+
                    this.myContacts.get(i).getPhoneno());
        }
    }

}
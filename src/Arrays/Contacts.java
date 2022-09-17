package Arrays;

public class Contacts {
    private String Name;
    private String PhoneNo;
    public Contacts(String Name,String PhoneNo){
        this.Name = Name;
        this.PhoneNo = PhoneNo;
    }


    public String getName() {
        return Name;
    }


    public String getPhoneno(){
        return PhoneNo;
    }

    public static Contacts CreateContacts(String Name,String PhoneNo){
        return new Contacts(Name,PhoneNo);
    }
}

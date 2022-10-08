package Interfaces;

public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }
    //All the methods should be implemented for Java class

    @Override
    public void powerON() {
        System.out.println("Turning ON Deskphone");
    }

    @Override
    public void dail(int phoneNumber) {
        System.out.println("Now ringing the phone"+phoneNumber+" on deskphone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering ringing number");
            isRinging = false;
        }else{
            System.out.println("Number not matched");
        }
    }

    @Override
    public boolean callPhone(int PhoneNumber) {
        if (PhoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ringing ringing");
        }else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}

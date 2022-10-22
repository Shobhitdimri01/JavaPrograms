package Interfaces;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isON=false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }
    //All the methods should be implemented for Java class

    @Override
    public void powerON() {
        isON = true;
        System.out.println("Turning ON MobilePhone");
    }

    @Override
    public void dail(int phoneNumber) {
        if (isON)
        System.out.println("Now ringing the phone"+phoneNumber+" on Mobile");
        else
            System.out.println("Phone Switched off");
    }

    @Override
    public void answer() {
        if(isRinging && isON ){
            System.out.println("Answering ringing number");
            isRinging = false;
        }else{
            System.out.println("Number not matched");
        }
    }

    @Override
    public boolean callPhone(int PhoneNumber) {
        if (PhoneNumber == myNumber && isON){
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

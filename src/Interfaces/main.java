package Interfaces;

public class main {
    public static void main(String[] args) {
        ITelephone SamPhone ;
        SamPhone = new DeskPhone(889695003);
        SamPhone.powerON();
        SamPhone.callPhone(889695007);
        SamPhone.answer();

        SamPhone = new MobilePhone(939302021);
        SamPhone.powerON();
    }
}

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double>transaction;

    public Customer(String name, double InitialAmount) {
        this.name = name;
        this.transaction = new ArrayList<Double>();
        this.AddTransaction(InitialAmount);
    }
    public void AddTransaction(double Amount){
        this.transaction.add(Amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
}

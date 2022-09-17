package Arrays;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer>customers;
    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName(){
        return name;
    }
    public ArrayList <Customer> getCustomers(){
        return customers;
    }

    public boolean newCustomer(String CustomerName, double initialAmount){
        if ((findCustomer(CustomerName))== null) {
            this.customers.add(new Customer(CustomerName, initialAmount));
          return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String CustomerName,double Amount){
        Customer existingCustomer = findCustomer(CustomerName);
        if (existingCustomer!=null){
            existingCustomer.addTransaction(Amount);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String customerName){
        for (int i=0;i< customers.size();i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }

}

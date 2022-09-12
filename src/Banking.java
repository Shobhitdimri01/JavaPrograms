import java.util.ArrayList;

public class Banking {
    private String BankName;
    private ArrayList<Branch>branches;

    public Banking(String BankName){
        this.BankName = BankName;
        this.branches = new ArrayList<Branch>();
    }
    public boolean addBranch(String branchName){
        if (findBranch(branchName)!=null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,String CustomerName,double InitialAmount){
        Branch branch = findBranch(branchName);
        if (branch!=null ){
            return branch.newCustomer(CustomerName,InitialAmount);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for (int i=0;i<branches.size();i++){
            Branch GetBranch = branches.get(i);
            if(branchName.equals(GetBranch.getBranchName())){
                return GetBranch;
            }
        }
        return null;
    }
    public boolean addCustomerTransaction(String branchName,String CustomerName,double amount){
        Branch branch = findBranch(branchName);
        if(branch!= null){
            return branch.addCustomerTransaction(CustomerName,amount);
        }
        return false;
    }

    public boolean listCustomers(String branchName,boolean showTransaction){
        Branch branch = findBranch(branchName);
        if (branch!=null){
            System.out.println("Customers details for branch : "+branch.getBranchName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0;i<branchCustomers.size();i++){
                Customer AllCustomer = branchCustomers.get(i);
                System.out.println("Customer - "+i+")"+AllCustomer);
                if(showTransaction){
                    System.out.println("\t\t<---------Transaction------>");
                    ArrayList<Double>Transaction = AllCustomer.getTransaction();
                    for (int j=0;j<Transaction.size();j++){
                        System.out.println("Transaction No."+(i+1)+"="+Transaction.get(j));
                    }
                }
            }
        }
    }

}

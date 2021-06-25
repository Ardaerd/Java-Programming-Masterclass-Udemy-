package Section_8_Arrays_InbuiltList_Autoboxing_Unboxing.Banking_Challenge;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransaction) {
        Branch branch = findBranch(nameOfBranch);

        if (branches.contains(branch)) {
            System.out.println("Customer details for branch " + branch.getName());

            for (Customer customer : branch.getCustomers()) {
                int customerPosition = branch.getCustomers().indexOf(customer)+1;
                System.out.println("Customer: " + customer.getName() + "[" + customerPosition + "]");

                if (printTransaction) {
                    System.out.println("Transactions");
                    for (double transaction : customer.getTransactions()) {
                        int position = customer.getTransactions().indexOf(transaction)+1;
                        System.out.println("[" + position + "] Amount " + transaction);
                    }
                }
            }
            return  true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction) {
        Branch branch = findBranch(nameOfBranch);

        if (branches.contains(branch)) {
            return branch.addCustomerTransaction(nameOfCustomer,transaction);
        }
        return false;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double transaction) {
        Branch branch = findBranch(nameOfBranch);

        if(branches.contains(branch)) {
            return branch.newCustomer(nameOfCustomer,transaction);
        } else {
            return false;
        }
    }

    public boolean addBranch(String nameOfBranch) {
        Branch branch = findBranch(nameOfBranch);

        if(!branches.contains(branch)) {
            branches.add(new Branch(nameOfBranch));
            return true;
        } else {
            return false;
        }
    }

    private Branch findBranch(String nameOfBranch) {
        for (Branch branch : branches) {
            if (branch.getName().equals(nameOfBranch)) {
                return branch;
            }
        }
        return null;
    }
}

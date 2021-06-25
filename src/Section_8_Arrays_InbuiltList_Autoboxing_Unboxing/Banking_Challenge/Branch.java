package Section_8_Arrays_InbuiltList_Autoboxing_Unboxing.Banking_Challenge;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction) {
        Customer customer = findCustomer(nameOfCustomer);
        if(customers.contains(customer)) {
            customer.addTransaction(transaction);
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer(String nameOfCustomer) {
        for(Customer customer : customers) {
            if(customer.getName().equals(nameOfCustomer)) {
                return customer;
            }
        }
        return null;
    }

    public boolean newCustomer(String nameOfCustomer, double initTransaction) {
        if(!customers.contains(findCustomer(nameOfCustomer))) {
            customers.add(new Customer(nameOfCustomer,initTransaction));
            return true;
        } else {
            System.out.println("Already exist");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}

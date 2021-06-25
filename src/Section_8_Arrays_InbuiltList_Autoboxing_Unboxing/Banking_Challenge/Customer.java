package Section_8_Arrays_InbuiltList_Autoboxing_Unboxing.Banking_Challenge;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initTransaction) {
        this.name = name;
        transactions = new ArrayList<Double>();
        addTransaction(initTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        transactions.add(transaction);
    }
}

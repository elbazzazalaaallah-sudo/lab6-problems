package problem2;

import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Customer> customers;

    public Bank(String name){
        this.name = name;
        customers = new ArrayList<>();
    }
    public void addNewCustomer(Customer c){
        if (customers.contains(c)){
            return;
        }else{
            customers.add(c);
        }
    }

    public void transactionToOther(Customer c1, Customer c2, Double d){
        if(!customers.contains(c2)){
            return;
        }else {
            c2.addTransaction(d);
            c1.addTransaction(-d);
        }
    }

    public void printStatement(){
        for (Customer cust : customers){
            System.out.println("Customer with name "+cust.getName()+" did "+cust.getTransactions().size() + " transactions");
        }
    }
}

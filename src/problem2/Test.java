package problem2;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args){
        Customer c1 = new Customer("Me");
        Customer c2 = new Customer("You");

        c1.addTransaction(200.0);
        c1.addTransaction(-50.0);

        c2.addTransaction(50.0);

        Bank b = new Bank("The Bank");
        b.addNewCustomer(c1);
        b.addNewCustomer(c2);

        b.printStatement();

        b.transactionToOther(c1,c2,50.0);

        b.printStatement();
    }
}

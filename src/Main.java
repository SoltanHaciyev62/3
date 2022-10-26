import Creditwork.MilitaryCredit;
import Customers.Customer;
import Customers.CustomerManager;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new Customer(),new MilitaryCredit());
        customerManager.giveCredit(); 
    }
}
package Customers;

import Creditwork.IcredManager;

public class CustomerManager {

    private  Customer customer;
    private IcredManager icredManager;


    public CustomerManager(Customer customer, IcredManager icredManager) {
        this.customer = customer;
        this.icredManager = icredManager;
    }

    public void giveCredit(){
        icredManager.calculate();
        System.out.println("Kredi verildi");
    }
}

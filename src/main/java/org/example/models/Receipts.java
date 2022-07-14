package org.example.models;

import org.example.customer.Customers;

public class Receipts {
    public static void dispenseReceipt(Customers customerName, String name, Integer price, Integer quantity){
        System.out.println("..................................................");
        System.out.println(customerName.getName() + ": Your order " + quantity + " " + name + " was purchased at " + (price * quantity));
        System.out.println("Thanks for patronizing us.");
    }
}

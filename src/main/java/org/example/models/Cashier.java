package org.example.models;

import org.example.enums.Level;


import java.util.LinkedList;
import java.util.List;

public class Cashier extends Staff{

    public Cashier(String name, String qualification, Integer age, String phoneNumber, Address houseAddress, String email, Level staffLevel) {
        super(name, qualification, age, phoneNumber, houseAddress, email, staffLevel);
    }



    public static void sell(Store store, LinkedList<CustomerOrder> customerOrderList )  {
        List<Products> productsList = ReadExcel.reader();
        LinkedList<CustomerOrder> newCustomerOrderList  = store.getNewCustomerOrderList();
        for (CustomerOrder customerOrder : newCustomerOrderList) {
            for (Products products : productsList) {
                if (!(products.getProductName().equals(customerOrder.getProductName()))) {
                    continue;
                } else if (products.getProductName().equals(customerOrder.getProductName())) {
                    if (products.getQuantity() < customerOrder.getQuantity()) {
                        System.out.println("OUT OF STOCK!!!");
                    } else if (products.getQuantity() > 0) {
                        products.setQuantity(products.getQuantity() - customerOrder.getQuantity());
                        Receipts.dispenseReceipt(customerOrder.getCustomerName(), products.getProductName(), products.getPrice(), customerOrder.getQuantity());
                    }
                }
            }
        }

    }

}

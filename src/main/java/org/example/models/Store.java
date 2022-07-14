package org.example.models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Store {
    private static List<Products> productsList = ReadExcel.reader();

    private static LinkedList<CustomerOrder> customerOrderList = new LinkedList<>();

    private LinkedList<CustomerOrder> newCustomerOrderList = new LinkedList<>();

    public Store() {

    }


    public LinkedList<CustomerOrder> getNewCustomerOrderList() {
        return newCustomerOrderList;
    }

    public void setNewCustomerOrderList(LinkedList<CustomerOrder> newCustomerOrderList) {
        this.newCustomerOrderList = newCustomerOrderList;
    }

    public Store(LinkedList<CustomerOrder> customerPurchase) {
        customerOrderList = customerPurchase;
    }

    public LinkedList<CustomerOrder> getCustomerOrderList() {
        return customerOrderList;
    }

    public void setCustomerOrderList(LinkedList<CustomerOrder> customerOrderList) {
        Store.customerOrderList = customerOrderList;
    }

    public static List<Products> getProductsList() {
        return productsList;
    }

    public Store(List<Products> productsList) {
        this.productsList = productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }


}

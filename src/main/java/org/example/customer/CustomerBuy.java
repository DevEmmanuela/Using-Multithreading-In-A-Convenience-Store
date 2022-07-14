package org.example.customer;

import org.example.models.Store;

import java.io.IOException;


public interface CustomerBuy {

    void buy(Store store, String productName, int quantity) throws IOException;


}

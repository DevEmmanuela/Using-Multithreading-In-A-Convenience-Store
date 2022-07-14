package org.example.models;

import org.example.customer.Customers;

import static org.junit.jupiter.api.Assertions.*;

class SalesThreadTest {

    @org.junit.jupiter.api.Test
    void sell() {
        Customers customer = new Customers();
        customer.setName("Peace");
        customer.setPhoneNumber("12345");
        customer.setEmailAddress("peace@gmail.com");

        Customers customer2 = new Customers();
        customer2.setName("Uchechi");
        customer2.setPhoneNumber("6790");
        customer2.setEmailAddress("uchechi@gmail.com");

        Customers customer3 = new Customers();
        customer3.setName("Enoch");
        customer3.setPhoneNumber("43527");
        customer3.setEmailAddress("enoch@gmail.com");


        CustomerOrder customerOrder1 = new CustomerOrder(customer, "Lettuce", 11);
        CustomerOrder customerOrder2 = new CustomerOrder(customer2, "Chocolate", 6);
        CustomerOrder customerOrder3 = new CustomerOrder(customer3, "Television", 4);

        SalesThread salesThread1 = new SalesThread(customerOrder1);
        SalesThread salesThread2 = new SalesThread(customerOrder2);
        SalesThread salesThread3 = new SalesThread(customerOrder3);

        assertFalse(salesThread1.sell());
        assertTrue(salesThread2.sell());
        assertTrue(salesThread3.sell());

    }
}
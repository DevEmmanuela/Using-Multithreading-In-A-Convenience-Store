package org.example;
import org.example.Exceptions.ThreadSleepNotWorkingException;
import org.example.models.*;
import org.example.customer.Customers;

public class Main {
    public static void main(String[] args) {
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


        CustomerOrder customerOrder1 = new CustomerOrder(customer, "Lettuce", 4);
        CustomerOrder customerOrder2 = new CustomerOrder(customer2, "Chocolate", 6);
        CustomerOrder customerOrder3 = new CustomerOrder(customer3, "Television", 4);

        Thread firstCustomerThread = new Thread(new SalesThread(customerOrder1));
        Thread secondCustomerThread = new Thread(new SalesThread(customerOrder2));
        Thread thirdCustomerThread = new Thread(new SalesThread(customerOrder3));


        firstCustomerThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new ThreadSleepNotWorkingException("Thread.sleep not working");
        }

        secondCustomerThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new ThreadSleepNotWorkingException("Thread.sleep not working");
        }

        thirdCustomerThread.start();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new ThreadSleepNotWorkingException("Thread.sleep not working");
//        }











    }
}
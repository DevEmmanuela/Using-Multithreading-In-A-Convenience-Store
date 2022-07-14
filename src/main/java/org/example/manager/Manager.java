package org.example.manager;

import org.example.enums.Level;
import org.example.manager.ManagerServices;
import org.example.models.*;

import java.util.List;

public class Manager extends Staff implements ManagerServices {





    public Manager(String name, String qualification, Integer age, String phoneNumber, Address houseAddress, String email, Level staffLevel) {
        super(name, qualification, age, phoneNumber, houseAddress, email, staffLevel);
    }


    public Manager() {
//        super();
    }

    @Override
    public void hire(Applicant newCashier, String qualified, String qualified2, String qualified3, Integer age) {
        if (!super.getStaffLevel().equals(Level.MANAGEMENTSTAFF)){
            System.out.println("only management staff can hire!");
        } else if ((newCashier.getQualification().equals(qualified) || newCashier.getQualification().equals(qualified2) || newCashier.getQualification().equals(qualified3))
                && (newCashier.getAge() >= 18)){
            System.out.println(newCashier.getName("Emmanuela") +" "+ "is hired as a cashier");
        } else {
            System.out.println(newCashier.getName("Emmanuela") +" "+ "does not qualify to be a cashier");
        }
    }


    @Override
    public void update(Store store, Products products) {
        List<Products> productsList1 = store.getProductsList();
        productsList1.add(products);

    }
}

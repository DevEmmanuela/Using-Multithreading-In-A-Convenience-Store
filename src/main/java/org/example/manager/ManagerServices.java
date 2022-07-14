package org.example.manager;

import org.example.models.Applicant;
import org.example.models.Products;
import org.example.models.Store;

public interface ManagerServices {
    void hire(Applicant newCashier, String qualified, String qualified2, String qualified3, Integer age);

    void update(Store store, Products products);
}

package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class SalesThread implements Runnable {

    private CustomerOrder customerOrder;

    public boolean sell(){
        for(int i = 0; i < Store.getProductsList().size(); i++){
            if(Store.getProductsList().get(i).getProductName().equals(customerOrder.getProductName())){
                if(Store.getProductsList().get(i).getQuantity() < customerOrder.getQuantity()){
                    System.out.println("Out Of Stock");
                    return false;
                } else {
                    Store.getProductsList().get(i).setQuantity(Store.getProductsList().get(i).getQuantity() - customerOrder.getQuantity());
                    Receipts.dispenseReceipt(customerOrder.getCustomerName(), Store.getProductsList().get(i).getProductName(),Store.getProductsList().get(i).getPrice(), customerOrder.getQuantity());
                }
            }
        }
        return true;
    }


    @Override
    public  void run() {

        sell();
    }
}

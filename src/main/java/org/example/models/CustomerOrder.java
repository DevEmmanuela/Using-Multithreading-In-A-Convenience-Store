package org.example.models;

import org.example.customer.Customers;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class CustomerOrder implements Comparable<CustomerOrder>{

    private Customers customerName;
    private String productName;
    private int quantity;


    @Override
    public int compareTo(CustomerOrder o) {
        if(o.productName != this.productName){
            return 1;
        }
        else{

            if (o.quantity > this.quantity){
                return 1;
            }
            else if (o.quantity == this.quantity){
                return 1;
            }
            else {
                return -1;
            }
        }
    }

}

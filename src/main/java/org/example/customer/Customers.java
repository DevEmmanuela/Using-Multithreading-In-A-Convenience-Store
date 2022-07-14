package org.example.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Customers {
    private String name;
    private String phoneNumber;
    private String emailAddress;


}

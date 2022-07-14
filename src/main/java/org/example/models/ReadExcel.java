package org.example.models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadExcel {

    public static final String delimiter = ",";
    static String fileRead = "src/main/resources/Supermarket.csv";
    public static List<Products> reader(){
//        Store store = new Store();
        List<Products> productsList = new ArrayList<>();

        try{
            File file = new File(fileRead);
            FileReader fr = new FileReader(file);
            BufferedReader bufferedRead = new BufferedReader(fr);
            String line;
            String[] tempProducts;
            boolean first = true;
            while ((line = bufferedRead.readLine()) != null) {
                tempProducts = line.split(delimiter);
                if (first){
                    first=false;
                    continue;
                }
                    Products products = new Products();
                    products.setProductId(Integer.valueOf(tempProducts[0]));
                    products.setProductCategory(tempProducts[1]);
                    products.setProductName(tempProducts[2]);
                    products.setPrice(Integer.valueOf(tempProducts[3]));
                    products.setQuantity(Integer.valueOf(tempProducts[4]));

                    productsList.add((products));
            }
            bufferedRead.close();


        }
        catch (IOException e){
            System.out.println("File not found");
        }
        return productsList;
    }
}

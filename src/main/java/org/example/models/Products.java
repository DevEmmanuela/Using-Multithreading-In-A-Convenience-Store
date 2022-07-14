package org.example.models;

public class Products {
    //Product ID,Product Category,Products,Price,Quantity

    private Integer productId;
    private String productCategory;
    private String productName;
    private Integer price;
    private Integer quantity;


    public Products() {
    }

    public Products(Integer productId, String productCategory, String productName, Integer price, Integer quantity) {
        this.productId = productId;
        this.productCategory = productCategory;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", productCategory='" + productCategory + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }



    public String getProductName() {
        return productName;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}

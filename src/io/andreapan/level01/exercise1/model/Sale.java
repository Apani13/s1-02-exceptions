package io.andreapan.level01.exercise1.model;

import io.andreapan.level01.exercise1.exceptions.EmptySaleException;

import java.util.ArrayList;

public class Sale {

    private ArrayList<Product> products;
    private double totalSalePrice;


    public Sale() {
        this.products = new ArrayList<Product>();
        this.totalSalePrice = 0;
    }


    public void addProduct(Product product) {
        products.add(product);
    }


    public ArrayList<Product> getProducts() {
        return products;
    }

    public void calculateTotalPrice() throws EmptySaleException {

        if (products.isEmpty()) {

            throw new EmptySaleException();

        } else {

            double totalPrice = 0;

            for (Product product : products) {

                 totalPrice += product.getProductPrice();

            }

            this.totalSalePrice = totalPrice;

        }

    }

}

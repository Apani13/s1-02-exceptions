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

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public double getTotalSalePrice() {
        return this.totalSalePrice;
    }

    public void addProduct(Product product) {
        products.add(product);
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

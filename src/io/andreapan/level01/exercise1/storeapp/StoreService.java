package io.andreapan.level01.exercise1.storeapp;

import io.andreapan.level01.exercise1.exceptions.EmptySaleException;
import io.andreapan.level01.exercise1.model.Product;
import io.andreapan.level01.exercise1.model.Sale;

public class StoreService {

    private final Sale sale;

    public StoreService(Sale sale) {
        this.sale = sale;
    }

    public String checkEmptyArray() {
        String message = "";

        try {
            sale.calculateTotalPrice();
            message = "Total price of sale: " + sale.getTotalSalePrice() + " €";

        } catch (EmptySaleException e) {

            message = "Empty Sale Exception: " + e.getMessage();

        }

        return message;
    }

    public String checkIndexOutOfBounds(int index) {

        String message = "";

        try {
            Product product = sale.getProducts().get(index);
            message = "Product found at position " + index + " of array: " + product.getProductName();

        } catch (IndexOutOfBoundsException e) {

            message = "Index out of bounds exception: " + e.getMessage();
        }

        return message;
    }



}
